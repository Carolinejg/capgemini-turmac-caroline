package com.br.orientacao.desafio.atividade_produtos.dao;



import com.br.orientacao.desafio.atividade_produtos.entity.ProdutoUsado;

public class ProdutoUsadoDAO {
	
	public String preco(ProdutoUsado produto) {
		String preco = Double.toString(produto.getValor());
		return preco;
		
	}
	

	


}
