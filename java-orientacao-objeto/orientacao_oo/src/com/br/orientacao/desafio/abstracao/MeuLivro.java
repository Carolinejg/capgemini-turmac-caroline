package com.br.orientacao.desafio.abstracao;

public class MeuLivro extends Livro{
	
	
	public MeuLivro(String nome) {
		super(nome);
		
	}
	
	@Override
	public String pegaTitulo() {
		return nome;
	}
	

}
