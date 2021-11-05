package com.br.orientacao.desafio.interfac;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		double raio = src.nextDouble();
		Circulo c = new Circulo(raio);
		System.out.print("Implementei:Forma\n");
		System.out.printf("%.2f",c.area());
		src.close();

	}

}
