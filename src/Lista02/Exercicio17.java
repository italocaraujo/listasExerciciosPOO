package Lista02;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados inseridos pelo usuário

        // Variável
        int numero;

        // Solicitação e leitura de dados
        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        // Condicional
        if (0 < numero && numero < 9) { // Se o número inserido pelo usuário estiver entre 0 e 9, é válido.
            System.out.println("\nVálido");
        } else { // Senão (se não estiver entre 0 e 9), é inválido
            System.out.println("\nInválido");
        }

        // Fecha o Scanner para liberar os recursos
        scanner.close();
    }
}
