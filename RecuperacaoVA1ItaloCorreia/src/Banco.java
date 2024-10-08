import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Informações do cliente
        String nome = "", endereco = "", sexo = "", cpf = "";
        int idade = 0;
        boolean clienteCadastrado = false;

        // Informações da conta
        String numeroConta = "", agencia = "", banco = "";
        double saldo = 0.0, limiteChequeEspecial = 0.0;
        boolean contaCadastrada = false;

        final double VALOR_CHEQUE_ESPECIAL = 500.0;
        double valorDolar = 5.43; // Valor padrão inicial do dólar

        boolean continuar = true;

        while (continuar) {
            // Exibição do menu
            System.out.println("===== Menu do Banco =====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Conta");
            System.out.println("3. Simular Depósito");
            System.out.println("4. Simular Saque");
            System.out.println("5. Comprar Dólar");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    // Cadastrar Cliente
                    System.out.println("=== Cadastrar Cliente ===");
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Endereço: ");
                    endereco = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = Integer.parseInt(scanner.nextLine());
                    System.out.print("Sexo: ");
                    sexo = scanner.nextLine();
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();
                    clienteCadastrado = true;
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case "2":
                    // Cadastrar Conta
                    if (!clienteCadastrado) {
                        System.out.println("Cadastre um cliente primeiro.");
                    } else {
                        System.out.println("=== Cadastrar Conta ===");
                        System.out.print("Número da Conta: ");
                        numeroConta = scanner.nextLine();
                        System.out.print("Agência: ");
                        agencia = scanner.nextLine();
                        System.out.print("Saldo Inicial: ");
                        saldo = Double.parseDouble(scanner.nextLine());
                        System.out.print("Banco: ");
                        banco = scanner.nextLine();

                        if (idade >= 18) {
                            limiteChequeEspecial = VALOR_CHEQUE_ESPECIAL;
                            System.out.println("Cheque especial de R$ " + VALOR_CHEQUE_ESPECIAL + " concedido.");
                        } else {
                            limiteChequeEspecial = 0.0;
                            System.out.println("Cliente menor de idade, sem cheque especial.");
                        }
                        contaCadastrada = true;
                        System.out.println("Conta cadastrada com sucesso!");
                    }
                    break;

                case "3":
                    // Simular Depósito
                    if (!contaCadastrada) {
                        System.out.println("Cadastre uma conta primeiro.");
                    } else {
                        System.out.println("=== Simular Depósito ===");
                        System.out.print("Valor a ser depositado: ");
                        double deposito = Double.parseDouble(scanner.nextLine());
                        saldo += deposito;
                        System.out.println("Depósito realizado! Saldo atual: R$ " + saldo);
                    }
                    break;

                case "4":
                    // Simular Saque
                    if (!contaCadastrada) {
                        System.out.println("Cadastre uma conta primeiro.");
                    } else {
                        System.out.println("=== Simular Saque ===");
                        System.out.print("Valor a ser sacado: ");
                        double saque = Double.parseDouble(scanner.nextLine());

                        if (saque > saldo + limiteChequeEspecial) {
                            System.out.println("Saldo insuficiente. Operação não realizada.");
                        } else {
                            saldo -= saque;
                            System.out.println("Saque realizado! Saldo atual: R$ " + saldo);
                        }
                    }
                    break;

                case "5":
                    // Comprar Dólar
                    if (!contaCadastrada) {
                        System.out.println("Cadastre uma conta primeiro.");
                    } else {
                        System.out.println("=== Inserir Cotação do Dólar ===");
                        System.out.print("Deseja usar a cotação atual de R$ " + valorDolar + " ou inserir uma nova? (Sim/Não): ");
                        String resposta = scanner.nextLine().toLowerCase();

                        if (resposta.equals("não")) {
                            System.out.print("Informe a nova cotação do dólar: ");
                            valorDolar = Double.parseDouble(scanner.nextLine());
                        }

                        System.out.println("=== Comprar Dólar ===");
                        System.out.print("Valor em Reais: ");
                        double valorReais = Double.parseDouble(scanner.nextLine());
                        double valorConvertido = valorReais / valorDolar;
                        System.out.printf("Você comprou $%.2f dólares. (Taxa de conversão: R$ %.2f)\n", valorConvertido, valorDolar);
                    }
                    break;

                case "6":
                    // Sair
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            if (continuar) {
                System.out.print("Deseja realizar outra operação? (Sim/Não): ");
                String respostaContinuar = scanner.nextLine().toLowerCase();
                continuar = respostaContinuar.equals("sim");
            }
        }
        scanner.close();
    }
}
