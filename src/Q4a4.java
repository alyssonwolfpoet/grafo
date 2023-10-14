// Classe que representa um grafo
class GrafoIncidencia2 {
    // Número de vértices e arestas
    int n, m;
    // Matriz de incidência
    int[][] matriz;

    // Construtor que recebe o número de vértices e arestas
    public GrafoIncidencia2(int n, int m) {
        this.n = n;
        this.m = m;
        // Cria uma matriz n x m com todos os elementos iguais a zero
        matriz = new int[n][m];
    }

    // Método que adiciona uma aresta não direcionada entre os vértices u e v
    public void addAresta(int u, int v, int e) {
        // Verifica se os índices são válidos
        if (u >= 0 && u < n && v >= 0 && v < n && e >= 0 && e < m) {
            // Marca os vértices u e v como incidentes à aresta e
            matriz[u][e] = 1;
            matriz[v][e] = 1;
        }
    }

    // Método que imprime a matriz de incidência
    public void printMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método que conta o grau de cada nó do grafo
    public void contarGraus() {
        // Cria um vetor para armazenar os graus dos nós
        int[] graus = new int[n];
        // Percorre a matriz de incidência somando os valores de cada linha
        for (int i = 0; i < n; i++) {
            int soma = 0;
            for (int j = 0; j < m; j++) {
                soma += matriz[i][j];
            }
            // Armazena o grau do nó i no vetor
            graus[i] = soma;
        }
        // Imprime os graus dos nós
        for (int i = 0; i < n; i++) {
            System.out.println("O grau do nó " + i + " é " + graus[i]);
        }
    }
}

// Classe principal para testar o código
public class Q4a4 {
    public static void main(String[] args) {
        // Cria um grafo com 9 vértices e 8 arestas
        GrafoIncidencia2 g = new GrafoIncidencia2(9, 8);
        // Adiciona as arestas conforme o enunciado
        g.addAresta(0, 1, 0); // Primeira aresta entre o primeiro e o Segundo nó
        g.addAresta(0, 2, 1); // Segunda aresta entre o Primeiro e o Terceiro nó
        g.addAresta(0, 3, 2); // Terceira aresta entre o Primeiro e o quarto nó
        g.addAresta(0, 4, 3); // Quarta aresta entre o Primeiro e o quinto nó
        g.addAresta(1, 5, 4); // Quinta aresta entre o Segundo e o Sexto nó
        g.addAresta(1, 6, 5); // Sexta aresta entre o Quarto e o Setimo nó
        g.addAresta(3, 7, 6); // Setima aresta entre o Quarto e o Oitavo nó
        g.addAresta(4, 8, 7); // Oitava aresta entre o Quinto e o Nono nó
        // Imprime a matriz de incidência
        g.printMatriz();
        // Conta os graus dos nós do grafo
        g.contarGraus();
    }
}
    
    /*
      Saída esperada:
      1 0 1 1 0 0 0 0
      1 0 0 0 1 1 0 0
      0 0 0 0 0 0 0 0
      0 0 1 0 0 0 1 0
      0 0 1 1 0 0 0 1
      0 0 0 0 1 0 0 0
      0 0 0 0 0 1 0 0
      0 0 0 0 0 0 1 0
      0 0 0 0 0 0 0 1

    */