package com.br.orientacao.desafio.heranca_construtor_sobrecarga;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		String nome=src.next();
		int idade = src.nextInt();
		String linguagem = src.next();
		
		Programador a = new Programador(nome,idade,linguagem);
		
		
		System.out.println(a.getNome());
		System.out.println(a.getIdade());
		System.out.println(a.getLinguagemTextual());
		System.out.println(a.showInfo());
	

	}

}
