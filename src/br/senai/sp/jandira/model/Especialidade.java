package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private String descricao;

    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();

    }

    public Especialidade() {
        gerarCodigo();

    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();

    }
    
     public Especialidade(String nome, String descricao, Integer codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo;

    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;

    }

    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    nome + " Não é um nome válido" + "\n O nome da especialidade deve ter pelo menos 3 letras",
                    "Erro",
                    JOptionPane.OK_OPTION);
        }

    }

    ;
	
	public String getNome() {
        return nome;
    }
        
        public String toString(){
            return this.nome;
        }

    ;
	
	public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(
                    null, 
                    "A descrição é muito pequena",
                    "Erro",
                    JOptionPane.OK_OPTION);
        }
    }

    
	
	public String getDescricao() {
        return descricao;
    }

        public String getEspecialidadeSeparaPorPontoEVirgula(){
            return this.codigo + ";" + this.nome + ";" + this.descricao;
        }
        

}
