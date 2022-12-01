
package br.senai.sp.jandira.dao.EspecialidadeDAO;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
     

public class PlanoDeSaudeDAO {
    
    private final static String URL = 
            "C:\\Users\\22282470\\java-armazenamento\\PlanoDeSaude.txt";
    private final static String URL_TEMP = 
            "C:\\Users\\22282470\\java-armazenamento\\PlanoDeSaude-temp.txt";
    
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude p){
        planos.add(p);
        
           //*** Gravar em arquivo ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null, 
                    "ocorreu um erro");
        }
        
    }
    
    public static ArrayList<PlanoDeSaude> getPlanos(){
        return planos;
    }
    
    public static PlanoDeSaude getPlano(Integer codigo){
        for(PlanoDeSaude p : planos){
            if(p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    
    public static void atualizar(PlanoDeSaude planoAtualizado) {
        for(PlanoDeSaude p : planos){
            if(p.getCodigo() == planoAtualizado.getCodigo()){
                planos.set(planos.indexOf(p), planoAtualizado);
            break;
            }
        }
        atualizarArquivo();
        
    }
    
    public static void excluir(Integer codigo){
        for(PlanoDeSaude p : planos){
            if(p.getCodigo() == codigo){
                planos.remove(p);
                break;
            }
        }
        atualizarArquivo();
    }
    
    private static void atualizarArquivo(){
        
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
            for(PlanoDeSaude p : planos){
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
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
    
    public static void criarListaDePlanosDeSaude(){
        
       try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(vetor[1], 
                        vetor[2], 
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]) );
                
                //guardar a especialidade na lista
                planos.add(p);
                
                //Ler a próxima linha
                linha = leitor.readLine();
                
            }
            
            leitor.close();
            
            
        } catch (IOException erro) {
            
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao ler o arquivo");
        }
       
    }
    
    public static DefaultTableModel getTabelaPlanoDeSaude(){
        
        String[] titulo ={
            "Código",
            "Operadora",
            "Categoria",
            "Número",
            "Validade"
        };
        String[][] dados = new String[planos.size()][5];
        
        for(PlanoDeSaude p : planos){
            int i = planos.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getNumero();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = p.getValidade().format(barra);
            
         
                
                
            
            
        }
        
        return new DefaultTableModel(dados,titulo);
    }
    
     
    
}
