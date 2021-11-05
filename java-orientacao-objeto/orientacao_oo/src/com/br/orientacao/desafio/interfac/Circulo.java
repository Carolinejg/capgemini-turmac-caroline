package com.br.orientacao.desafio.interfac;


public class Circulo implements Forma{
	private double raio;
	
	//a = π x r2"
	
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		
		return Math.PI*Math.pow(raio,2);
	}




	

}
