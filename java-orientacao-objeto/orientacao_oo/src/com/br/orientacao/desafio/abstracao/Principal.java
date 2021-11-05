package com.br.orientacao.desafio.abstracao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		String nome = src.nextLine();
		MeuLivro l = new MeuLivro(nome);
		System.out.println(l.pegaTitulo());
				
				
		src.close();

	}

}
