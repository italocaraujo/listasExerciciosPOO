package Lista03;

public class Exercicio35 {
    public static void main(String[] args) {
        // Loop que conta de 1 até 100
        for (int i = 0; i <= 100; i++) {
            // Exibe o número atual
            System.out.println(i);

            // Verifica se o número atual é múltiplo de 10
            if (i % 10 == 0) {
                // Exibe a mensagem se o número for múltiplo de 10
                System.out.println("Múltiplo de 10");
            }
        }
    }
}
