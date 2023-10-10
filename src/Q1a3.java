public class Q1a3 {
    public static void main(String[] args) {
        int[][] graf = {
                {0,1,1,1,1},
                {1,0,1,1,1},
                {1,1,0,1,1},
                {1,1,1,0,1},
                {1,1,1,1,0}
        };
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(graf[i][j] > 0) {
                    System.out.print(i + "" + j + " = 1\t");
                } else {
                    System.out.print(i + "" + j + " = 0\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}