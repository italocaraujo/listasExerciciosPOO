package Lista03;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados
        char encerrar = 'N'; // Inicializa a variável para controle do loop

        // Loop principal do programa
        while (encerrar != 'S' && encerrar != 's') {
            // Exibe o menu de opções
            System.out.println("Escolha uma opção:");
            System.out.println("1 – Conversão de Graus Celsius em Graus Fahrenheit");
            System.out.println("2 – Conversão de Graus Fahrenheit em Graus Celsius");
            System.out.println("3 – Peso ideal do homem");
            System.out.println("4 – Peso ideal da mulher");

            // Lê a escolha do usuário
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Conversão de Celsius para Fahrenheit
                    System.out.print("Digite a temperatura em graus Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
                    break;

                case 2:
                    // Conversão de Fahrenheit para Celsius
                    System.out.print("Digite a temperatura em graus Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");
                    break;

                case 3:
                    // Peso ideal do homem
                    System.out.print("Digite sua altura em metros: ");
                    double altura = scanner.nextDouble();
                    double pesoIdealHomem = (72.7 * altura) - 58;
                    System.out.println("O peso ideal para um homem com altura de " + altura + " metros é " + pesoIdealHomem + " kg.");
                    System.out.print("Digite seu peso atual em kg: ");
                    double pesoAtualHomem = scanner.nextDouble();
                    if (pesoAtualHomem > pesoIdealHomem) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoAtualHomem < pesoIdealHomem) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;

                case 4:
                    // Peso ideal da mulher
                    System.out.print("Digite sua altura em metros: ");
                    altura = scanner.nextDouble();
                    double pesoIdealMulher = (62.1 * altura) - 44.7;
                    System.out.println("O peso ideal para uma mulher com altura de " + altura + " metros é " + pesoIdealMulher + " kg.");
                    System.out.print("Digite seu peso atual em kg: ");
                    double pesoAtualMulher = scanner.nextDouble();
                    if (pesoAtualMulher > pesoIdealMulher) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoAtualMulher < pesoIdealMulher) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            // Pergunta ao usuário se deseja encerrar o programa
            System.out.print("Deseja encerrar o programa? (S/s para Sim, qualquer outra tecla para continuar): ");
            encerrar = scanner.next().charAt(0); // Lê a resposta do usuário
        }

        // Exibe mensagem de encerramento
        System.out.println("Programa encerrado.");

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
