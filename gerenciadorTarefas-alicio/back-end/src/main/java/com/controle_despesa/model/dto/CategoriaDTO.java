package com.controle_despesa.model.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.controle_despesa.model.entity.Categoria;

import lombok.Getter;

@Getter
public class CategoriaDTO {
	//não usa atributos do tipo complexo
	private String descricao;
	
	public CategoriaDTO(Categoria categoria) {
		this.descricao = categoria.getDescricao();
	}
	
	public static List<CategoriaDTO>converter(List<Categoria>categorias){
		return categorias.stream().map(CategoriaDTO::new).collect(Collectors.toList());
	}
  
}
