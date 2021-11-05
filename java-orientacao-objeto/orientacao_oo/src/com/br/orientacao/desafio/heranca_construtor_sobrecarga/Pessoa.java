package com.br.orientacao.desafio.heranca_construtor_sobrecarga;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String showInfo() {
		//faz alguma coisa
		return "pessoa" ;
	}

	public String getNome() {
		return nome;
	}

	
	public int getIdade() {
		return idade;
	}

		
	
}
