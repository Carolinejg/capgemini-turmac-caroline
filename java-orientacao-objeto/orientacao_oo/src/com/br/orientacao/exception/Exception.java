package com.br.orientacao.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		try {
			String[] vetor = src.nextLine().split(" ");
			int posicao = src.nextInt();
			System.out.println(vetor[posicao]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicão invalida");
		}catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados");
		}
		System.out.println("Fim do programa");
		
		
		
		src.close();

	}

}
