public class Q3a4 {
    public static void main(String[] args) {
        // Definir o tamanho da matriz de adjacência
        int n = 6;

        // Criar uma matriz de adjacência nxn
        int[][] adj = new int[n][n];

        // Preencher a matriz
        //     0a   1c   2w   3f   4d   5v
        //0a    0   1     0   0     0   1
        //1c   -1   0     1
        //2w       -1         1         -1
        //3f                       -1   -1
        //4d                  1         -1
        //5v   -1         1         1
        adj[0][1] = 1; // Aresta de 0 para 1
        adj[0][5] = 1; // Aresta de 0 para 5
        adj[1][0] = -1; // Aresta de 1 para 0
        adj[1][2] = 1; // Aresta de 1 para 2
        adj[2][1] = -1; // Aresta de 1 para 2
        adj[2][3] = 1; // Aresta de 0 para 1
        adj[2][5] = -1; // Aresta de 0 para 1
        adj[3][4] = -1; // Aresta de 0 para 1
        adj[3][5] = -1; // Aresta de 0 para 1
        adj[4][3] = 1; // Aresta de 0 para 1
        adj[4][5] = -1; // Aresta de 0 para 1
        adj[5][0] = -1; // Aresta de 0 para 1
        adj[5][2] = 1; // Aresta de 0 para 1
        adj[5][4] = 1; // Aresta de 0 para 1


        // Criar um vetor in e out com dimensão n para armazenar os graus dos vértices
        int[] in = new int[n];
        int[] out = new int[n];
        // Percorrer a matriz A e calcular os graus dos vértices
        for (int i = 0; i < n; i++) {
            // Inicializar o in-grau e o out-grau do vértice i como zero
            int ingrau = 0;
            int outgrau = 0;
            // Percorrer a linha i da matriz  e somar os valores e entrada e saida
            for (int j = 0; j < n; j++) {
                if (adj[i][j] == 1) {
                    in[i]++;
                }
                if (adj[i][j] == -1) {
                    out[i]++;
                }
            }
        }
        // Imprimir a matriz adj
        System.out.println("Matriz de adjacência:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir saida e entrada de cada no
        System.out.println("Graus dos vértices:");
        for (int i = 0; i < n; i++) {
            System.out.println("Grau do vértice " + i + " " + "saida:" + in[i] + " entrada:" + out[i]);
        }
    }
}
