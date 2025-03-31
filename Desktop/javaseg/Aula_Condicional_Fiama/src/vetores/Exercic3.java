package vetores;

import java.util.Random;
import java.util.Scanner;

public class Exercic3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];
        Random random = new Random();
        
        System.out.println("Números gerados: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; 
            System.out.print(numeros[i] + " ");
        }
        
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println(" ");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();

        
	}

}
