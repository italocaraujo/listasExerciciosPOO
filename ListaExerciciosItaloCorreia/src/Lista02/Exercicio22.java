package Lista02;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int a, b, numInt;

        // Inicializamos A e B com 0 para evitar erro de compilação, pois variáveis locais precisam ser inicializadas antes do uso.
        a = 0;
        b = 0;

        // Solicitação e leitura de dados
        System.out.print("Digite um número inteiro: ");
        numInt = scanner.nextInt();

        // Condicional
        if (numInt >= 0) { // Se o número for maior ou igual a 0, ele é positivo, ou seja, será armazenado em A
            a = numInt;
            System.out.println("O número " + numInt + " é positivo, portanto A = " + a);
        } else { // Caso contrário, se o número for menor que 0, ele é negativo, portanto, será armazenado em B
            b = numInt;
            System.out.println("O número " + numInt + " é negativo, portanto B = " + b);
        }

        // Fecha o scanner
        scanner.close();
    }
}
