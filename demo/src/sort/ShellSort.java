package sort;

import static util.Print.printArr;

public class ShellSort {
    public static void shellSort(int[] array) {
        int gap = array.length;
        while (true) {
            if (gap == 1) {
                break;
            }
            gap /= 2;
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j - gap >= 0; j = j - gap) {
                     if (array[j] < array[j - gap]) {
                        swap(array, j, j - gap);
                     }
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 4, 3, -5, 3, 1, 10};
        shellSort(arr);
        printArr(arr);
    }
}
