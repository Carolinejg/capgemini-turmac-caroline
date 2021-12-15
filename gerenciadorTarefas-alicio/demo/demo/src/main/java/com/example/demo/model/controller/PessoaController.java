package com.example.demo.model.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;
import com.example.demo.model.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> listarTudo() {
        return repository.findAll();
    }
    
    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa p) {
    	return repository.save(p);
    }
    
    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable Long id) {
    	Optional<Pessoa> pessoaPesquisada = repository.findById(id);
    	if(pessoaPesquisada.isPresent()) {
    		return repository.getById(id);
    	}
    	return null;
    }
    
}