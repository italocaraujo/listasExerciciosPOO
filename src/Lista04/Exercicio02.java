package Lista04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor com os dígitos por extenso
        String[] digitosPorExtenso = { "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };

        // Capturando o número digitado pelo usuário
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();

        // Convertendo o número para String para facilitar a separação dos dígitos
        String numeroString = String.valueOf(numero);

        // StringBuilder para armazenar o resultado
        StringBuilder resultado = new StringBuilder();

        // Loop para percorrer cada dígito do número
        for (int i = 0; i < numeroString.length(); i++) {
            // Obtém o caractere atual e converte para inteiro
            char digitoChar = numeroString.charAt(i);
            int digito = Character.getNumericValue(digitoChar);

            // Adiciona o dígito por extenso ao resultado
            resultado.append(digitosPorExtenso[digito]);

            // Adiciona vírgula e espaço após cada número, exceto o último
            if (i < numeroString.length() - 1) {
                resultado.append(", ");
            }
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado.toString());

        // Fechar o scanner
        scanner.close();
    }
}
