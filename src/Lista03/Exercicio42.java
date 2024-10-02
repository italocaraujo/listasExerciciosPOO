package Lista03;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int numero;
        int maior = Integer.MIN_VALUE;  // Inicializa a variável 'maior' com o menor valor possível de um inteiro.
                                        // Isso garante que qualquer número lido será maior que esse valor inicial.

        int menor = Integer.MAX_VALUE;  // Inicializa a variável 'menor' com o maior valor possível de um inteiro.
                                        // Isso garante que qualquer número lido será menor que esse valor inicial.

        System.out.println("Digite números (número 0 para encerrar):");

        // Loop para ler os números
        while (true) {
            numero = scanner.nextInt();

            // Verifica se o número é negativo para encerrar o programa
            if (numero == 0) {
                break;
            }

            // Atualiza o maior número
            if (numero > maior) {
                maior = numero;
            }

            // Atualiza o menor número
            if (numero < menor) {
                menor = numero;
            }
        }

        // Verifica se pelo menos um número foi inserido
        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            // Exibe o maior e o menor número
            System.out.println("O menor número é: " + menor);
            System.out.println("O maior número é: " + maior);
        }

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
