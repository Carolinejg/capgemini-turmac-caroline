package com.br.orientacao.desafio.atividade_hotel.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.br.orientacao.desafio.atividade_hotel.entity.Hotel;

public class Principal {

	public static void main(String[] args){
		Scanner src = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("1 - Cadastrar reserva\n");
			System.out.println("2- Alterar reserva\n");
			System.out.println("3- Sair\n");
			int num = src.nextInt();
			
			
			switch (num) {
		     case 1:
		    	try {
		    		System.out.println("Número do quarta\n");
			    	int numero = src.nextInt();
		    	
		    		System.out.println("Data de entrada\n");
			    	String dataEntrada = src.nextLine();
			    	dataEntrada = src.nextLine();
		    		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		    		java.util.Date dataFormatadaEntrada = formato.parse(dataEntrada);
		    		
		    		System.out.println("Data de saída\n");
		    		String dataSaida = src.nextLine();
		    		//dataSaida = src.nextLine();
		    		SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
		    		java.util.Date dataFormatadaSaida = formato2.parse(dataSaida);
		    		
		    		Hotel hotel = new Hotel(numero,dataFormatadaEntrada,dataFormatadaSaida);
		    		System.out.println(hotel.toString());
		    		
		    		
		    	}catch(java.util.InputMismatchException e) {
		    		System.out.println("Erro de entrada de dados");
		    		
		    	}
		    	catch(ParseException e) {
		    		System.out.println("Erro de parse");
		    	}
		    	
		    	break;
		      	
		     case 2:
		    	 
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
