package aula_condicional;

import java.util.Scanner;

public class Caixa_Eletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0.0; 
        int opcao = 0; // Declarar 'opcao' fora do laço para usá-la após o switch

        System.out.println("Olá!");

        do {
            // Exibe o menu de opções
            System.out.println("\n=== Caixa Eletrônico ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            // Validação para garantir que o usuário digite um número válido
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); // Limpa a entrada inválida
                continue; // Pula para a próxima iteração do loop
            }

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido. O depósito deve ser maior que zero.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = sc.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor inválido. O saque deve ser maior que zero.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado por usar o Caixa Eletrônico!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        sc.close(); // Fechar o scanner após o loop
    }
}
