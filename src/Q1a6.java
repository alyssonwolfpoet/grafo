import java.sql.SQLOutput;

class Grafo3 {
    int n;
    int m;
    int[][] matriz;
    int[] vertices;

    public void setVertices(int[] vertices) {
        this.vertices = vertices;
    }

    public Grafo3(int n, int m) {
        this.n = n;
        this.m = m;
        int [] vet = new int[m];
        // Cria uma matriz n x m com todos os elementos iguais a zero
        matriz = new int[n][m];
        setVertices(vet);

    }



    // Método que adiciona uma aresta não direcionada entre os vértices u e v
    public void addAresta(int u, int v, int e, int peso) {
        // Verifica se os índices são válidos
        if (u >= 0 && u < n && v >= 0 && v < n && e >= 0 && e < m) {
            // Marca os vértices u e v como incidentes à aresta e
            matriz[u][e] = 1;
            matriz[v][e] = 1;
            this.vertices[u] = peso;
        }
    }

    // Método que imprime a matriz de incidência
    public void printMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Character.toString(97+i)+""+j +'='+matriz[i][j] +"["+ this.vertices[j]+"]"+" ");
            }
            System.out.println();
        }
    }

}

class Q1a6 {
    public static void main(String[] args) {
        Grafo3 g = new Grafo3(7,12);
        g.addAresta(0, 0, 0,5); // Primeira aresta entre o primeiro e o segundo nó
        g.addAresta(1, 0, 1,2); // Segunda aresta entre o segundo e o terceiro nó
        g.addAresta(2, 1, 2,4); // Terceira aresta entre o terceiro e o quinto nó
        g.addAresta(3, 1, 0,6); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(4, 0, 0,5); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(5, 0, 0,2); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(6, 0, 0,6); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(7, 0, 0,6); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(8, 0, 0,6); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(9, 0, 0,3); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(10, 0, 0,5); // Quarta aresta entre o quarto e o segundo nó
        g.addAresta(11, 0, 0,4); // Quarta aresta entre o quarto e o segundo nó
        g.printMatriz();



    }
}