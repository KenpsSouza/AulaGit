package aula_condicional;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, verificar sua tabuada!");
        
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        int i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        sc.close();
    }
}