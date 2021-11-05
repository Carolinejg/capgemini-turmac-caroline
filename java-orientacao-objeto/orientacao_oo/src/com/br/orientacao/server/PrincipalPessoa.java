package com.br.orientacao.server;

import java.util.Scanner;

import com.br.orientacao.model.entity.Pessoa;

public class PrincipalPessoa {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int idade = sr.nextInt();
		Pessoa p= new Pessoa(idade);
		
		System.out.println("Nome");
        System.out.println("Idade");
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        
        sr.close();

	}

}
