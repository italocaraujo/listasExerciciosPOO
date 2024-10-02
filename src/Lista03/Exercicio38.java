package Lista03;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados
        char encerrar;

        // Variáveis
        int codigo, horasTrabalhadas, limiteHoras, horasExtras;
        double valorHora, valorHoraExcedente;

        // Loop para continuar o programa até o usuário escolher encerrar
        do {
            // Leitura do código e das horas trabalhadas
            System.out.print("Digite o código do operário: ");
            codigo = scanner.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            horasTrabalhadas = scanner.nextInt();

            // Constantes
            valorHora = 10.00;
            valorHoraExcedente = 20.00;
            limiteHoras = 50;

            // Cálculo do salário
            double salarioBase;
            double salarioExcedente = 0.0;

            if (horasTrabalhadas > limiteHoras) {
                // Cálculo quando há horas excedentes
                salarioBase = limiteHoras * valorHora;
                horasExtras = horasTrabalhadas - limiteHoras;
                salarioExcedente = horasExtras * valorHoraExcedente;
            } else {
                // Cálculo quando não há horas excedentes
                salarioBase = horasTrabalhadas * valorHora;
            }

            // Salário total é a soma do salário base e do excedente
            double salarioTotal = salarioBase + salarioExcedente;

            // Exibe os resultados
            System.out.println("Código do operário: " + codigo);
            System.out.println("Salário total: R$ " + salarioTotal);
            System.out.println("Salário excedente: R$ " + salarioExcedente);

            // Pergunta ao usuário se deseja encerrar o programa
            System.out.print("Deseja encerrar o programa? (S/s para Sim, qualquer outra tecla para continuar): ");
            encerrar = scanner.next().charAt(0);

        } while (encerrar != 'S' && encerrar != 's');  // Continua enquanto o usuário não digitar 'S' ou 's'

        System.out.println("Programa encerrado.");
        // Fecha o scanner para liberação de recursos
        scanner.close();
    }
}
