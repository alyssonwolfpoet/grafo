import java.util.Scanner;

public class Q2a3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de m (máximo 9): ");
        int m = input.nextInt();
        input.close();

        if (m < 0 || m > 9) {
            System.out.println("Valor inválido para m.");
            return;
        }

        int[][] adjMatrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                adjMatrix[i][j] = 1;
            }
        }

        System.out.println("Matriz de adjacência do grafo completo com " + m + " vértices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}