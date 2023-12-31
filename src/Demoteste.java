import java.util.*;

// Classe que representa uma aresta com origem, destino e peso
class Aresta implements Comparable<Aresta> {
    int origem, destino, peso;

    // Construtor da classe
    public Aresta(int origem, int destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    // Método para comparar duas arestas pelo peso
    public int compareTo(Aresta aresta) {
        return this.peso - aresta.peso;
    }
}

// Classe que representa um grafo com vértices e arestas
class Grafotest {
    int vertices; // Número de vértices do grafo
    LinkedList<Aresta> arestas; // Lista de arestas do grafo

    // Construtor da classe
    public Grafotest(int vertices) {
        this.vertices = vertices;
        arestas = new LinkedList<>();
    }

    // Método para adicionar uma aresta ao grafo
    public void adicionarAresta(int origem, int destino, int peso) {
        Aresta aresta = new Aresta(origem, destino, peso);
        arestas.add(aresta); // Adiciona a aresta à lista de arestas
    }

    // Método para encontrar a árvore geradora mínima usando o algoritmo de Kruskal
    public Grafotest kruskal() {
        Grafotest mst = new Grafotest(vertices); // Cria um novo grafo para armazenar a árvore geradora mínima
        int[] pai = new int[vertices]; // Cria um vetor para armazenar o pai de cada vértice

        // Inicializa o vetor de pais com -1, indicando que todos os vértices são raízes
        for (int i = 0; i < vertices; i++) {
            pai[i] = -1;
        }

        // Ordena as arestas do grafo em ordem crescente de peso
        Collections.sort(arestas);

        // Percorre as arestas do grafo ordenado
        for (Aresta aresta : arestas) {
            // Encontra o pai dos vértices de origem e destino da aresta
            int x = encontrar(pai, aresta.origem);
            int y = encontrar(pai, aresta.destino);

            // Se os pais forem diferentes, significa que a aresta não forma um ciclo
            if (x != y) {
                // Adiciona a aresta à árvore geradora mínima
                mst.adicionarAresta(aresta.origem, aresta.destino, aresta.peso);
                // Faz a união dos conjuntos dos vértices de origem e destino da aresta
                unir(pai, x, y);
            }
        }

        // Retorna a árvore geradora mínima
        return mst;
    }

    // Método para encontrar o pai de um vértice usando o algoritmo de find-union
    public int encontrar(int[] pai, int i) {
        // Se o pai do vértice for -1, significa que ele é a raiz do seu conjunto
        if (pai[i] == -1)
            return i;
        // Senão, procura o pai do pai do vértice recursivamente
        return encontrar(pai, pai[i]);
    }

    // Método para fazer a união de dois conjuntos usando o algoritmo de find-union
    public void unir(int[] pai, int x, int y) {
        // Encontra o pai dos conjuntos de x e y
        int xset = encontrar(pai, x);
        int yset = encontrar(pai, y);
        // Faz o pai de x ser o pai de y
        pai[xset] = yset;
    }

    // Método para encontrar a árvore geradora mínima usando o algoritmo de Prim
    public Grafotest prim() {
        Grafotest mst = new Grafotest(vertices); // Cria um novo grafo para armazenar a árvore geradora mínima
        boolean[] visitado = new boolean[vertices]; // Cria um vetor para marcar os vértices visitados
        int[] chave = new int[vertices]; // Cria um vetor para armazenar a chave de cada vértice (o menor peso das arestas incidentes nele)
        int[] pai = new int[vertices]; // Cria um vetor para armazenar o pai de cada vértice na árvore geradora mínima

        // Inicializa o vetor de chaves com um valor infinito e o vetor de pais com -1
        for (int i = 0; i < vertices; i++) {
            chave[i] = Integer.MAX_VALUE;
            pai[i] = -1;
        }

        // Escolhe o vértice 0 como origem e atribui sua chave como 0
        chave[0] = 0;

        // Cria uma fila de prioridade para armazenar os vértices pelo valor da chave
        PriorityQueue<Pair<Integer, Integer>> fila = new PriorityQueue<>(vertices, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                // Compara os vértices pelo valor da chave
                int chave1 = p1.getKey();
                int chave2 = p2.getKey();
                return chave1 - chave2;
            }
        });

        // Adiciona o vértice 0 à fila com chave 0
        fila.offer(new Pair<>(chave[0], 0));

        // Enquanto a fila não estiver vazia
        while (!fila.isEmpty()) {
            // Remove o vértice com a menor chave da fila
            Pair<Integer, Integer> par = fila.poll();
            int u = par.getValue();

            // Marca o vértice como visitado
            visitado[u] = true;

            // Percorre as arestas do vértice removido
            for (Aresta aresta : arestas) {
                // Se a aresta tem origem em u
                if (aresta.origem == u) {
                    int v = aresta.destino; // Obtém o vértice destino da aresta
                    int peso = aresta.peso; // Obtém o peso da aresta

                    // Se o vértice destino não foi visitado e o peso da aresta é menor que a chave do vértice destino
                    if (!visitado[v] && peso < chave[v]) {
                        // Atualiza a chave do vértice destino
                        chave[v] = peso;
                        // Adiciona ou atualiza o vértice destino na fila com a nova chave
                        fila.offer(new Pair<>(chave[v], v));
                        // Atualiza o pai do vértice destino na árvore geradora mínima
                        pai[v] = u;
                    }
                }
            }
        }

        // Percorre o vetor de pais e adiciona as arestas correspondentes à árvore geradora mínima
        for (int i = 1; i < vertices; i++) {
            mst.adicionarAresta(pai[i], i, chave[i]);
        }

        // Retorna a árvore geradora mínima
        return mst;
    }

    // Método para imprimir o grafo na tela
    public void imprimir() {
        System.out.println("Grafo: ");
        for (Aresta aresta : arestas) {
            System.out.println(aresta.origem + " - " + aresta.destino + " : " + aresta.peso);
        }
    }

    // Método para calcular o peso total do grafo
    public int pesoTotal() {
        int peso = 0;
        for (Aresta aresta : arestas) {
            peso += aresta.peso;
        }
        return peso;
    }
}

// Classe que representa um par de valores genéricos
class Pair<K, V> {
    K key; // Primeiro valor do par
    V value; // Segundo valor do par

    // Construtor da classe
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Método para obter o primeiro valor do par
    public K getKey() {
        return key;
    }

    // Método para obter o segundo valor do par
    public V getValue() {
        return value;
    }
}

// Classe principal com o método main
public class Demoteste {

    public static void main(String[] args) {

        Grafotest grafotest = new Grafotest(9); // Cria um grafo com 9 vértices

        // Adiciona as arestas ao grafo com os respectivos pesos
        grafotest.adicionarAresta(0, 1, 4);
        grafotest.adicionarAresta(0, 7, 8);
        grafotest.adicionarAresta(1, 2, 8);
        grafotest.adicionarAresta(1, 7, 8);
    }
}