package Lista03;

public class Exercicio28 {
    public static void main(String[] args) {
        // Imprime duas linhas em branco no início da execução do programa
        System.out.println();
        System.out.println();

        // Loop que percorre os números de 100 até 200
        for (int i = 100; i <= 200; i++) {
            // Verifica se o número atual (i) é ímpar
            if (i % 2 == 1) {
                // Se for ímpar, imprime o número
                System.out.println(i);
            }
        }
    }
}
