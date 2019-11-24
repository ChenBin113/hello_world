package matrix;

public class PrintMatrixInSpiralOrder {
    public static void spiralOrderPrint(int[][] matrix, int tR, int tC, int dR, int dC) {
        //三种情况：横线，竖线，矩形
        if (tR == dR) {
            while (tC <= dC) {
                System.out.printf("%3d", matrix[tR][tC++]);
            }
        } else if (tC == dC) {
            while (tR <= dR) {
                System.out.printf("%3d", matrix[tR++][tC]);
            }
        } else {
            int tmpC = tC;
            int tmpR = tR;
            while (tC < dC) {
                System.out.printf("%3d", matrix[tR][tC++]);
            }
            while (tR < dR) {
                System.out.printf("%3d", matrix[tR++][tC]);
            }
            while (tC > tmpC) {
                System.out.printf("%3d", matrix[tR][tC--]);
            }
            while (tR > tmpR) {
                System.out.printf("%3d", matrix[tR--][tC]);
            }
        }


    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("-----------PrintMatrixInSpiralOrder.printMatrix-----------");
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR) {
            spiralOrderPrint(matrix, tR++, tC++, dR--, dC--);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.printf("%3d", n);
            }
            System.out.println();
        }

        printMatrix(matrix);
    }
}
