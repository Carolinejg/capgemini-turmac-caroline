package com.br.orientacao.desafio.atividade_produtos.entity;


public class Produto {
	protected String name;
	protected double valor;
	
	
	public Produto(String name, double valor) {
		this.name = name;
		this.valor = valor;
	}
	
	public Produto() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Produto [name=" + name + ", valor=" + valor + "]";
	}
	
	
	
	
	
	
		
	

}
