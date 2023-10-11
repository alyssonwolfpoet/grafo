import java.util.Scanner;

public class Graph {
    // Atributos da classe Graph
    private int[][] adj; // Matriz de adjacência
    private int V; // Número de vértices
    private int A; // Número de arcos

    // Construtor da classe Graph
    public Graph(int V) {
        this.V = V;
        this.A = 0;
        this.adj = new int[V][V]; // Inicializa a matriz com zeros
    }

    // Método que calcula o grau de entrada de um vértice
    public int inDegree(int v) {
        int degree = 0;
        for (int i = 0; i < V; i++) {
            if (adj[i][v] == 1) { // Se existe um arco que entra em v
                degree++; // Incrementa o grau
            }
        }
        return degree;
    }

    // Método que calcula o grau de saída de um vértice
    public int outDegree(int v) {
        int degree = 0;
        for (int j = 0; j < V; j++) {
            if (adj[v][j] == 1) { // Se existe um arco que sai de v
                degree++; // Incrementa o grau
            }
        }
        return degree;
    }

    // Método principal que executa o programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.println("Digite o número de vértices do grafo:");
        int V = sc.nextInt(); // Lê o número de vértices
        if (V != 6) { // Verifica se o número é válido
            System.out.println("O número de vértices deve ser igual a 6.");
            return;
        }
        Graph g = new Graph(V); // Cria um objeto Graph com V vértices
        System.out.println("Digite os valores da matriz de adjacência do grafo:");
        for (int i = 0; i < V; i++) { // Percorre as linhas da matriz
            for (int j = 0; j < V; j++) { // Percorre as colunas da matriz
                int value = sc.nextInt(); // Lê o valor da matriz
                if (value != 0 && value != 1) { // Verifica se o valor é válido
                    System.out.println("O valor da matriz deve ser 0 ou 1.");
                    return;
                }
                g.adj[i][j] = value; // Armazena o valor na matriz de adjacência
                if (value == 1) { // Se existe um arco entre os vértices i e j
                    g.A++; // Incrementa o número de arcos
                }
            }
        }
        System.out.println("O grafo tem " + g.V + " vértices e " + g.A + " arcos.");
        System.out.println("Os graus de entrada e saída de cada vértice são:");
        System.out.println("Vértice\tEntrada\tSaída");
        for (int v = 0; v < V; v++) { // Percorre os vértices do grafo
            int in = g.inDegree(v); // Calcula o grau de entrada do vértice v
            int out = g.outDegree(v); // Calcula o grau de saída do vértice v
            System.out.println(v + "\t" + in + "\t" + out); // Imprime os resultados
        }
    }
}
