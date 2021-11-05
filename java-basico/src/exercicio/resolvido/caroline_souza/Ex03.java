package exercicio.resolvido.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
	//desvio de fluxo
    //fazer agoritmo para ler duas notas de uma aluno e calcular a media
    //se a media for menor que 6.0 "REPROVADO" senao "APROVADO"
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;

        if (media<6.0){
            System.out.println("REPROVADO");
        }else {
            System.out.println("APROVADO");
        }

        sc.close();
    }

}
