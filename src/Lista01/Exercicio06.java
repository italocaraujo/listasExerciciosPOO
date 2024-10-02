package Lista01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        int celsius, fahrenheit;

        // Ler a temperatura em °C
        System.out.println("Digite a temperatura em °C: ");
        celsius = scanner.nextInt();

        // Cálculo de conversão de Celsius para Fahrenheit
        fahrenheit = (9 * celsius + 60) / 5;

        // Resultado
        System.out.println("A temperatura em Fahrenheit é de " + fahrenheit + "°F");

    }
}
