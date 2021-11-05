package exercicio.resolvido.caroline_souza;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[]args) {
		/*
		 * algoritmo que le N numero inteiro e armazena em vetor 
		 * mostrar os valores negativos
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		
		int tamanhoVetor = scanner.nextInt();
		
		int[] listaNumeros = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i++) {
			listaNumeros[i] = scanner.nextInt();
			
		}
		
		for(int i = 0; i<tamanhoVetor; i++) {
			if(listaNumeros[i]<0) {
				System.out.print(listaNumeros[i]+ ",");
			}
		
		scanner.close();
		
	}
}

}
