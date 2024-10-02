package Lista03;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Comando para habilitar a leitura de dados
        char encerrar;

        // Loop que continua até o usuário escolher encerrar o programa
        do {
            // Solicita ao usuário o índice de poluição
            System.out.print("Digite o índice de poluição (de 0,05 a 0,50): ");
            double indicePoluicao = scanner.nextDouble();

            // Verifica o valor do índice e emite as notificações apropriadas
            if (indicePoluicao < 0.05 || indicePoluicao > 0.50) {
                System.out.println("Índice de poluição fora do intervalo aceitável. Informe um valor entre 0,05 e 0,50.");
            } else if (indicePoluicao >= 0.50) {
                System.out.println("Notificação: Todas as indústrias devem paralisar suas atividades.");
            } else if (indicePoluicao >= 0.40) {
                System.out.println("Notificação: Indústrias dos 1º e 2º grupos devem paralisar suas atividades.");
            } else if (indicePoluicao >= 0.30) {
                System.out.println("Notificação: Indústrias do 1º grupo devem paralisar suas atividades.");
            } else {
                System.out.println("Índice de poluição está dentro dos limites aceitáveis. Nenhuma notificação necessária.");
            }

            // Pergunta ao usuário se deseja encerrar o programa
            System.out.print("Deseja encerrar o programa? (S/s para Sim, qualquer outra tecla para continuar): ");
            encerrar = scanner.next().charAt(0);

        } while (encerrar != 'S' && encerrar != 's'); // Continua o loop enquanto o usuário não digitar 'S' ou 's'

        System.out.println("Programa encerrado.");
        scanner.close();  // Fecha o scanner para liberar recursos
    }
}
