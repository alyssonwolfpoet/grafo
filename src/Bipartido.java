public class Bipartido {
    public static void main(String[] args) {
        // Definir o número de vértices do grafo
        int n = 6;

        // Criar a matriz de adjacência A com dimensão n x n
        int[][] A = new int[n][n];

        // Preencher a matriz A com os valores correspondentes às arestas do grafo
        A[0][1] = 1; // Aresta de 0 para 1
        A[0][2] = 1; // Aresta de 0 para 2
        A[1][3] = 1; // Aresta de 1 para 3
        A[2][3] = 1; // Aresta de 2 para 3
        A[2][4] = 1; // Aresta de 2 para 4
        A[3][5] = 1; // Aresta de 3 para 5
        A[4][5] = 1; // Aresta de 4 para 5

        // Criar um vetor G com dimensão n para armazenar os graus dos vértices
        int[] G = new int[n];

        // Percorrer a matriz A e calcular os graus dos vértices
        for (int i = 0; i < n; i++) {
            // Inicializar o in-grau e o out-grau do vértice i como zero
            int in = 0;
            int out = 0;
            // Percorrer a linha i da matriz A e somar os valores ao out-grau
            for (int j = 0; j < n; j++) {
                out += A[i][j];
            }
            // Percorrer a coluna i da matriz A e somar os valores ao in-grau
            for (int j = 0; j < n; j++) {
                in += A[j][i];
            }
            // Calcular o grau do vértice i como a soma do in-grau e do out-grau
            G[i] = in + out;
        }

        // Imprimir a matriz A
        System.out.println("Matriz de adjacência:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir o vetor G
        System.out.println("Graus dos vértices:");
        for (int i = 0; i < n; i++) {
            System.out.println("Grau do vértice " + i + ": " + G[i]);
        }
    }
}
