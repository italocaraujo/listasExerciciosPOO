package Lista02;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int num1, num2, opcao;

        // Solicitação e leitura de dados
        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        do {
            // Exibe Menu de opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Verificar se um dos números lidos é ou não múltiplo do outro");
            System.out.println("2 - Verificar se os dois números lidos são pares");
            System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
            System.out.println("4 - Sair");
            System.out.print("Digite o número da opção desejada: ");

            opcao = scanner.nextInt(); // Lê a opção desejada

            if (opcao < 1 || opcao > 4) {
                System.out.println("\nOpção inválida!");
            } else {
                switch (opcao) {
                    case 1:
                        // Verifica se um número é múltiplo do outro
                        if (num1 % num2 == 0) { // Se o resto da divisão do primeiro número com o segundo número for 0, num1 é múltiplo de num2
                            System.out.println("\n" + num1 + " é múltiplo de " + num2);
                        } else if (num2 % num1 == 0) { // Se o resto da divisão do segundo número com o primeiro número for 0, num2 é múltiplo de num1
                            System.out.println("\n" + num2 + " é múltiplo de " + num1);
                        } else { // Caso contrário, nenhum dos números são múltiplos do outro
                            System.out.println("\nNenhum dos números é múltiplo do outro.");
                        }
                        break;
                    case 2:
                        // Verifica se ambos os números são pares
                        if (num1 % 2 == 0 && num2 % 2 == 0) { // Se o resto da divisão de ambos por 2 for 0, ambos são pares
                            System.out.println("\nAmbos os números são pares.");
                        } else if (num1 % 2 == 0) { // Caso o comando "if" acima for falso, esse verifica se o primeiro número é par
                            System.out.println("\nApenas o primeiro número é par.");
                        } else if (num2 % 2 == 0) { // Caso os comandos "if" e "else if" acima forem falsos, esse verifica se o segundo número é par
                            System.out.println("\nApenas o segundo número é par.");
                        } else { // Caso nenhum dos casos acima forem válidos, esse comando é executado, portanto nenhum dos dois números é par
                            System.out.println("\nNenhum dos números é par.");
                        }
                        break;
                    case 3:
                        double media = (num1 + num2) / 2;
                        // Verifica se a média é maior ou igual a 7
                        if (media >= 7) {
                            System.out.println("\nA média é " + media + " e é maior ou igual a 7.");
                        } else {
                            System.out.println("\nA média é " + media + " e é menor que 7.");
                        }
                        break;
                    case 4:
                        // Sair
                        System.out.println("\nEncerrando o programa...");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                        break;
                }
            }
        } while (opcao != 4);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}

