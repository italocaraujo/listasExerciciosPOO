package Lista01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        int anos, meses, dias, totalDias;

        // Ler a idade em anos, meses e dias
        System.out.print("Digite a idade em anos: ");
        anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        dias = scanner.nextInt();

        totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("O total de dias é " + totalDias);

    }
}
