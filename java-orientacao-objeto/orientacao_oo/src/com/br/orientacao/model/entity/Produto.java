package com.br.orientacao.model.entity;

public class Produto {
	 private int codigoProduto;
	 private String descricaoProduto;
	 private Double precoProduto;
	 
	 
	public Produto(String descricaoProduto, Double precoProduto) {
		this.descricaoProduto = descricaoProduto;
		this.precoProduto = precoProduto;
	}
	
	
	public Produto(int codigoProduto, String descricaoProduto, Double precoProduto) {
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.precoProduto = precoProduto;
	}


	public Produto() {
		
	}


	public int getCodigoProduto() {
		return codigoProduto;
	}


	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}


	public String getDescricaoProduto() {
		return descricaoProduto;
	}


	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}


	public Double getPrecoProduto() {
		return precoProduto;
	}


	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}


	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", descricaoProduto=" + descricaoProduto + ", precoProduto="
				+ precoProduto + "]";
	}
	
	
	 
	 
}
