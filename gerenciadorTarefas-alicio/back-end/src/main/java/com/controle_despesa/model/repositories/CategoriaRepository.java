package com.controle_despesa.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle_despesa.model.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{

}
