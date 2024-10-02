package Lista02;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        double altura, pesoIdeal;
        char sexo;

        // Solicita a altura ao usuário
        System.out.print("Digite sua alura em metros: ");
        altura = scanner.nextDouble();

        // Solicita o sexo ao usuário
        System.out.print("Digite o sexo (M ou F): ");
        sexo = scanner.next().toUpperCase().charAt(0); // Lê o sexo e converte para maiúscula

        // Calcula o peso ideal com base no sexo
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para um homem com altura " + altura + "m é " + pesoIdeal + "kg.");
        } else if (sexo == 'F') {
            pesoIdeal =  (62.1 * altura) - 44.7;
            System.out.println("O peso ideal para uma mulher com altura " + altura + "m é " + pesoIdeal + "kg.");
        } else {
            System.out.println("Sexo inválido! Por favor, digite M para masculino ou F para feminino.");
        }

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
