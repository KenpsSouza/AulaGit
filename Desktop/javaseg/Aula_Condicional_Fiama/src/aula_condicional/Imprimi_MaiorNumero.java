package aula_condicional;

import java.util.Scanner;

public class Imprimi_MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita os dois números ao usuário
        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        // Verifica e imprime o maior número
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }

        sc.close(); 
    }
}
