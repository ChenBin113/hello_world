package chapter1;

public class Matrix {
    public static double[][] fun1(int[][] a, int[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2},
                {3, 4}
        };
        int[][] b = {
                {4, 3},
                {2, 1}
        };
        double[][] c = fun1(a, b);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
