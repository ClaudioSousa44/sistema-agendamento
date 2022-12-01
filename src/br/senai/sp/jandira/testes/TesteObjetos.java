package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO.EspecialidadesDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;

public class TesteObjetos {

    public static void main(String[] args) {
        
        int[] a = {6, 9, 87, 35, 96};
        
        
    
       
        System.out.println("***********************************************************");
        Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologia");
        e1.setDescricao("Cuida do coração");
        
        EspecialidadesDAO.gravar(e1);

        Especialidade e2 = new Especialidade();
        e2.setNome("Gastro");
        
        EspecialidadesDAO.gravar(e2);
        
        
        for(Especialidade ee : EspecialidadesDAO.getEspecialidades()){
            System.out.println(ee.getNome());
        }

        Especialidade e3 = new Especialidade();
        e3.setNome("qualquer coisa");
        
        
        
        
        System.out.println(Especialidade.getContador());
        System.out.println(e1.getCodigo() + " - " + e1.getNome());
        System.out.println(e2.getCodigo() + " - " + e2.getNome());
        System.out.println(e3.getCodigo() + " - " + e3.getNome());


        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);

        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        System.out.println("_---------------forEach------------------");

        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        PlanoDeSaude pds1 = new PlanoDeSaude();
        pds1.setOperadora("Amil");

        PlanoDeSaude pds2 = new PlanoDeSaude();
        pds2.setOperadora("Unimed");

        PlanoDeSaude pds3 = new PlanoDeSaude();
        pds3.setOperadora("Porto Seguro");

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
        planosDeSaude.add(pds1);
        planosDeSaude.add(pds2);
        planosDeSaude.add(pds3);

        for (PlanoDeSaude p : planosDeSaude) {
            System.out.println(p.getOperadora());
        }

      

        AgendaApp.main(args);

        
        
        System.out.println("--------------------------------TEste----------------------");
        
        
        System.out.println("----------------------BUSCA------------");
        Especialidade procurada = EspecialidadesDAO.getEspecialidade(102);
        System.out.println(procurada.getNome());
        
        
        
        

    }

}
