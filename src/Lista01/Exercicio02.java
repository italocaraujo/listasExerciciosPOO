package Lista01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cotacaoDolar, valorDolar, valorReal;

        System.out.println("Digite a cotação do dólar: ");
        cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite o valor do dólar: ");
        valorDolar = scanner.nextDouble();

        valorReal = cotacaoDolar * valorDolar;

        System.out.printf("O valor em real é " + "%.2f", valorReal);
    }
}
