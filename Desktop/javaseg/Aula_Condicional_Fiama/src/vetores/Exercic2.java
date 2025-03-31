package vetores;

import java.util.Random;
import java.util.Scanner;



public class Exercic2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         
		int[] numeros = new int[10];
        Random random = new Random();

		
		
        System.out.print("Números gerados: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; 
            System.out.print(numeros[i] + " ");
        }
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("\nSoma total: " + soma);
        
	}
	    
	
}
