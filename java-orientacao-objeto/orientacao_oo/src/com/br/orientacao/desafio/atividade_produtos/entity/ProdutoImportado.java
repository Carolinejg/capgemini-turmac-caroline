package com.br.orientacao.desafio.atividade_produtos.entity;


public class ProdutoImportado extends Produto{
	private double taxaAlfandegaria;

	public ProdutoImportado(String name, Double valor) {
		super(name, valor);
		this.taxaAlfandegaria=100;
		
	}
	public ProdutoImportado() {
		
		
	}

	public double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	@Override
	public String toString() {
		return "ProdutoImportado [taxaAlfandegaria=" + taxaAlfandegaria + ", name=" + name + ", valor bruto=" + valor + "]";
	}

	
	
	
	
	

}
