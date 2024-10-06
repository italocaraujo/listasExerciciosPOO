package Lista04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    // Função de recombinação que gera dois filhos a partir de dois pais
    public static void recombinacao(String S1, String S2, String[] filhos) {
        Random random = new Random();
        int pontoDeCorte = random.nextInt(S1.length());

        // Divisão e recombinação das strings S1 e S2
        filhos[0] = S1.substring(0, pontoDeCorte) + S2.substring(pontoDeCorte);
        filhos[1] = S2.substring(0, pontoDeCorte) + S1.substring(pontoDeCorte);
    }

    // Função de mutação que altera um caractere aleatório da string
    public static String mutacao(String individuo) {
        Random random = new Random();
        char[] caracteres = individuo.toCharArray();

        // Sorteia uma posição para realizar a mutação
        int posicaoDeMutacao = random.nextInt(caracteres.length);

        // Gera um novo caractere aleatório (A-Z)
        char novoCaractere = (char) ('A' + random.nextInt(26));

        // Altera o caractere na posição sorteada
        caracteres[posicaoDeMutacao] = novoCaractere;

        return new String(caracteres);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das strings S1 e S2
        System.out.print("Digite a string S1: ");
        String S1 = scanner.nextLine().toUpperCase();
        System.out.print("Digite a string S2: ");
        String S2 = scanner.nextLine().toUpperCase();

        // Verificar se S1 e S2 têm o mesmo tamanho
        if (S1.length() != S2.length()) {
            System.out.println("As strings S1 e S2 devem ter o mesmo tamanho.");
            return;
        }

        // Array para armazenar os filhos gerados
        String[] filhos = new String[2];

        // Realizar a recombinação
        recombinacao(S1, S2, filhos);
        String S3 = filhos[0];
        String S4 = filhos[1];

        // Aplicar mutação em um dos filhos
        S3 = mutacao(S3);

        // Exibir os resultados
        System.out.println("Indivíduo S1: " + S1);
        System.out.println("Indivíduo S2: " + S2);
        System.out.println("Indivíduo S3 (filho mutado): " + S3);
        System.out.println("Indivíduo S4: " + S4);

        scanner.close();
    }
}
