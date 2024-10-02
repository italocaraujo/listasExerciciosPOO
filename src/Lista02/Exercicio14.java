package Lista02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int num1, num2, subtracao;

        // Leitura de dados
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        // Condicional
        // Se num1 for maior ou igual que num2, a subtração será feita
        if (num1 >= num2) {
            subtracao = num1 - num2;

            // Resultado
            System.out.println("A diferença entre os dois números é igual à " + subtracao);

        }
        // Senão, a subtração também será feita, porém vamos subtrair o num2 por num1
        else {
            subtracao = num2 - num1;

            // Resultado
            System.out.println("A diferença entre os dois números é igual à " + subtracao);
        }

        // Fecha o Scanner
        scanner.close();
    }
}
