package aula_condicional;

import java.util.Scanner;

public class Verificar_Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        // Verifica se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        sc.close(); 
    }
}
