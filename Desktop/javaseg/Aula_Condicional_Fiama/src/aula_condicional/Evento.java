package aula_condicional;

import java.util.Scanner;

public class Evento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos verificar se sua entrada é permitida !");
		
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade < 18) {
        	System.out.println("Não permitido a entrada");
        } else {
        
        	System.out.println("Entrada permitida!");
        }
	}

	}


