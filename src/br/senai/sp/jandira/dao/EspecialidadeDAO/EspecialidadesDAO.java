package br.senai.sp.jandira.dao.EspecialidadeDAO;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesDAO {

    private final static String URL
//            = "C:\\Users\\22282470\\java-armazenamento\\Especialidade.txt";
             = "C:\\Users\\cauhs\\Desktop\\trabalhoSenai\\java-armazenamento\\Especialidade.txt" ;
    
    private final static String URL_TEMP
//            = "C:\\Users\\22282470\\java-armazenamento\\Especialidade-temp.txt";
    = "C:\\Users\\cauhs\\Desktop\\trabalhoSenai\\java-armazenamento\\Especialidade-temp.txt" ;
      

    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) {// create
        especialidades.add(e);

        //*** Gravar em arquivo ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "ocorreu um erro");
        }

    }

    public static ArrayList<Especialidade> getEspecialidades() {//read
        return especialidades;

    }

    public static Especialidade getEspecialidade(Integer codigo) {//read
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {//update

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidadeAtualizada.getCodigo()) ) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }

        }
        atualizarArquivo();

    }

    public static void excluir(Integer codigo) {//delete

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
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
            for(Especialidade e : especialidades){
                bwTemp.write(e.getEspecialidadeSeparaPorPontoEVirgula());
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

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                //guardar a especialidade na lista
                especialidades.add(e);

                //Ler a próxima linha
                linha = leitor.readLine();

            }

            leitor.close();

        } catch (IOException erro) {

            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getTabelaEspecialidades() {

        String[] titulo = {"código", "NOME DA ESPECISLIDADES", "descrição"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();

        }

        return new DefaultTableModel(dados, titulo);

    }
    
    public static DefaultListModel<Especialidade> preencherEspecialidade(){
        DefaultListModel<Especialidade> listaEspecialidade = new  DefaultListModel<>();
        for(Especialidade listar : getEspecialidades()){
           
            listaEspecialidade.addElement( listar);
            listaEspecialidade.toString();
           
            
        }
             
    return listaEspecialidade;
}
    
    
  

}
