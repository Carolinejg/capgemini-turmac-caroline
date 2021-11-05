package com.br.orientacao.desafio.atividade_produtos.entity;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ProdutoUsado extends Produto{
	private java.util.Date dataFabricacao;

	public ProdutoUsado(String name, Double preco, java.util.Date dataFormatada) {
		super(name, preco);
		this.dataFabricacao =  dataFormatada;
		
	}
	
	public ProdutoUsado() {
		
		
	}
	
	public String getDataFabricacao() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatadaAtual = dateFormat.format(dataFabricacao);
	    return dataFormatadaAtual;
		
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String toString() {
		return "ProdutoUsado [dataFabricacao= " + getDataFabricacao() + ", name=" + name + ", valor= " + valor + "]";
	}
	
	

}
