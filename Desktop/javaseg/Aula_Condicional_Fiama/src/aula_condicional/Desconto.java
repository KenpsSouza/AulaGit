package aula_condicional;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular o desconto!");
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double desconto = calcularDesconto(valorCompra);
        double valorFinal = valorCompra - desconto;

        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final a pagar: R$ " + valorFinal);

        sc.close();
    }

    public static double calcularDesconto(double valor) {
        double desconto;

      
        if (valor >= 500) {
            desconto = valor * 0.20; // 20% de desconto
        } else if (valor >= 300) {
            desconto = valor * 0.15; // 15% de desconto
        } else if (valor >= 100) {
            desconto = valor * 0.10; // 10% de desconto
        } else {
            desconto = valor * 0.05; // 5% de desconto
        }

        return desconto;
    }
}
