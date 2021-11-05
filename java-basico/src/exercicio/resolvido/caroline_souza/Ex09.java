package exercicio.resolvido.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[]args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

	        int tamVet = sc.nextInt();
	        String[] nomes = new String[tamVet];
	        int[] idades = new int[tamVet];
	        double[] alturas = new double[tamVet];

	        for (int i=0; i<tamVet; i++){
	            nomes[i] = sc.next();
	            idades[i] = sc.nextInt();
	            alturas[i] = sc.nextDouble();
	        }
	        double soma = 0.0;
	        for (int i=0; i<tamVet; i++){
	            soma+=alturas[i];
	        }

	        double media = soma/tamVet;
	        System.out.printf("media de altura %.2f%n", media);

	        int contMenos16 = 0;
	        for (int i=0; i<tamVet; i++) {
	            if(idades[i]<16){
	                contMenos16++;
	            }
	        }
	        double percent = (double)(contMenos16*100)/tamVet;
	        System.out.printf("pessoas com menos de 16: %.1f", percent);
	            sc.close();
		}
	

}
