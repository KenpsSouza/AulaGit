package aula_condicional;

import java.util.Scanner;

public class Condicional_um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print ("Digite a sua idade");
        int idade = sc.nextInt();
        
        if (idade> 59) {
        	System.out.println("Ele é idoso");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("É Adulto");
        } else {
        
        	System.out.println("É criança");
        }
	}

}
