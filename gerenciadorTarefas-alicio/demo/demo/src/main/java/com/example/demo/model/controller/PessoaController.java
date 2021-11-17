package com.example.demo.model.controller;

import com.example.demo.model.Pessoa;
import com.example.demo.model.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> listarTudo() {
        return repository.findAll();
    }
}