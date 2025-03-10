package aula_condicional;

import java.util.Scanner;

public class Ano_Bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, vamos verificar ano bissexto!");
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        // Verifica se o ano é bissexto
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        sc.close(); 
    }
}
