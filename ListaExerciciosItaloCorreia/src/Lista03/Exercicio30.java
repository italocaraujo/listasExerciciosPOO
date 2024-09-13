package Lista03;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        System.out.print("De qual número você quer saber a tabuada? ");
        int numero = scanner.nextInt();

        scanner.close();

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
