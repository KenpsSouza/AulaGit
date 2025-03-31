package vetores;

import java.util.Scanner;


public class Exercic1 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        int[] numeros = new int[5];
        
        System.out.println("Olá, vamos verificar uma lista!");
        
        System.out.println("Digite 5 números para preencher o array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Valores do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Elemento " + i + ":" +  numeros[i]  + "  |  ");
            
        }
        

	}

}
