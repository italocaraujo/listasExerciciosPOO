package Lista03;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados

        // Variáveis
        int matricula;
        double nota;
        double somaNotas = 0;
        int contadorAlunos = 0;

        System.out.println("Digite o número de matrícula do aluno (número negativo para encerrar):");

        // Loop para entrada de dados
        while (true) {
            // Lê o número de matrícula do aluno
            matricula = scanner.nextInt();

            // Condição de parada (número negativo encerra o loop)
            if (matricula < 0) {
                break;
            }

            // Lê a nota do aluno
            System.out.println("Digite a nota do aluno de matrícula " + matricula + ":");
            nota = scanner.nextDouble();

            // Acumula a soma das notas e incrementa o contador de alunos
            somaNotas += nota;
            contadorAlunos++;
        }

        // Verifica se ao menos um aluno foi cadastrado para evitar divisão por zero
        if (contadorAlunos > 0) {
            double media = somaNotas / contadorAlunos;
            System.out.println("A média das notas da turma é: " + media);
        } else {
            System.out.println("Nenhum aluno foi cadastrado.");
        }

        // Fecha o scanner para liberação de recursos
        scanner.close();
    }
}
