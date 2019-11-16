package sort;

import static util.Print.printArr;

public class SelectSort {
    //选择排序，从小到大，O(n^2)
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 4, 3};
        selectSort(arr);
        printArr(arr);
    }


    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(arr, i, min);
            }
        }
    }

    public static void swap(int[] arr, int i, int min) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}