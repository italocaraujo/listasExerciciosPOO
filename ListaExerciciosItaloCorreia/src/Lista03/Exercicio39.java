package Lista03;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados
        char encerrar;

        // Variável
        int numero;

        // Loop que continuará até que o usuário escolha encerrar o programa
        do {
            // Solicita que o usuário digite um número inteiro
            System.out.print("Digite um número inteiro: ");
            numero = scanner.nextInt();  // Lê o número inteiro digitado pelo usuário

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) {
                System.out.println("\n" + numero + " é par.");
            } else {
                System.out.println("\n" + numero + " é ímpar.");
            }

            // Verifica se o número é positivo ou negativo
            if (numero >= 0) {
                System.out.println(numero + " é positivo.");
            } else {
                System.out.println(numero + " é negativo.");
            }

            // Pergunta ao usuário se deseja encerrar o programa
            System.out.print("\nDeseja encerrar o programa? (S/s para Sim, qualquer outra tecla para continuar): ");
            encerrar = scanner.next().charAt(0);  // Lê o caractere de resposta do usuário

        } while (encerrar != 'S' && encerrar != 's'); // Continua o loop enquanto o usuário não digitar 'S' ou 's'

        System.out.println("Programa encerrado.");  // Exibe mensagem de encerramento do programa

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}