public class MatrizExemplo {

    // Ponto de entrada do programa.
    public static void main(String[] args) {

        // Cria e preenche uma matriz de inteiros com três linhas e três colunas.
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Percorre as linhas da matriz.
        for (int linha = 0; linha < matriz.length; linha++) {

            // Percorre as colunas da linha atual.
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }

            // Inicia uma nova linha após imprimir todas as colunas da linha atual.
            System.out.println();
        }
    }
}