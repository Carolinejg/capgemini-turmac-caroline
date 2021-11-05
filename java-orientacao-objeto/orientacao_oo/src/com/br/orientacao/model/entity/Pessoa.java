package com.br.orientacao.model.entity;

public class Pessoa {
	private String nome;
	private int idade;
	
	
	public Pessoa(int idade){
		this.nome="Carol";
		this.idade=idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public int getIdade() {
		return idade;
	}

}
