package aula_condicional;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Olá, vamos verificar se o número é par ou impar");

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }
}