package sort;

import static util.Print.printArr;

public class BubbleSort {
    //冒泡排序，从小到大，O(n^2)
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 4, 3};
        bubbleSort(arr);
        printArr(arr);
    }


    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
    }


    public static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}