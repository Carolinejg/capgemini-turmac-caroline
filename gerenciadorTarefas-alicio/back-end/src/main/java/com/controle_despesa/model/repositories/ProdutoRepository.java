package com.controle_despesa.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle_despesa.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
