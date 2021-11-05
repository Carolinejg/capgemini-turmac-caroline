package com.br.orientacao.desafio.heranca_construtor_sobrecarga;

public class Programador extends Pessoa {
	private String linguagemTextual;

	public Programador(String nome, int idade,String linguagemTextual) {
		super(nome,idade);
		this.linguagemTextual=linguagemTextual;
	}
	
	public String getLinguagemTextual() {
		return linguagemTextual;
	}
	
	@Override
	public String showInfo() {
		return "teste";
        		
	}
	
	

	
	

}
