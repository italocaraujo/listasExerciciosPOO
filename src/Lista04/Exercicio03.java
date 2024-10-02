package Lista04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // Lista de conectores a serem ignorados
        String[] conectores = { "e", "do", "da", "dos", "das", "de", "di", "du" };

        // Capturar o nome do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome completo: ");
        String nomeCompleto = scanner.nextLine().trim();

        // Dividir o nome em palavras
        String[] palavras = nomeCompleto.split("\\s+");

        // StringBuilder para armazenar as iniciais
        StringBuilder iniciais = new StringBuilder();

        // Iterar sobre cada palavra do nome
        for (String palavra : palavras) {
            // Verifica se a palavra não é um conector
            if (!isConector(palavra, conectores)) {
                // Pega a primeira letra da palavra e adiciona em maiúsculo
                iniciais.append(palavra.toUpperCase().charAt(0));
            }
        }

        // Exibir as iniciais
        System.out.println("Iniciais: " + iniciais.toString());

        // Fechar o scanner
        scanner.close();
    }

    // Método para verificar se a palavra é um conector
    private static boolean isConector(String palavra, String[] conectores) {
        for (String conector : conectores) {
            if (palavra.equalsIgnoreCase(conector)) {
                return true;
            }
        }
        return false;
    }
}
