package exercicio.resolvido.caroline_souza;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		/*1- Criar uma matriz quadrada 
		 * 2- apresentar os valores da diagonal principal
		 * 3- apresentar a quantidade de elementos negativos da matriz 
		 */
		
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				matriz[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(matriz[i][i]+" ");
		}
		
		System.out.println();
		 int numerosNegativos =0;
		 
		 for(int i=0; i<n; i++) {
				for(int j=0;j<n;j++) {
					if(matriz[i][j] < 0) {
						numerosNegativos++;
					}
				}
			}
		 
		 System.out.printf("Quantidade de numeros negativos %d %n", numerosNegativos);
				
		sc.close();
	}

}
