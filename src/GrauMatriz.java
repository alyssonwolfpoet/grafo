import java.util.Scanner;

public class GrauMatriz {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lendo o número de nós do grafo
        System.out.println("Digite o número de nós do grafo:");
        int n = sc.nextInt();

        // Criando a matriz de adjacências com os pesos das arestas
        int[][] matriz = new int[n][n];

        // Lendo as arestas do grafo
        System.out.println("Digite as arestas do grafo no formato \"origem destino peso\":");
        System.out.println("Digite -1 para encerrar a entrada:");
        while (true) {
            // Lendo a origem, o destino e o peso da aresta
            int origem = sc.nextInt();
            // Se for -1, encerra o loop
            if (origem == -1) {
                break;
            }
            int destino = sc.nextInt();
            int peso = sc.nextInt();
            // Armazenando o peso na posição correspondente da matriz
            matriz[origem][destino] = peso;
            // Se o grafo for não-direcionado, armazena também na posição simétrica
            //matriz[destino][origem] = peso;
        }

        // Contando e imprimindo o grau de cada nó
        System.out.println("O grau de cada nó do grafo é:");
        for (int i = 0; i < n; i++) {
            // Inicializando o grau do nó i como zero
            int grau = 0;
            // Percorrendo a linha ou a coluna correspondente ao nó i na matriz
            for (int j = 0; j < n; j++) {
                // Se houver uma aresta entre os nós i e j, soma o peso ao grau
                if (matriz[i][j] > 0) {
                    grau += matriz[i][j];
                }
            }
            // Imprimindo o grau do nó i
            System.out.println("Nó " + i + ": " + grau);
        }
    }
}
