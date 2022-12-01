package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Medico {

    private String nome;
//    private Especialidade[] especialidade;
    private ArrayList<Especialidade> especialidade;
    private String telefone;
    private String email;
    private String crm;
    private Integer codigo;
    private static int contador = 99;
    private LocalDate dataNsc;
    
    
    public Medico(){
        gerarCodigo();
    }
    
    public Medico(Integer codigo, String crm, String nome, String telefone){
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        gerarCodigo();
    }
     public Medico(Integer codigo, String crm, String nome,
             String telefone, String email, LocalDate dataNsc, ArrayList<Especialidade> especialidade
             
//             Especialidade[] especialidade
     ){
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNsc = dataNsc;
        this.especialidade = especialidade;
        this.contador = codigo;
        gerarCodigo();
    }
     
     

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setDataNsc(LocalDate dataNsc) {
        this.dataNsc = dataNsc;
    }

    public LocalDate getDataNsc() {
        return dataNsc;
    }
    

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public Especialidade[] getEspecialidade() {
//        return especialidade;
//    }
//
//    public void setEspecialidade(Especialidade[] especialidade) {
//        this.especialidade = especialidade;
//    }

    public ArrayList<Especialidade> getEspecialidade() {
		return especialidade;
	}
    
    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
		this.especialidade = especialidade;
	}
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public String listaToString(ArrayList<Especialidade> lista) {
    	ArrayList<String> codigosEspecialidade= new ArrayList<>();
    	for(Especialidade e : lista) {
    		codigosEspecialidade.add(e.getCodigo().toString());
    	}
    	
    	return String.join(";", codigosEspecialidade);
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" 
                + this.crm + ";" 
                + this.nome + ";"
                + this.telefone + ";" 
                + this.email + ";"
                + this.dataNsc + ";" 
                + listaToString(this.especialidade)
//                + Arrays.toString(this.especialidade)
                ;
    }

}
