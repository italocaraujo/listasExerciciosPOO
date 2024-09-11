package Lista02;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int a, b, c, multiplicacao, maior, menor;
        double divisao;

        // Leitura dos valores e validação
        a = lerValor(scanner, "Digite o valor de \"a\": ");
        b = lerValor(scanner, "Digite o valor de \"b\": ");
        c = lerValor(scanner, "Digite o valor de \"c\": ");

        // Encontrar o menor e o maior valor
        menor = encontrarMenor(a, b, c);
        maior = encontrarMaior(a, b, c);

        // Cálculo
        multiplicacao = menor * maior;
        divisao = (double) maior / menor; // Conversão para double para o resultado ser decimal

        // Resultado
        System.out.println("\nMenor valor multiplicado pelo maior: " + multiplicacao);
        System.out.println("Maior valor dividido pelo menor: " + divisao);

        // Fechar o scanner
        scanner.close();
    }

    /*
     * Método para ler um valor maior que zero.
     *
     * Modificadores:
     * - private: O método é acessível apenas dentro da própria classe Main.
     *   Isso ajuda a manter a encapsulação, evitando que outras classes
     *   acessem ou modifiquem o método diretamente.
     * - static: O método pertence à classe Main e não a uma instância específica
     *   da classe. Isso permite que o método seja chamado diretamente dentro
     *   do método main (que também é estático) sem precisar criar uma instância
     *   da classe.
     */
    private static int lerValor(Scanner scanner, String mensagem) {
        int valor;
        while (true) { // while (true) cria um loop infinito
            System.out.print(mensagem);
            valor = scanner.nextInt();
            if (valor > 0) {
                break; // Se for válido, sai do loop
            } else {
                System.out.println("Valor inválido. O valor deve ser maior que zero.");
            }
        }
        return valor;
    }

    // Menor valor entre três números
    private static int encontrarMenor(int a, int b, int c) {
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        return menor; // Retorna o menor valor encontrado
    }

    // Maior valor entre três números
    private static int encontrarMaior(int a, int b, int c) {
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior; // Retorna o maior valor encontrado
    }
}
