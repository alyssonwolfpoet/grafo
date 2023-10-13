// Classe que representa um grafo
class Grafo2 {
    // Número de vértices e arestas
    int n, m;
    // Matriz de incidência
    int[][] matriz;

    // Construtor que recebe o número de vértices e arestas
    public Grafo2(int n, int m) {
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
}

// Classe principal para testar o código
public class Grafo_matriz_de_incidência {
    public static void main(String[] args) {
        // Cria um grafo com 5 vértices e 4 arestas
        Grafo2 g = new Grafo2(5, 4);
        // Adiciona as arestas conforme o enunciado
        g.addAresta(0, 1, 0); // Primeira aresta entre o primeiro e o segundo nó
        g.addAresta(1, 2, 1); // Segunda aresta entre o segundo e o terceiro nó
        g.addAresta(2, 4, 2); // Terceira aresta entre o terceiro e o quinto nó
        g.addAresta(3, 1, 3); // Quarta aresta entre o quarto e o segundo nó
        // Imprime a matriz de incidência
        g.printMatriz();
    }
}
    
    /*
      Saída esperada:
      1 0 0 0 
      1 1 0 1 
      0 1 1 0 
      0 0 0 1 
      0 0 1 0 
    */

        //Espero que isso ajude. Você pode encontrar mais informações sobre a matriz de incidência na [Wikipédia](https://pt.wikipedia.org/wiki/Matriz_de_incid%C3%AAncia) ou em outros [sites](https://www.freecodecamp.org/portuguese/learn/coding-interview-prep/data-structures/incidence-matrix). Se você quiser saber mais sobre como representar um grafo usando a matriz de incidência em Java, você pode consultar este [artigo](https://acervolima.com/como-representar-o-grafico-usando-a-matriz-de-incidencia-em-java/).