package Lista03;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        int numero;
        int somaPares = 0;
        int somaImpares = 0;

        System.out.println("Digite números positivos (um número negativo para encerrar):");

        // Loop até que um número negativo seja inserido
        while (true) {
            numero = scanner.nextInt();

            // Condição de parada
            if (numero < 0) {
                break;
            }

            // Verifica se o número é par ou ímpar e acumula as somas
            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
                somaPares += numero;
            } else {
                System.out.println(numero + " é ímpar.");
                somaImpares += numero;
            }
        }

        // Exibe as somas dos números pares e ímpares
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        scanner.close();
    }
}
