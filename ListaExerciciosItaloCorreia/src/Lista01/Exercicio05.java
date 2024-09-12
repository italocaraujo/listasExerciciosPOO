package Lista01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        double litrosUsados, tempo, velocidadeMedia, distancia;

        // Solicitação e leitura da velocidade média e do tempo
        System.out.println("Informe o tempo da viagem (Horas): ");
        tempo = scanner.nextDouble();

        System.out.println("Informe a velocidade média em Km/h: ");
        velocidadeMedia = scanner.nextDouble();

        // Cálculo da distância
        distancia = tempo * velocidadeMedia;

        // Cálculo da quantidade de litros usados
        litrosUsados = distancia / 12;

        // Resultados
        System.out.println("\n--- Resumo da Viagem ---");
        System.out.println("Velocidade média: " + velocidadeMedia + " Km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " Km");
        System.out.println("Litros de combustível utilizados: " + String.format("%.2f", litrosUsados) + " litros");
    }
}
