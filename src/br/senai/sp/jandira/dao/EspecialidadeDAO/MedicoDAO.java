package br.senai.sp.jandira.dao.EspecialidadeDAO;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;

public class MedicoDAO {

    private final static String URL
//            = "C:\\Users\\22282470\\java-armazenamento\\Medico.txt";
      = "C:\\Users\\cauhs\\Desktop\\trabalhoSenai\\java-armazenamento\\Medico.txt" ;
    
    private final static String URL_TEMP
//            = "C:\\Users\\22282470\\java-armazenamento\\Medico-temp.txt";
    = "C:\\Users\\cauhs\\Desktop\\trabalhoSenai\\java-armazenamento\\Medico-temp.txt" ;
    

    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static void gravar(Medico m) {// Create
        medicos.add(m);

        //*** Gravar em arquivo ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "ocorreu um erro");
        }
    }

    public static ArrayList<Medico> getMedicos() {//read
        return medicos;
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }

        return null;
    }

    public static void atualizar(Medico medicoAtt) {

        for (Medico m : medicos) {
            if (m.getCodigo().equals(medicoAtt.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtt);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) {//delete

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }

        atualizarArquivo();

    }

    private static void atualizarArquivo() {

        //Passa 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporário para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na lista para adicionar especialidades 
            //no arquivo temporáio, exceto o resgitro que não queremos mais
            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();

            //Excluir o arquivo atual
            arquivoAtual.delete();

            //Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception error) {
            error.printStackTrace();
        }

    }
    
    public static ArrayList<Especialidade> separarEspecialidades(String linha) {
    	String[] vetor = linha.split(";");
    	int codigoEsp = 6;
    	
    	ArrayList<Especialidade> especialidades = new ArrayList<>();
    	
    	
    	
    	while (vetor.length > codigoEsp) {
    		especialidades.add(EspecialidadesDAO.getEspecialidade(Integer.valueOf(vetor[codigoEsp])));
    		codigoEsp++;
    	}
    	
    	return especialidades;
    }

    public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Medico m = new Medico(
                        Integer.valueOf(vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        vetor[4],
                        LocalDate.parse(vetor[5]),
                        separarEspecialidades(linha));

                //guardar a especialidade na lista
                medicos.add(m);

                //Ler a próxima linha
                linha = leitor.readLine();

            }

            leitor.close();

        } catch (IOException erro) {

            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao ler o arquivo");
        }

    }
    
    public static DefaultListModel<Especialidade> getEspModel() {

        DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
        
        try {
            
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();
            
            
            for (Especialidade e : separarEspecialidades(linha)) {
                especialidadesLista.addElement(e);
            }
            
            leitor.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro!!!");
        }
        return especialidadesLista;
    }

    public static DefaultTableModel getTabelaMedico() {
        String[] titulo = {"código", "CRM", "Nome dos médicos", "Telefone"};
        String[][] dados = new String[medicos.size()][4];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();

        }

        return new DefaultTableModel(dados, titulo);
    }

}
