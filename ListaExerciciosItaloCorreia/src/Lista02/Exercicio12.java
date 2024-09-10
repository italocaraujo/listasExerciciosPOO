package Lista02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int numInt, modulo;

        // Leitura de informações
        System.out.print("Digite um número inteiro: ");
        numInt = scanner.nextInt();

        // Cálculo do módulo
        modulo = (numInt >= 0) ? numInt : numInt * (-1);
        /* Forma mais fácil de escrever o if e else
        ? -> if (se verdadeira)
        : -> else (se falsa)
        */

        // Resultado
        System.out.println("O módulo de " + numInt + " é " + modulo);

        // Fecha o scanner
        scanner.close();
    }
}
