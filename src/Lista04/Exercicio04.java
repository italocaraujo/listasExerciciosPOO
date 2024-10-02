package Lista04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // Criação do Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite um texto
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        // Contar o número total de caracteres (inclui espaços)
        int numeroDeCaracteres = texto.length();

        // Dividir o texto em palavras e contar o número de palavras
        // Usando "\\s+" para lidar com múltiplos espaços
        String[] palavras = texto.trim().split("\\s+");
        int numeroDePalavras = texto.trim().isEmpty() ? 0 : palavras.length;

        // Exibir os resultados
        System.out.println("Número total de caracteres: " + numeroDeCaracteres);
        System.out.println("Número total de palavras: " + numeroDePalavras);

        // Fechar o Scanner
        scanner.close();
    }
}
