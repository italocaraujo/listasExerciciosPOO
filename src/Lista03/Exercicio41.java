package Lista03;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variável
        int idade;

        // Solicita e lê idade do nadador
        System.out.print("Digite a idade do nadador: ");
        idade = scanner.nextInt();

        // Classifica o nadador com base na idade
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Categoria: Adultos");
        } else {
            System.out.println("Idade inválida para classificação.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
