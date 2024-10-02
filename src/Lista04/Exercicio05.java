package Lista04;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // Criação do Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite um texto
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        // Remover os espaços em branco adicionais
        // O método trim() remove espaços no início e no fim
        // O método replaceAll("\\s+", " ") substitui múltiplos espaços por apenas um
        String textoCorrigido = texto.trim().replaceAll("\\s+", " ");

        // Exibir o texto sem espaços adicionais
        System.out.println("Texto corrigido: " + textoCorrigido);

        // Fechar o Scanner
        scanner.close();
    }
}
