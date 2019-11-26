package matrix;

public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR < dR) {
            rotate(matrix, tR++, tC++, dR--, dC--);
        }
    }

    public static void rotate(int[][] matrix, int tR, int tC, int dR, int dC) {
        int times = dR - tR;
        for (int i = 0; i < times; i++) {
            int tmp = matrix[tR + i][tC];
            matrix[tR + i][tC] = matrix[tR][dC - i];
            matrix[tR][dC - i] = matrix[dR - i][dC];
            matrix[dR - i][dC] = matrix[dR][tC + i];
            matrix[dR][tC + i] = tmp;
        }
    }

    public static void main(String[] args) {
        //int[][] matrix = {
        //        {1, 2, 3},
        //        {4, 5, 6},
        //        {7, 8, 9},
        //};

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        printMatrix(matrix);
        rotateMatrix(matrix);
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("------------RotateMatrix.printMatrix------------");
        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.printf("%3d", n);
            }
            System.out.println();
        }
        System.out.println();
    }
}
