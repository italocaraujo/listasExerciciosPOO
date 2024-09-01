package Lista01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um scanner para ler os dados de entrada

        // Variáveis
        double raio, altura, volume;

        // Leitura do valor do raio e da altura da lata de óleo
        System.out.println("Informe o valor do raio da lata de óleo: ");
        raio = scanner.nextDouble();

        System.out.println("Informe a altura da lata de óleo: ");
        altura = scanner.nextDouble();

        // Cálculo do Volume da lata de óleo
        volume = 3.14159 * raio * raio * altura;

        // Resultado
        System.out.println("O volume da lata é " + volume + "cm³");
    }
}
