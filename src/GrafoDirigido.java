import java.util.Scanner;

public class GrafoDirigido {

    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Definir o tamanho da matriz de adjacência
        int n = 6;

        // Criar uma matriz de adjacência nxn
        int[][] adj = new int[n][n];

        // Ler a matriz de adjacência do usuário
        System.out.println("Digite a matriz de adjacência de um grafo dirigido de " + n + " nós:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }

        // Fechar o scanner
        sc.close();

        // Calcular os graus de entrada e saída de cada nó
        int[] grauEntrada = new int[n];
        int[] grauSaida = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Se há um arco de i para j, incrementar o grau de saída de i e o grau de entrada de j
                if (adj[i][j] == 1) {
                    grauSaida[i]++;
                    grauEntrada[j]++;
                }
            }
        }

        // Imprimir os graus de entrada e saída de cada nó
        System.out.println("Os graus de entrada e saída de cada nó são:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nó " + i + ": grau de entrada = " + grauEntrada[i] + ", grau de saída = " + grauSaida[i]);
        }
    }
}
