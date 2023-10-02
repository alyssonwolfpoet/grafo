public class DemoMatrizAdjacencia {

    public static void main(String[] args) {
        //montagem da matriz de adjacencia conforme o grafo
        int[][] graph = {
                {0, 0, 1, 0, 0},//A
                {0, 0, 1, 0, 0},//B
                {1, 1, 0, 1, 1},//C
                {0, 0, 1, 0, 1},//D
                {0, 0, 1, 1, 0}//E
        };

        for (int i = 0; i < 5; i++) { // acessar a linhas
            for (int j = 0; j < 5; j++) { // acessar a colunas
                if (graph[i][j] > 0) { //condição para verificar a ligação
                    System.out.printf("%d%d = 1\t", i, j);
                } else { //senão está ligado
                    System.out.printf("%d%d = 0\t", i, j);
                }
            }
            System.out.println();
        }
    }
}