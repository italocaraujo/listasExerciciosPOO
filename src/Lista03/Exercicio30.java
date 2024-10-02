package Lista03;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Solicita ao usuário para informar o número para calcular a tabuada
        System.out.print("De qual número você quer saber a tabuada? ");
        int numero = scanner.nextInt(); // Lê o número informado pelo usuário

        // Fecha o scanner após a leitura para liberar recursos
        scanner.close();

        // Adiciona uma linha em branco para melhor formatação
        System.out.println();

        // Loop para calcular e exibir a tabuada do número informado
        for (int i = 1; i <= 10; i++) {
            // Exibe o resultado da multiplicação para cada valor de i
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
