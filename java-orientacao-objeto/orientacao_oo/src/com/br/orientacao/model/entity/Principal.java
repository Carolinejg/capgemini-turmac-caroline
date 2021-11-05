package com.br.orientacao.model.entity;

public class Principal {

	public static void main(String[] args) {
		
		/*Girafa g3 = new Girafa("Girassol", "Girafa do sul","Amarela","Femea");
		System.out.println(g3.emitirSom());
		g3.setIdadeMeses(100);
		g3.morrer();
		System.out.println(g3.emitirSom());*/
		
		Morcego g = new Morcego("Girassol", "Girafa do sul","Amarela","Femea");
		//System.out.println(g.emitirSom());
		g.setIdadeMeses(100);
		g.morrer();
		System.out.println(g.emitirSom());
		System.out.println(g.isAdulto());
	}

}
