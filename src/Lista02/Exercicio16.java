package Lista02;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int num1, num2;

        // Solicita ao usuário que insira o valor do primeiro número
        System.out.print("Digite o valor do primeiro número: ");
        num1 = scanner.nextInt();

        // Solicita ao usuário que insira o valor do segundo número
        System.out.print("Digite o valor do segundo número: ");
        num2 = scanner.nextInt();

        // Condicionais
        if (num1 == num2) { // Verifica se os dois números são iguais
            System.out.println("\nOs números são iguais");
        } else if (num1 > num2) { // Verifica se o primeiro número é maior que o segundo
            System.out.println("\nO valor do maior número é " + num1);
            System.out.println("O valor do menor número é " + num2);
        } else { // Se os números não forem iguais e o primeiro não for maior, então o segundo número é maior
            System.out.println("\nO valor do maior número é " + num2);
            System.out.println("O valor do menor número é " + num1);
        }

        // Fecha o Scanner para liberar os recursos
        scanner.close();
    }
}
