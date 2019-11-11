package sort;

import static util.Print.printArr;

public class InsertSort {
    //插入排序，有可能是 O(n) 也有可能是 O(n^2)，和数据是否已经有序有关。
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 4, 3};
        insertSort(arr);
        printArr(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
