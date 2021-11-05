package exercicio.resolvido.caroline_souza;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[]args) {
		/*
		 * Algoritmo que leia dois valores x y e criar uma matriz com linha x 
		 * e coluna y e imprimir os valores dos elementos
		 */
		
		  Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int y = sc.nextInt();

	        int[][] matriz = new int[x][y];

	        for(int i=0; i<x; i++){ // coluna
	            for (int j=0; j<y; j++){ //linha
	                matriz[i][j]= sc.nextInt();
	            }
	        }

	        for(int i=0; i<x; i++){
	            for (int j=0; j<y; j++){
	                System.out.println(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	}

}
