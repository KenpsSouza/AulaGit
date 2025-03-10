package aula_condicional;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        


        System.out.println("Olá, bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 100).");

        
        System.out.print("Digite sua tentativa: ");
        int tentativa = sc.nextInt();

            if (tentativa == numeroAleatorio) {
                System.out.println("Acertou!");
            } else {
            	System.out.println("Número errado! O número era: " + numeroAleatorio);
            }

        sc.close();
    }
}