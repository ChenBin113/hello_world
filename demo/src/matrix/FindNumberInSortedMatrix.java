package matrix;

public class FindNumberInSortedMatrix {
    public static boolean findNumber(int[][] matrix, int number) {
        int dR = matrix.length - 1;
        int dC = 0;
        int tR = 0;
        int tC = matrix[0].length - 1;
        while (tR <= dR && tC >= dC) {
            if (matrix[tR][tC] == number) {
                return true;
            }
            if (matrix[tR][tC] < number) {
                tR++;
            } else {
                tC--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        for (int i = 0; i < 10000; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println("number = " + number);
            System.out.println(findNumber(matrix, number));
        }
    }
}
