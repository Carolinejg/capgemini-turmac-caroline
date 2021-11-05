package com.br.orientacao.desafio.atividade_conta.teste;

import java.util.Locale;
import java.util.Scanner;

import com.br.orientacao.desafio.atividade_conta.dao.ContaDAO;
import com.br.orientacao.desafio.atividade_conta.entity.Conta;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		Conta conta= new Conta();
		ContaDAO contaDAO = new ContaDAO();
		
		
		  while(true) {
			System.out.println();
			System.out.println("1 - Cadastrar conta\n");
			System.out.println("2- Alterar nome\n");
			System.out.println("3- Deposito\n");
			System.out.println("4- Sacar\n");
			System.out.println("5- Sair\n");
			int num = src.nextInt();
			
			switch (num) {
		     case 1:
		      
		       System.out.println("Número da conta\n");
				int numero= src.nextInt();
				System.out.println("Nome do titular\n");
				String nome = src.next();
				System.out.println("Deseja depositar um valor inicial?\n");
				System.out.println("1 - Sim\n");
				System.out.println("2 - Não\n");
				int opcao = src.nextInt();
				
				if(opcao == 1) {
					System.out.println("Valor a ser depositado\n");
					double valor = src.nextDouble();
					 conta = new Conta(numero,nome,valor);
					System.out.println(conta.toString());
				}else {
					conta = new Conta(numero,nome);
					System.out.println(conta.toString());
				}
				
		       break;
		     case 2:
		    	 System.out.println("Novo nome\n");
		    	 String nomeNovo = src.next();
		    	 contaDAO.alterarNome(conta, nomeNovo);
		    	 System.out.println(conta.toString());
		    	 
		       break;
		     case 3:
		       System.out.println("Informe o número da conta");
		       int numConta = src.nextInt();
		       if(numConta != conta.getNumero()) {
		    	   System.out.println("Número da conta inválido, tente novemente\n");
		       }else {
		    	   System.out.println("Quanto deseja depositar\n ");
		    	   double deposito = src.nextDouble();
		    	   System.out.println(contaDAO.depositar(conta, deposito));
		       }
		       
		       break;
		     case 4:
			       System.out.println("Informe o valor a ser sacado\n");
			       double saque = src.nextDouble();
			       System.out.println(contaDAO.sacar(conta, saque));
			       
			       break;
		     case 5:
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
