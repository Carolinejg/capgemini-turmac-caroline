package com.controle_despesa.model.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.controle_despesa.model.entity.Produto;

import lombok.Getter;

@Getter
public class ProdutoDTO {
	private String descricao;
	private String unidadeMedida;
	private double valorUnitario;
	private boolean status;

	public ProdutoDTO(Produto produto) {
		this.descricao = produto.getDescricao();
		this.unidadeMedida = produto.getUnidadeMedida();
		this.valorUnitario = produto.getValorUnitario();
		this.status = produto.isStatus();
	}
	
	public static List<ProdutoDTO>converter(List<Produto>produto){
		return produto.stream().map(ProdutoDTO::new).collect(Collectors.toList());
	}

}
