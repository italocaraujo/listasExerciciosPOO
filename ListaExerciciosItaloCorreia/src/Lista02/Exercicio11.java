package Lista02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int a, b, trocaValores;

        // Solicitação e leitura de dados
        System.out.println("Digite o valor de \"a\": ");
        a = scanner.nextInt();

        System.out.println("Digite o valor de \"b\": ");
        b = scanner.nextInt();

        // Trocando os valores de "a" e "b"

        trocaValores = b;
        b = a;
        a = trocaValores;

        /*
        a variável "trocaValores" vai receber o valor de "b"
        "b" vai receber o valor de "a"
        "a" vai receber o valor da variável "trocaValores"
        */

        // Resultado
        System.out.println("O valor de \"a\" agora é " + a);
        System.out.println("o valor de \"b\" agora é " + b);

        // Fechar o scanner
        scanner.close();
    }
}
