package Lista03;

import java.math.BigInteger; // Importa a classe BigInteger para lidar com números muito grandes

public class Exercicio43 {
    public static void main(String[] args) {
        /*
            Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria qualquer preço. O monge, necessitando de
            alimentos, indagou à rainha sobre o pagamento, se poderia ser feito com grãos de trigo dispostos em um tabuleiro
            de xadrez, de tal forma que o primeiro quadro deveria conter apenas um grão e os quadros subseqüentes, o dobro
            do quadro anterior. A rainha achou o trabalho barato e pediu que o serviço fosse executado, sem se dar conta de
            que seria impossível efetuar o pagamento. Faça um programa para calcular o número de grãos que o monge
            esperava receber.
        */

        final int NUMERO_DE_CASAS = 64; // Número de casas no tabuleiro de xadrez
        BigInteger totalGraos = BigInteger.ZERO; // Total de grãos de trigo
        BigInteger graosCasaAtual = BigInteger.ONE; // Número de grãos na casa atual, começando com 1

        // Loop para calcular o total de grãos em todas as casas
        for (int i = 1; i <= NUMERO_DE_CASAS; i++) {
            totalGraos = totalGraos.add(graosCasaAtual); // Adiciona os grãos da casa atual ao total
            graosCasaAtual = graosCasaAtual.multiply(BigInteger.valueOf(2)); // Dobra o número de grãos para a próxima casa
        }

        // Total de grãos
        System.out.println("Número total de grãos de trigo: " + totalGraos);
    }
}
