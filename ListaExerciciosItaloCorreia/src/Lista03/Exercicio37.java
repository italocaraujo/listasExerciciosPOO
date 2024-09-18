package Lista03;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados
        char continuar;

        do {
            // Exibe o menu de opções
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Informe a opção: ");
            int opcao = scanner.nextInt();

            // Solicita que o usuário digite dois números
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Variável para armazenar o resultado
            double resultado = 0;
            boolean operacaoValida = true;

            // Executa a operação escolhida
            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    // Verifica se o segundo número é zero para evitar divisão por zero
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida.");
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    operacaoValida = false;
            }

            // Se a operação for válida, pergunta se o usuário deseja voltar ao menu
            if (operacaoValida) {
                System.out.print("Deseja voltar ao menu principal? (S/s para Sim, qualquer outra tecla para sair): ");
                continuar = scanner.next().charAt(0);
            } else {
                continuar = 'S';  // Se operação inválida, retorna ao menu automaticamente
            }

        } while (continuar == 'S' || continuar == 's');  // Continua enquanto o usuário digitar 'S' ou 's'

        System.out.println("Programa encerrado.");
        // Fecha o scanner para liberação de recursos
        scanner.close();
    }
}
