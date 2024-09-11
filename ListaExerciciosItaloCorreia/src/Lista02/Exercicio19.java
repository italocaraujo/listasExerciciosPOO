package Lista02;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados inseridos pelo usuário

        // Variáveis dos lados do triângulo
        double ladoA, ladoB, ladoC;

        // Leitura dos lados do triângulo
        System.out.print("Digite o lado A: ");
        ladoA = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        ladoB = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        ladoC = scanner.nextDouble();

        // Condicionais
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) { // Verificar se cada lado é menor que a soma dos outros dois lados.
            if (ladoA == ladoB && ladoB == ladoC) { // Se sim, saber de ladoA == ladoB e se ladoB == ladoC
                System.out.println("\nO triângulo é eqüilátero"); // Sendo verdade o triângulo é eqüilátero
            } else if (ladoA == ladoB | ladoA == ladoC | ladoB == ladoC ) { // Se não, verificar se ladoA == ladoB ou se ladoA == ladoC ou se ladoB == ladoC
                System.out.println("\nO triângulo é isósceles"); // Sendo verdade o triângulo é isósceles
            } else { // Caso contrário, o triângulo será escaleno.
                System.out.println("\nO triângulo é escaleno");
            }
        } else { // Caso os lados fornecidos não caracterizarem um triângulo, avisa a ocorrência.
            System.out.println("\nOs lados fornecidos não caracterizarem um triângulo");
        }

        // Fechar o scanner
        scanner.close();
    }
}
