package Lista02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados inseridos pelo usuário

        // Variável solicitada pela questão
        int codigo;

        // Solicitação e leitura de dados
        System.out.print("Digite um número inteiro: ");
        codigo = scanner.nextInt();

        // Condicionais (ou)
        if (codigo == 1 | codigo == 2 | codigo ==3) { // Se código for igual a 1 ou 2 ou 3, é escrito por extenso
            switch (codigo) {
                case 1:
                    System.out.println("\nUm");
                    break;
                case 2:
                    System.out.println("\nDois");
                    break;
                case 3:
                    System.out.println("\nTrês");
                    break;
                default:
                    // Esse bloco não vai ser acessado, pois a verificação anterior anula ele. Porém é recomendado ter um valor default no switch.
                    System.out.println("\nCódigo inválido");
            }
        } else {
            System.out.println("\nCódigo inválido"); // Senão, o código é inválido
        }

        // Fecha o Scanner para liberar os recursos
        scanner.close();
    }
}
