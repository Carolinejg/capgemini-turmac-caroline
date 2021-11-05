package com.br.orientacao.desafio.atividade_produtos.dao;

import com.br.orientacao.desafio.atividade_produtos.entity.ProdutoImportado;

public class ProdutoImportadoDAO {
	
	//obs: não entendi a finalidade desse metodo aqui, mas como estava no modelo deixei
	public String preco(ProdutoImportado produto) {
		String preco = Double.toString(produto.getValor());
		return "Preço bruto: "+preco;
		
	}
	
	public double precoTotal(ProdutoImportado produto) {
		double preco = produto.getValor()+produto.getTaxaAlfandegaria();
		return preco;
		
	}

	

}
