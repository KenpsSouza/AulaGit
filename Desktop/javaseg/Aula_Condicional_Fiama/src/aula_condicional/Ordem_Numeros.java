package aula_condicional;

import java.util.Scanner;

public class Ordem_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

        // Ordenação usando estrutura condicional
        double menor, meio, maior;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        // Exibe os números em ordem crescente
        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

        sc.close();
    }
}
