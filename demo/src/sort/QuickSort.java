package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 54, 45, 6, 78, 5, 31, 2, 3256, 45, 654, 61, 3};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }


    public static void quickSort(int[] arr, int left, int right) {
        //多余判断
        //if (left == right) {
        //    return;
        //}
        if (left < right) {
            //随机快排核心
            //Math.random() 取值范围 [0, 1)
            //(Math.random() * (right - left + 1)) 此处数值 <= (right - left)，因此可以保证参数 first 在区间内
            swap(arr, left + (int) (Math.random() * (right - left + 1)), right);
            int[] p = partition(arr, left, right);
            quickSort(arr, left, p[0] - 1);
            quickSort(arr, p[1] + 1, right);
        }
    }


    public static int[] partition(int[] arr, int left, int right) {
        int less = left - 1;
        int more = right + 1;
        //int more = right;
        //left 成为数组遍历的 cur 指针，当触碰到 more 边界时终止循环
        while (left < more) {
            if (arr[left] < arr[right]) {
                swap(arr, less + 1, left);
                less++;
                left++;
                //左神代码
                //swap(arr, ++less, left++);
            } else if (arr[left] == arr[right]) {
                left++;
            } else {
                swap(arr, left, more - 1);
                more--;
                //左神代码
                //swap(arr, left, --more);
            }
        }
        return new int[]{less + 1, more - 1};
        //return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
