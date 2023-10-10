import java.util.Arrays;

public class Q3a3 {
    public static void main(String[] args) {
        // Definir os valores de m e n
        int m = 3; // Número de vértices em U
        int n = 4; // Número de vértices em V

        // Criar a matriz A com dimensão (m+n) x (m+n)
        int[][] A = new int[m + n][m + n];

        // Preencher a submatriz B com 1s
        for (int i = 0; i < m; i++) {
            for (int j = m; j < m + n; j++) {
                A[i][j] = 1;
            }
        }

        // Preencher a submatriz B^T com 1s
        for (int i = m; i < m + n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = 1;
            }
        }

        // Imprimir a matriz A
        for (int i = 0; i < m + n; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
    }
}
