public class Q1a2 {
    public static void main(String[] args) {
        //montagem da matriz de adjacencia conforme o grafo
        int[][] graf = {
                {0, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 0}
        };
        for (int i = 0; i < 6; i++) {// acessar a linhas
            for (int j = 0; j < 6; j++) {// acessar a colunas
                if (graf[i][j] > 0) {//condição para verificar a ligação
                    System.out.print(i + "" + j + " = 1\t");
                } else {//senão está ligado
                    System.out.print(i + "" + j + " = 0\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}