package matrix;

public class ZigRouteInMatrix {
    public static void zigPrint(int[][] matrix) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;
        // A
        int tR = 0;
        int tC = 0;
        // B
        int dR = 0;
        int dC = 0;
        boolean flag = false; //true A -> B false B -> A
        while (tR != row + 1) {
            print(matrix, tR, tC, dR, dC, flag);
            //�� A �ж������� tC������ tC ���� tR �󣬷�ֹ tC ֵ�ĸı�� tR ֵ���ж����Ӱ��
            tR = tC == col ? tR + 1 : tR;
            tC = tC == col ? tC : tC + 1;
            //�� B �ж������� dR������ dR ���� dC �󣬷�ֹ dR ֵ�ĸı�� dC ֵ���ж����Ӱ��
            dC = dR == row ? dC + 1 : dC;
            dR = dR == row ? dR : dR + 1;
            flag = !flag;
        }
    }

    private static void print(int[][] matrix, int tR, int tC, int dR, int dC, boolean flag) {
        if (flag) {
            // true A -> B
            while (tR != dR + 1) {
                System.out.printf("%3d", matrix[tR++][tC--]);
            }
        } else {
            // false B -> A
            while (dR != tR - 1) {
                System.out.printf("%3d", matrix[dR--][dC++]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        zigPrint(matrix);
    }
}
