package aula_condicional;

import java.util.Scanner;

public class Verificar_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a nota!");
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        // Verifica se a nota é suficiente para aprovação
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
