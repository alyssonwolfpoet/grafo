import java.util.Scanner;

public class GrafoDirigido2 {

    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Criar uma matriz de adjacência de tamanho 6x6
        int[][] adj = new int[6][6];

        // Ler a matriz de adjacência do usuário
        System.out.println("Digite uma matriz de adjacência de tamanho 6x6 representando um grafo dirigido de 6 nós:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                adj[i][j] = sc.nextInt();
            }
        }

        // Fechar o scanner
        sc.close();

        // Calcular os graus de entrada e saída de cada nó
        int[] grauEntrada = new int[6];
        int[] grauSaida = new int[6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                // Se há um arco de i para j, incrementar o grau de saída de i e o grau de entrada de j
                if (adj[i][j] == 1) {
                    grauSaida[i]++;
                    grauEntrada[j]++;
                }
            }
        }

        // Imprimir os graus de entrada e saída de cada nó
        System.out.println("Os graus de entrada e saída de cada nó são:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Nó " + i + ": grau de entrada = " + grauEntrada[i] + ", grau de saída = " + grauSaida[i]);
        }
    }
}
