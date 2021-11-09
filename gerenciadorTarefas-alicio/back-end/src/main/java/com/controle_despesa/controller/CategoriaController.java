package com.controle_despesa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle_despesa.model.dto.CategoriaDTO;
import com.controle_despesa.model.entity.Categoria;
import com.controle_despesa.model.repositories.CategoriaRepository;



@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public List<CategoriaDTO>listarTudo(){
		List<Categoria>categoriaLista = repository.findAll();
		return CategoriaDTO.converter(categoriaLista);
	}
	
	@PostMapping
	public void salvar(@RequestBody Categoria categoria) {
		repository.save(categoria);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void alterar(@PathVariable Long id,@RequestBody Categoria categoria) {
		Categoria categoriaPesquisada = repository.getOne(id);//pesquisa se existe no banco
		if(categoriaPesquisada != null) {
			categoriaPesquisada.setDescricao(categoria.getDescricao());
			repository.save(categoriaPesquisada);
		}
		
	}
	

}
