package aula_condicional;

import java.util.Scanner;

public class Vencedor_Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite a pontuação do Jogador 1: ");
        int pontuacaoJogador1 = sc.nextInt();

        System.out.print("Digite a pontuação do Jogador 2: ");
        int pontuacaoJogador2 = sc.nextInt();

     
        if (pontuacaoJogador1 > pontuacaoJogador2) {
            System.out.println("Jogador 1 venceu!");
        } else if (pontuacaoJogador2 > pontuacaoJogador1) {
            System.out.println("Jogador 2 venceu!");
        } else {
            System.out.println("Empate!");
        }

        sc.close();
    }
}

