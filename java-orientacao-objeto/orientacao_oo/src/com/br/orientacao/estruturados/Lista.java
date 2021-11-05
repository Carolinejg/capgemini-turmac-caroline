package com.br.orientacao.estruturados;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>listaNomes = new ArrayList<>();
		
		listaNomes.add("carol");
		listaNomes.add("joana");
		listaNomes.add("maria");
		listaNomes.add("amanda");
		
		System.out.println("Tamnho da lista: "+listaNomes.size());
		// apresenta todos os elementos 
		for(String nome: listaNomes) {
			System.out.println(nome);
		}
		/*//adiciona por posiçâo 
		System.out.println();
		listaNomes.add(1, "carlos");
		
		// apresenta todos os elementos 
		for(String nome: listaNomes) {
			System.out.println(nome);
		}
		
		//remove elementos 
		listaNomes.remove("carol");
		System.out.println();
		for(String nome: listaNomes) {
			System.out.println(nome);
		}
		
		//remove por posição 
		listaNomes.remove(2);
		for(String nome: listaNomes) {
			System.out.println(nome);
		}
		
		//pega o indez(indice do elemento) 
		System.out.println();
		System.out.println();
		System.out.println("Indice da Joana "+ listaNomes.indexOf("joana"));*/
		
		//excluir se achar na primeira letra o nome A
		// listaNomes.removeIf(x->x.charAt(0) == 'a');
		
		/*System.out.println();
		System.out.println("Após o remove if");
		for(String nome: listaNomes) {
			System.out.println(nome);
		}*/
		
		//filtro em cima da lista
		// .collect(Collectors.toList()); converte novamente para o tipo List
		List<String>resultado = listaNomes.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		System.out.println();
		System.out.println("***********");
		System.out.println("Resutlado do filtro");
		for(String nome: resultado) {
			System.out.println(nome);
		}
		
		
		
	}

}
