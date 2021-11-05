package com.br.orientacao.desafio;

public class Paciente {
	private String nome;
	private int codigo ;
	private String sobrenome ;
	private int idade ;
	private char sexo;
	private int telefone ;
	private String endereco;
	
	public Paciente(String nome, int codigo, String sobrenome, int idade, char sexo, int telefone, String endereco) {
		this.nome = nome;
		this.codigo = codigo;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	} 
	
	public void remarcarConsulta(Dentista dentista) {
		//faz alguma coisa
	}
	public void cancelarConsulta(Dentista dentista) {
		//faz alguma coisa
	}
		

}
