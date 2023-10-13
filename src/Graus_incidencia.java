// Classe que representa um grafo
class Grafo {
    // Número de vértices e arestas
    int n, m;
    // Matriz de incidência
    int[][] matriz;

    // Construtor que recebe o número de vértices e arestas
    public Grafo(int n, int m) {
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
public class Graus_incidencia {
    public static void main(String[] args) {
        // Cria um grafo com 5 vértices e 4 arestas
        Grafo g = new Grafo(5, 4);
        // Adiciona as arestas conforme o enunciado
        g.addAresta(0, 1, 0); // Primeira aresta entre o primeiro e o segundo nó
        g.addAresta(1, 2, 1); // Segunda aresta entre o segundo e o terceiro nó
        g.addAresta(2, 4, 2); // Terceira aresta entre o terceiro e o quinto nó
        g.addAresta(3, 1, 3); // Quarta aresta entre o quarto e o segundo nó
        // Conta os graus dos nós do grafo
        g.contarGraus();
    }
}
    /*
      Saída esperada:
      O grau do nó 0 é 1
      O grau do nó 1 é 3
      O grau do nó 2 é 2
      O grau do nó 3 é 1
      O grau do nó 4 é 1
    */

//       Espero que isso ajude. Você pode encontrar mais informações sobre o conceito de grau de um nó em um grafo na [Wikipédia] ou em outros [sites](https://www.dca.fee.unicamp.br/cursos/EA876/apostila/HTML/node32.html). Se você quiser saber mais sobre como representar um grafo usando a matriz de incidência em Java, você pode consultar este [artigo].
