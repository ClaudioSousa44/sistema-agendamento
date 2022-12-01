package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import javax.swing.JOptionPane;

public class PlanoDeSaude {

    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private static int quantidade;
    private static int contador = 99;
    private Integer codigo;

    public PlanoDeSaude() {
        this.quantidade++;
        gerarCodigo();

    }

    public PlanoDeSaude(String operadora, String categoria,
            String numero, LocalDate validade) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
        gerarCodigo();

    }
      public PlanoDeSaude(String operadora, String categoria,
            String numero, LocalDate validade, Integer codigo) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
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

    public void setOperadora(String operadora) {
        
            this.operadora = operadora;
        

    }

    ;
	
	public String getOperadora() {
        return operadora;
    }

    ;
	
	public void setCategoria(String categoria) {
        
            this.categoria = categoria;
        
          

    }

    ;
	
	public String getCategoria() {
        return categoria;
    }

    ;
	
	public void setNumero(String numero) {
        
            this.numero = numero;
        
           

    }

    ;
	
	public String getNumero() {
        return numero;
    }

    ;
	
	public void setValidade(LocalDate validade) {

        this.validade = validade;

    }

    ;
	
	public LocalDate getValidade() {

        return validade;
    }


        public String getPlanoDeSaudeSeparadoPorPontoEVirgula(){
            return this.codigo + ";" + this.operadora + ";"
                    + this.categoria + ";" + this.numero + ";" + this.validade;
        }

}
