public class MatrixIncidencia {
    public static void main(String[] args) {
        // Define o número de vértices e arestas do grafo
        int n = 4; // Número de vértices
        int m = 5; // Número de arestas

// Cria uma matriz bidimensional de tamanho n x m
        int[][] incidenceMat = new int[n][m];

// Atribui 1 para cada elemento que corresponde a uma aresta que incide em um vértice
// Aresta 0: conecta os vértices 0 e 1
        incidenceMat[0][0] = 1;
        incidenceMat[1][0] = 1;

// Aresta 1: conecta os vértices 0 e 2
        incidenceMat[0][1] = 1;
        incidenceMat[2][1] = 1;

// Aresta 2: conecta os vértices 0 e 3
        incidenceMat[0][2] = 1;
        incidenceMat[3][2] = 1;

// Aresta 3: conecta os vértices 1 e 2
        incidenceMat[1][3] = 1;
        incidenceMat[2][3] = 1;

// Aresta 4: conecta os vértices 2 e 3
        incidenceMat[2][4] = 1;
        incidenceMat[3][4] = 1;

// Imprime a matriz de incidência
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(incidenceMat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
