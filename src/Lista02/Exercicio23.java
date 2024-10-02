package Lista02;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int opcao;
        double num1, num2, adicao, subtracao, multiplicacao, divisao;

        // Exibe Menu de opções
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada: ");

        // Lê a opção do usuário
        opcao = scanner.nextInt();

        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção inválida!");
        } else {
            // Solicita os dois números para a operação
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            // Realiza a operação escolhida
            switch (opcao) {
                case 1: // Adição
                    adicao = num1 + num2;
                    System.out.println("Resultado: " + adicao);
                    break;
                case 2: // Subtração
                    subtracao = num1 - num2;
                    System.out.println("Resultado: " + subtracao);
                    break;
                case 3: // Multiplicação
                    multiplicacao = num1 * num2;
                    System.out.println("Resultado: " + multiplicacao);
                    break;
                case 4: // Divisão
                    if (num2 != 0) {
                        divisao = num1 / num2;
                        System.out.println("Resultado: " + divisao);
                    } else {
                        System.out.println("Erro: Não é possível dividir por 0");
                    }
                    break;
            }
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
