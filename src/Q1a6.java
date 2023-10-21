
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
       // if (u >= 0 && u < n && v >= 0 && v < n && e >= 0 && e < m) {
            // Marca os vértices u e v como incidentes à aresta e
            matriz[u][e] = 1;
            matriz[v][e] = 1;
            this.vertices[e] = peso;
       //}
    }

    // Método que imprime a matriz de incidência
    public void printMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Character.toString(97+i)+j +'='+matriz[i][j] +"["+ this.vertices[j]+"]"+" ");
            }
            System.out.println();
        }
    }

}

class Q1a6 {
    public static void main(String[] args) {
        Grafo3 g = new Grafo3(7,12);
        g.addAresta(0, 1, 0,5); // Primeira aresta entre o primeiro e o Segundo nó
        g.addAresta(0, 2, 1,3); // Segunda aresta entre o Primeiro e o Terceiro nó
        g.addAresta(1, 2, 2,4); // Terceira aresta entre o Segundo e o Terceiro nó
        g.addAresta(1, 3, 3,6); // Quarta aresta entre o Segunda e o Quarto nó
        g.addAresta(2, 3, 4,5); // Quinta aresta entre o Terceiro e o quarto nó
        g.addAresta(1, 4, 5,2); // Sexta aresta entre o Segundo e o Quinto nó
        g.addAresta(2, 5, 6,6); // Setima aresta entre o Terceiro e o Sexto nó
        g.addAresta(3, 4, 7,6); // Oitava aresta entre o Quarto e o Quinto nó
        g.addAresta(3, 5, 8,6); // Nona aresta entre o Quarto e o Sexto nó
        g.addAresta(4, 5, 9,3); // Decima aresta entre o Quinto e o Sexto nó
        g.addAresta(4, 6, 10,5); // Decima Primeira aresta entre o Quinto e o Setimo nó
        g.addAresta(5, 6, 11,4); // Decima Segunda aresta entre o Sexto e o Setimo nó
        g.printMatriz();

    }
}
