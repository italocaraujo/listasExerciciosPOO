package Lista01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        String vendedor; // String -> Classe que representa uma sequência de caracteres
        int codigoPeca, quantidadeVendida; // int -> Comando que recebe variáveis com valores inteiros
        double comissao, precoPeca, valorTotalVenda;

        // Solicita e lê a identificação do vendedor
        System.out.println("Digite o nome do vendedor: ");
        vendedor = scanner.nextLine();

        // Solicita e lê o código da peça
        System.out.println("Digite o código da peça: ");
        codigoPeca = scanner.nextInt();

        // Solicita e lê o preço unitário da peça
        System.out.println("Digite o preço da peça: ");
        precoPeca = scanner.nextDouble();

        // Solicita e lê a quantidade vendida
        System.out.println("Informe a quantidade vendida: ");
        quantidadeVendida = scanner.nextInt();

        // Calcula o valor total da venda
        valorTotalVenda = precoPeca * quantidadeVendida;

        // Calcula a comissão (5% do valor total da venda)
        comissao = valorTotalVenda * 0.05;

        // Resultado
        System.out.println("\n--- Comissão ---");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Código da peça: " + codigoPeca);
        System.out.println("Valor total da venda: R$ " + String.format("%.2f", valorTotalVenda));
        System.out.println("Comissão do vendedor: R$ " + String.format("%.2f", comissao));
    }
}
