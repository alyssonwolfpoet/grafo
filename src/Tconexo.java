public class Tconexo {
    public static void main(String[] args) {
        int[][] adjMatrix = new int[6][6];

// Inicializa a matriz com zeros
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                adjMatrix[i][j] = 0;
            }
        }

// Adiciona as arestas necessárias para tornar o grafo conexo
        adjMatrix[0][1] = adjMatrix[1][0] = 1;
        adjMatrix[0][2] = adjMatrix[2][0] = 1;
        adjMatrix[0][3] = adjMatrix[3][0] = 1;
        adjMatrix[1][2] = adjMatrix[2][1] = 1;
        adjMatrix[2][3] = adjMatrix[3][2] = 1;

// Certifica-se de que a matriz seja simétrica
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                adjMatrix[j][i] = adjMatrix[i][j];
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (adjMatrix[i][j] > 0) {
                    System.out.print(i + "" + j + " = 1\t");
                } else {
                    System.out.print(i + "" + j + " = 0\t");
                }
            }
            System.out.println();
        }
    }
}
