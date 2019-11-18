package sort;

import java.util.Arrays;

/**
 * 给定一个数组 arr，和一个数 num，请把小于等于 num 的数放在数组的左边，大于 num 的数放在数组的右边。
 */
public class MergeSortSolveProblem01 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 56, 23, 34, 6, 34, 76, 23};
        int number = 30;
        fun1(arr, number);
        //output: [1, 4, 23, 6, 23, 56, 34, 76, 34]
        //输出的数组分成两个部分，小于等于 30 和大于 30
        System.out.println(Arrays.toString(arr));
    }

    public static void fun1(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            //当扫描的数是小于等于 number，小于等于区域 index++
            if (arr[i] <= number) {
                swap(arr, index + 1, i);
                index++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
