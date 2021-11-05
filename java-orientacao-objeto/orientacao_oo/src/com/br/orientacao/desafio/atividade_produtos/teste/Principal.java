package com.br.orientacao.desafio.atividade_produtos.teste;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import com.br.orientacao.desafio.atividade_produtos.dao.ProdutoImportadoDAO;
import com.br.orientacao.desafio.atividade_produtos.dao.ProdutoUsadoDAO;
import com.br.orientacao.desafio.atividade_produtos.entity.Produto;
import com.br.orientacao.desafio.atividade_produtos.entity.ProdutoImportado;
import com.br.orientacao.desafio.atividade_produtos.entity.ProdutoUsado;
import com.br.orientacao.model.dao.ProdutoDAO;

public class Principal {

	public static void main(String[] args) throws ParseException {
		//Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("1 - Produto importado?\n");
			System.out.println("2- Produto Usado?\n");
			System.out.println("3- Sair\n");
			int num = src.nextInt();
			int N;
			switch (num) {
		     case 1:
		    	ProdutoImportado produto = new ProdutoImportado();
				ProdutoImportadoDAO produtoDAO = new ProdutoImportadoDAO();
		    	ArrayList<ProdutoImportado> produtos = new ArrayList<>();
		    	System.out.println("Quantos produtos\n");
		    	N = src.nextInt();
		    	for(int i = 0; i < N; i++) {
		    		System.out.println("Nome\n");
		    		String nome = src.next();
		    		System.out.println("Valor\n");
		    		double valor = src.nextDouble();
		    		produto = new ProdutoImportado(nome,valor);
		    		produtoDAO.precoTotal(produto);
		    		produtos.add(produto);
		    	}
		    	for(int i = 0; i < produtos.size(); i++) {
		    		System.out.println(produtos.get(i).toString()+ " valor total: "+ produtoDAO.precoTotal(produtos.get(i)));
		    		
		    	}
		      	break;
		     case 2:
		    	 ProdutoUsado produtoUsado = new ProdutoUsado();
		    	 ArrayList<ProdutoUsado> produtosUsados = new ArrayList<>();
		    	 ProdutoUsadoDAO produtoUsadoDAO = new ProdutoUsadoDAO();
		    	 System.out.println("Quantos produtos\n");
		    	 N = src.nextInt();
		    	 for(int i = 0; i < N; i++) {
		    		System.out.println("Nome\n");
		    		String nome = src.next();
		    		System.out.println("Valor\n");
		    		double valor = src.nextDouble();
		    		System.out.println("Data\n");
		    		String dataRecebida = src.nextLine();
		    		dataRecebida = src.nextLine();
		    		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		    		java.util.Date dataFormatada = formato.parse(dataRecebida);
		    		produtoUsado = new ProdutoUsado(nome,valor,dataFormatada);
		    		produtoUsadoDAO.preco(produtoUsado);
		    		produtosUsados.add(produtoUsado);
		    		
		    	    
		    	}
		    	for(int i = 0; i < produtosUsados.size(); i++) {
		    		System.out.println(produtosUsados.get(i).toString());
		    		
		    	}
		    	 
		       break;
		     case 3:
		    	 System.out.print("\nAté logo!");
		    	 System.exit(0);
		    	 src.close();
		    	 
		       break;
		     default:
		       System.out.println("Número inválido");
			}
	
	  }
	}

}
