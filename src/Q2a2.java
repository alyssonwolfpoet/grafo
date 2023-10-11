import java.util.Scanner;

public class Q2a2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//inicialização do objeto para leitura
        System.out.print("Digite o valor de m (máximo 9): ");
        int m = input.nextInt();//ler a quantidade de no
        input.close();//fecha o objeto de leitura

        if (m < 0 || m > 9) {//verifica se é de 0 a 9
            System.out.println("Valor inválido para m.");
            return;
        }

        int[][] adjMatrix = new int[m][m];//inicializa a matriz
        for (int i = 0; i < m; i++) {// acessar a linhas
            for (int j = 0; j < m; j++) {//acessar a coluna
                if (adjMatrix[i]==adjMatrix[j]){ //condicao para nao ter laco
                    adjMatrix[i][j]=0; //adiciona 0
                }else{adjMatrix[i][j] = 1;} // adiciona valor 1)
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