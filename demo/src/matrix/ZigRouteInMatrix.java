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
            //点 A 判断条件是 tC，所以 tC 放在 tR 后，防止 tC 值的改变对 tR 值的判断造成影响
            tR = tC == col ? tR + 1 : tR;
            tC = tC == col ? tC : tC + 1;
            //点 B 判断条件是 dR，所以 dR 放在 dC 后，防止 dR 值的改变对 dC 值的判断造成影响
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
