package Lista03;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Lê a quantidade de números que o usuário deseja processar
        System.out.print("Digite a quantidade de números a serem processados: ");
        int quantidade = scanner.nextInt();
        System.out.println(); // Imprime uma linha em branco para melhorar a formatação da saída

        // Array para armazenar os números
        int[] numeros = new int[quantidade];

        // Lê os números com verificação de validade
        for (int i = 0; i < quantidade; i++) {
            while (true) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int num = scanner.nextInt();

                // Verifica se o número é negativo
                if (num < 0) {
                    System.out.println("Número inválido. O fatorial não é definido para números negativos. Tente novamente.");
                } else {
                    numeros[i] = num;
                    break;
                }
            }
        }

        // Calcula e exibe o fatorial para cada número
        for (int num : numeros) {
            System.out.println("\nFatorial de " + num + " é " + calcularFatorial(num));
        }

        // Fecha o scanner
        scanner.close();
    }

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        // Usei 'long' porque o fatorial de números grandes pode exceder o limite de um 'int'.
        long fatorial = 1; // Inicializa o fatorial como 1

        // Calcula o fatorial multiplicando de 1 até n
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}