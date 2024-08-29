package Lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int quantidadeMinima, quantidadeMaxima; // int -> Comando que recebe variáveis com valores inteiros
        double estoqueMedio; // double -> Comando que recebe variáveis com valores decimais

        // Leitura de dados
        System.out.println("Digite a quantidade mínima: "); // Comando para exibir uma mensagem ou um valor no console
        quantidadeMinima = scanner.nextInt(); // Comando para ler os dados inseridos

        System.out.println("Digite a quantidade máxima: ");
        quantidadeMaxima = scanner.nextInt();

        // Cálculo
        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.0;

        // Resposta
        System.out.println("O estoque médio é " + estoqueMedio);
    }
}
