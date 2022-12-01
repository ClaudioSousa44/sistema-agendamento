package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {
	private String nome;
	private LocalDate dataDeNasc;
	private String telefone;
	private Endereco endereco;
	private String rg;
	private String cpf;
	private PlanoDeSaude planoDeSaude;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNasc() {
		return dataDeNasc;
	}

	public void setDataDeNasc(LocalDate dataDeNasc) {
		this.dataDeNasc = dataDeNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

}
