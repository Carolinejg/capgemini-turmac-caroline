package exercicio.resolvido.caroline_souza;

import java.util.Scanner;

public class Ex05 {
	/*
    Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um, a
    idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um valor
    de idade negativa. Calcular e imprimir a idade m�dia deste grupo de indiv�duos. Se for
    entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        int contadorDeRepeticao = 0;
        int somaIdade = 0;

        while (idade >= 0) {
            contadorDeRepeticao++;
            somaIdade = somaIdade + idade;
            System.out.println("Digite novamente a idade");
            idade = scanner.nextInt();
        }

        if (contadorDeRepeticao > 0) {
            double mediaIdades = (double) somaIdade / contadorDeRepeticao;
            System.out.printf("Media das idades %.2f%n", mediaIdades);
        } else {
            System.out.println("impossivel calcular");
        }
        scanner.close();
    }
}
