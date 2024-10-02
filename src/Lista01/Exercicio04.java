package Lista01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis dos quatro valores inteiros
        int a, b, c, d;

        // Leitura dos quatro valores inteiros
        System.out.println("Digite o valor de \"a\": ");
        a = scanner.nextInt();

        System.out.println("Digite o valor de \"b\": ");
        b = scanner.nextInt();

        System.out.println("Digite o valor de \"c\": ");
        c = scanner.nextInt();

        System.out.println("Digite o valor de \"d\": ");
        d = scanner.nextInt();

        // Array (ou lista) para armazenar os valores lidos
        int[] valores = {a, b, c, d};

        // Soma
        System.out.println("\n--- Resultados das Somatórias ---");

        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                int soma = valores[i] + valores[j];
                System.out.println(valores[i] + " + " + valores[j] + " = " + soma);
            }
        }

        // Multiplicação
        System.out.println("\n--- Resultados das Multiplicações ---");

        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                int multiplicacao = valores[i] * valores[j];
                System.out.println(valores[i] + " * " + valores[j] + " = " + multiplicacao);
            }
        }

        // Fechando o scanner
        scanner.close();

    }
}
