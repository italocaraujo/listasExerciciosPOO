package Lista03;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        int numero;

        // Solicita um número do usuário que seja maior que 0 e menor que 10
        do {
            System.out.print("Digite um número entre 0 e 10: ");
            numero = scanner.nextInt();
        } while (numero <= 0 || numero >= 10);

        int contadorImpares = 0;  // Contador de números ímpares encontrados
        int somaQuadrados = 0;    // Acumula a soma dos quadrados dos ímpares

        // Verifica se o número inicial é ímpar. Se não for, o ajusta para o próximo ímpar.
        if (numero % 2 == 0) {
            numero++;
        }

        // Loop que encontra os 20 primeiros números ímpares a partir do número informado
        while (contadorImpares < 20) {
            // Soma o quadrado do número ímpar atual
            somaQuadrados += numero * numero;

            // Imprime o número ímpar e seu quadrado
            System.out.println("Número ímpar: " + numero + ", Quadrado: " + (numero * numero));

            // Avança para o próximo número ímpar
            numero += 2;
            contadorImpares++;
        }

        // Exibe a soma dos quadrados dos 20 primeiros números ímpares
        System.out.println("Soma dos quadrados dos 20 primeiros números ímpares: " + somaQuadrados);

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
