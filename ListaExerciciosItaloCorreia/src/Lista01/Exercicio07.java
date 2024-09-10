package Lista01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        int celsius, fahrenheit;

        // Ler a temperatura em °C
        System.out.println("Digite a temperatura em °F: ");
        fahrenheit = scanner.nextInt();

        // Cálculo de conversão de Fahrenheit para Celsius
        celsius = (fahrenheit - 32) * 5 / 9;

        // Resultado
        System.out.println("A temperatura em Celsius é de " + celsius + "°C");

        scanner.close();
    }
}
