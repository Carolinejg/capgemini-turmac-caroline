package com.br.orientacao.desafio.abstracao;

public abstract class Livro {
	String nome;
	
	public abstract String pegaTitulo();

	public Livro(String nome) {
		this.nome = nome;
	}
	
}
