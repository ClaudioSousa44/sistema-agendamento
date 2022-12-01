package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {
		Integer a = 5;
		
		Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologia");
		e1.setDescricao("Cuida do coração");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Gastro");
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida dos ossos e dos músculos");
		
		Especialidade e4 = new Especialidade();
		e4.setNome("Clínico geral");
		e4.setDescricao("Sabe de tudo um pouco");
		
		
//		Especialidade especialidades[] = {
//				e1,
//				e2,
//				e3,
//				e4
//		};
		
		
		Especialidade e5 = new Especialidade();
		e5.setNome("pediatio");
		e5.setDescricao("Cuidade de criança");
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		especialidades.add(e1);
		especialidades.add(e3);
		especialidades.add(e2);
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(12);
		notas.add(25);
		notas.add(12);
		
		System.out.println(notas.size());
		
		
		notas.add(28);
		notas.add(9);
		
		
		System.out.println(notas.size());
		
		System.out.println(especialidades.get(3).getNome());
		
		especialidades.get(1).setNome("teste");
		System.out.println(especialidades.get(1).getNome());
		
		
		

	}

}
