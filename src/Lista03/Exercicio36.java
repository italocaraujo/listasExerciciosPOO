package Lista03;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

            // Variáveis
            int numero;
            int maior = Integer.MIN_VALUE;  // Inicializa com o menor valor possível
            int menor = Integer.MAX_VALUE;  // Inicializa com o maior valor possível
            int soma = 0;  // Para acumular a soma dos valores
            int quantidadeValores = 10;  // Quantidade de valores a serem lidos

            // Loop para ler 10 valores
            for (int i = 1; i <= quantidadeValores; i++) {
                // Lê um número positivo
                do {
                    System.out.println("Digite o " + i + "º número inteiro e positivo:");
                    numero = scanner.nextInt();
                    if (numero <= 0) {
                        System.out.println("O número deve ser positivo. Tente novamente.");
                    }
                } while (numero <= 0);  // Garante que o número seja positivo

                // Atualiza o maior número
                if (numero > maior) {
                    maior = numero;
                }

                // Atualiza o menor número
                if (numero < menor) {
                    menor = numero;
                }

                // Soma o número ao total
                soma += numero;
            }

            // Calcula a média dos números lidos
            double media = (double) soma / quantidadeValores;

            // Exibe os resultados
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
            System.out.println("A média dos números é: " + media);

            // Fecha o scanner para liberação de recursos
            scanner.close();
    }
}
