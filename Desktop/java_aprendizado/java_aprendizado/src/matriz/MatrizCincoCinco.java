package matriz;

public class MatrizCincoCinco {
    public static void main(String[] args) {
        // Definindo o tamanho da matriz quadrada
        int tamanho = 7;
        
        // Criando a matriz quadrada
        int[][] matriz = new int[tamanho][tamanho];
        
        // ======== PREENCHIMENTO DA MATRIZ ========
        System.out.println("=== MATRIZ ORIGINAL ===");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                // Preenchendo cada posição com o produto dos índices incrementados
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }
        System.out.println();
        
        // ======== DIAGONAL PRINCIPAL ========
        System.out.println("=== DIAGONAL PRINCIPAL ===");
        System.out.println("(Elementos onde linha = coluna)");
        
        // Extraindo os elementos da diagonal principal
        int[] diagonalPrincipal = new int[tamanho];
        
        // Exibindo a matriz com a diagonal principal destacada
        System.out.println("\nMatriz com diagonal principal destacada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) {
                    // Elemento da diagonal principal
                    System.out.print("[" + matriz[i][j] + "]\t");
                    // Armazenamos o elemento no array da diagonal
                    diagonalPrincipal[i] = matriz[i][i];
                } else {
                    // Outros elementos
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }
        
        // Listando os elementos da diagonal principal
        System.out.println("\nElementos da diagonal principal:");
        for (int valor : diagonalPrincipal) {
            System.out.print(valor + " ");
        }
        System.out.println();
        
        // Calculando a soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int valor : diagonalPrincipal) {
            somaDiagonalPrincipal += valor;
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        
        // ======== DIAGONAL SECUNDÁRIA ========
        System.out.println("\n=== DIAGONAL SECUNDÁRIA ===");
        System.out.println("(Elementos onde linha + coluna = " + (tamanho-1) + ")");
        
        // Extraindo os elementos da diagonal secundária
        int[] diagonalSecundaria = new int[tamanho];
        
        // Exibindo a matriz com a diagonal secundária destacada
        System.out.println("\nMatriz com diagonal secundária destacada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j == tamanho - 1) {
                    // Elemento da diagonal secundária
                    System.out.print("{" + matriz[i][j] + "}\t");
                    // Armazenamos o elemento no array da diagonal
                    diagonalSecundaria[i] = matriz[i][tamanho - 1 - i];
                } else {
                    // Outros elementos
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }
        
        // Listando os elementos da diagonal secundária
        System.out.println("\nElementos da diagonal secundária:");
        for (int valor : diagonalSecundaria) {
            System.out.print(valor + " ");
        }
        System.out.println();
        
        // Calculando a soma dos elementos da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int valor : diagonalSecundaria) {
            somaDiagonalSecundaria += valor;
        }
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        
     
        
        // ======== COMPARAÇÃO ENTRE DIAGONAIS ========
        System.out.println("\n=== COMPARAÇÃO DAS DIAGONAIS ===");
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        
        if (somaDiagonalPrincipal > somaDiagonalSecundaria) {
            System.out.println("A diagonal principal tem maior soma.");
        } else if (somaDiagonalSecundaria > somaDiagonalPrincipal) {
            System.out.println("A diagonal secundária tem maior soma.");
        } else {
            System.out.println("As duas diagonais têm a mesma soma.");
        }
    }
}