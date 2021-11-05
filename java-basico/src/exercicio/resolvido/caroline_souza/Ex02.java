package exercicio.resolvido.caroline_souza;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sr = new Scanner(System.in);
		
		double largura = sr.nextDouble();
		double comprimento = sr.nextDouble();
		double metroQuadrado = sr.nextDouble();
		
		double area = largura * comprimento ;
		double precoTotal = area * metroQuadrado;
				
		System.out.printf("ÁREA = %.2f%n",area);
		System.out.printf("PRECO = %.2f%n",precoTotal);
		sr.close();
		
	}
}
