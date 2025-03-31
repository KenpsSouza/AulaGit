package vetores;


import java.util.Random;
import java.util.Scanner;

public class Exercic4 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[15];
        Random random = new Random();
        
        System.out.println("Números gerados: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; 
            System.out.print(numeros[i] + " ");
        }
        
        int contarPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) { 
                contarPares++;
            }
        }
        
        
        System.out.println("Quantidade de números pares: " + contarPares);

        sc.close();     
        
	}

}
