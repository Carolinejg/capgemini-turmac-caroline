package com.br.orientacao.desafio.atividade_produtos.dao;

import com.br.orientacao.desafio.atividade_produtos.entity.ProdutoImportado;

public class ProdutoImportadoDAO {
	
	//obs: n�o entendi a finalidade desse metodo aqui, mas como estava no modelo deixei
	public String preco(ProdutoImportado produto) {
		String preco = Double.toString(produto.getValor());
		return "Pre�o bruto: "+preco;
		
	}
	
	public double precoTotal(ProdutoImportado produto) {
		double preco = produto.getValor()+produto.getTaxaAlfandegaria();
		return preco;
		
	}

	

}
