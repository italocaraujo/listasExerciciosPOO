package Lista02;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int numeroInt;
        String continuar; // Variável para armazenar a resposta do usuário sobre continuar ou não

        do {
            // Solicitação e leitura de dados
            System.out.print("Digite um número inteiro: ");
            numeroInt = scanner.nextInt();

            // Verifica se o número é positivo, negativo ou nulo
            if (numeroInt > 0) { // Se o número inteiro é maior que zero
                System.out.println("O número " + numeroInt + " é positivo"); // Ele é positivo
            } else if (numeroInt < 0) { // Se o número inteiro for menor que 0
                System.out.println("O número " + numeroInt + " é negativo"); // Ele é negativo
            } else { // Se não for nem negativo e nem positivo, o número é zero, ou seja, nulo
                System.out.println("O número 0 é nulo");
            }

            // Pergunta ao usuário se deseja continuar
            System.out.print("Deseja verificar outro número? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s")); {  // Continua o loop enquanto a resposta for "s"
            System.out.println("Programa encerrado.");

            scanner.close(); // Fecha o scanner para liberar recursos
        }
    }
}
