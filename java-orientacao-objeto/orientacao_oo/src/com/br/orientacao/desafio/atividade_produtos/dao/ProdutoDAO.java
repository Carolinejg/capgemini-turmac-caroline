package com.br.orientacao.desafio.atividade_produtos.dao;

import com.br.orientacao.desafio.atividade_produtos.entity.Produto;

public class ProdutoDAO {
	
	public String preco(Produto produto) {
		String preco = Double.toString(produto.getValor());
		return preco;
		
	}

}
