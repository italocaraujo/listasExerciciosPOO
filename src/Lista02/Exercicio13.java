package Lista02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int num1, num2, num3;

        // Leitura dos números
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        // Variáveis para a ordenação em ordem decrescente
        int maior, meio, menor;

        // Condicionais
        if (num1 >= num2 && num1 >= num3) { // Se o num1 é maior ou igual que o num2 e o num3
            maior = num1; // Confirmação que o num1 é maior que os outros
            if (num2 >= num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) { // Se o num2 é maior ou igual que o num1 e o num3
            maior = num2; // Confirmação que o num2 é maior que os outros
            if (num1 >= num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else { // Senão for nenhuma das duas condições anteriores, o num3 é maior ou igual que o num1 e o num2
            maior = num3; // Confirmação que o num3 é maior que os outros
            if (num1 >= num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        // Resultado dos números em ordem decrescente
        System.out.println("Os números em ordem decrescente são: " + maior + ", " + meio + ", " + menor);

        // Fechar o scanner
        scanner.close();
    }
}
