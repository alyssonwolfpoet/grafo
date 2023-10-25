import java.util.*;

public class TopologicalSort {

    // Classe auxiliar para representar um grafo como uma lista de adjacências
    static class Graph {
        int V; // Número de vértices
        List<Integer>[] adj; // Lista de adjacências

        // Construtor
        public Graph(int V) {
            this.V = V;
            adj = new List[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        // Método para adicionar uma aresta direcionada de u para v
        public void addEdge(int u, int v) {
            adj[u].add(v);
        }
    }

    // Método para fazer a ordenação topológica de um grafo
    public static List<Integer> topologicalSort(Graph g) {
        List<Integer> order = new ArrayList<>(); // Lista que vai conter a ordenação
        int[] indegree = new int[g.V]; // Vetor que guarda o grau de entrada de cada vértice
        Queue<Integer> queue = new LinkedList<>(); // Fila que guarda os vértices sem arestas de entrada

        // Inicializar o vetor de grau de entrada e a fila
        for (int u = 0; u < g.V; u++) {
            for (int v : g.adj[u]) {
                indegree[v]++;
            }
        }
        for (int u = 0; u < g.V; u++) {
            if (indegree[u] == 0) {
                queue.add(u);
            }
        }

        // Repetir até que a fila esteja vazia
        while (!queue.isEmpty()) {
            int u = queue.poll(); // Remover um vértice da fila
            order.add(u); // Inserir na lista de ordenação
            for (int v : g.adj[u]) { // Para cada vértice adjacente a u
                indegree[v]--; // Decrementar o grau de entrada
                if (indegree[v] == 0) { // Se ficou sem arestas de entrada
                    queue.add(v); // Inserir na fila
                }
            }
        }

        // Verificar se o grafo tem ciclos
        if (order.size() != g.V) {
            System.out.println("O grafo tem pelo menos um ciclo e não é possível fazer a ordenação topológica.");
            return null;
        }

        // Retornar a lista de ordenação
        return order;
    }

    // Método principal para testar o código
    public static void main(String[] args) {
        // Criar um grafo de exemplo
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        // Fazer a ordenação topológica e imprimir o resultado
        List<Integer> order = topologicalSort(g);
        if (order != null) {
            System.out.println("A ordenação topológica do grafo é: " + order);
        }
    }
}