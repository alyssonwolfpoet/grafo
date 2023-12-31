public class Aula7 {
    public static void main(String[] args) {
        int[][] graf = {
                {0, 1, 0, -1, 0},
                {-1, 0, 1, 0, 1},
                {0, -1, 0, 0, -1},
                {1, 0, 0, 0, 0},
                {0, -1, 1, 0, 0}
        };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (graf[i][j] > 0) {
                    System.out.print(i + "" + j + " = 1\t");
                } else {
                    System.out.print(i + "" + j + " = 0\t");
                }
            }
            System.out.println();
        }
        System.out.println();

        int a = 0, b = 0, c = 0, d = 0, e = 0, ae = 0, be = 0, ce = 0, de = 0, ee = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((graf[i][j] > 0) && (i == 0)) {
                    a++;
                } else if ((graf[i][j] < 0) && (i == 0)) {
                    ae++;
                }
                if ((graf[i][j] > 0) && (i == 1)) {
                    b++;
                } else if ((graf[i][j] < 0) && (i == 1)) {
                    be++;
                }
                if ((graf[i][j] > 0) && (i == 2)) {
                    c++;
                } else if ((graf[i][j] < 0) && (i == 2)) {
                    ce++;
                }
                if ((graf[i][j] > 0) && (i == 3)) {
                    d++;
                } else if ((graf[i][j] < 0) && (i == 3)) {
                    de++;
                }
                if ((graf[i][j] > 0) && (i == 4)) {
                    e++;
                } else if ((graf[i][j] < 0) && (i == 4)) {
                    ee++;
                }
            }
        }
        System.out.println("A_S=" + a + "\t B_S=" + b + "\t C_S=" + c + "\t D_S=" + d + "\t E_S=" + e + "\n");
        System.out.println("A_E=" + ae + "\t B_E=" + be + "\t C_E=" + ce + "\t D_E=" + de + "\t E_E=" + ee + "\n");
    }
}