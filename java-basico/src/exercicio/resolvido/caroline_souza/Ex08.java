package exercicio.resolvido.caroline_souza;

import java.util.Scanner;

public class Ex08 {
	/*Algoritmo para gravar N valores reaisd 
	 * Imprimir todos os valores informados 
	 * Fazer a soma e media dos elementos do vetor
	 */
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int tamanhoVetor = scanner.nextInt();
		double[]vetorReal = new double[tamanhoVetor];
		double soma=0.0,media=0.0;
		
		
		for(int i=0; i<tamanhoVetor;i++) {
			vetorReal[i] = scanner.nextDouble();
		}
		for(int i=0; i<tamanhoVetor;i++) {
			System.out.print(vetorReal[i]+ " ");
			soma+=vetorReal[i];
		}
		System.out.println();
		System.out.printf("Soma: %.2f%n",soma);
		media=soma/tamanhoVetor;
		System.out.printf("Media: %.2f%n",media);
		scanner.close();
	}

}
