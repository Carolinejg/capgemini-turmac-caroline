package com.br.orientacao.desafio;

public class Dentista {
	private String nome;
	private String sobrenome;
	private String especialidade;
	private int registro;
	private boolean ativo;
	
	
	public Dentista(String nome, String sobrenome, String especialidade, int registro, boolean ativo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.especialidade = especialidade;
		this.registro = registro;
		this.ativo = ativo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void atenderPaciente(Paciente paciente) {
		//faz alguma coisa
	}
	
	public void marcarConsulta(Paciente paciente) {
		//faz alguma coisa
	}
	public void remarcarConsulta(Paciente paciente) {
		//faz alguma coisa
	}
	public void cancelarConsulta(Paciente paciente) {
		//faz alguma coisa
	}
	public boolean disponivel() {
		//faz alguma coisa
		
		return true;
	}
	
	
}
