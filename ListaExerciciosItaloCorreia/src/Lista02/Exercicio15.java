package Lista02;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados inseridos pelo usuário

        // Variáveis
        double nota1, nota2, nota3, nota4, recuperacao, media;
        String nomeDoAluno;

        System.out.print("Digite o nome do aluno: ");
        nomeDoAluno = scanner.nextLine();

        System.out.print("\nDigite a primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        // Cálculo da média
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("\nMédia do aluno: " + media);
            System.out.println("Situação do aluno (" + nomeDoAluno + "): APROVADO");
        }
        else {
            System.out.print("Informe a nota da recuperação: ");
            recuperacao = scanner.nextDouble();
            double novaMedia = (recuperacao + media) / 2;

            if (novaMedia >= 7) {
                System.out.println("\nMédia do aluno (" + nomeDoAluno + "): " + novaMedia);
                System.out.println("Situação do aluno: APROVADO");
            } else {
                System.out.println("\nMédia do aluno: " + novaMedia);
                System.out.println("Situação do aluno (" + nomeDoAluno + "): REPROVADO");
            }
        }
    }
}
