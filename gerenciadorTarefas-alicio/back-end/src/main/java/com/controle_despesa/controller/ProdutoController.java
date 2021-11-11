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

import com.controle_despesa.model.dto.ProdutoDTO;
import com.controle_despesa.model.entity.Produto;
import com.controle_despesa.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repository;
	
	@PostMapping
	public void salvar(@RequestBody Produto produto) {
		repository.save(produto);
	}
	
	@GetMapping
	public List<ProdutoDTO>listarTudo(){
		List<Produto>produtoLista = repository.findAll();
		return ProdutoDTO.converter(produtoLista);
	}
	
	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void alterar(@PathVariable Long id,@RequestBody Produto produto) {
		Produto produtoPesquisada = repository.getOne(id);//pesquisa se existe no banco
		if(produtoPesquisada != null) {
			produtoPesquisada.setDescricao(produto.getDescricao());
			produtoPesquisada.setUnidadeMedida(produto.getUnidadeMedida());
			produtoPesquisada.setValorUnitario(produto.getValorUnitario());
			produtoPesquisada.setStatus(produto.isStatus());
			repository.save(produtoPesquisada);
		}
		
	}
	

}
