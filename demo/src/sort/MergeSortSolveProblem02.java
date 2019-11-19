package sort;

import java.util.Arrays;

/**
 * 荷兰国旗问题：
 * 给定一个数组 arr，和一个数 num，请把小于 num 的数放在数组的左边，等于 num 的数放在数组的中间，大于 num 的数放在数组的右边。
 */
public class MergeSortSolveProblem02 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 65, 50, 3, 4, 1, 50, 3, 64, 6, 64, 50, 3};
        fun1(arr, 50);
        //output: [1, 4, 3, 3, 4, 1, 3, 6, 50, 50, 50, 64, 64, 65]
        //由 number = 50 分为三个区域，小于 50，等于 50，大于 50
        System.out.println(Arrays.toString(arr));
    }

    public static void fun1(int[] arr, int number) {
        if (arr == null || arr.length < 2) return;
        int less = -1;
        int more = arr.length;
        int cur = 0;
        while (cur != more) {
            if (arr[cur] < number) {
                swap(arr, less + 1, cur);
                less++;
                cur++;
            } else if (arr[cur] == number) {
                cur++;
            } else {
                swap(arr, more - 1, cur);
                more--;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
