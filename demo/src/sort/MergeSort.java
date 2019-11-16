package sort;

import static util.Print.printArr;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 4, 3};
        mergeSort(arr);
        printArr(arr);
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }


    public static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 2);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int m, int r) {
        //这个数组是临时生成的，使用过后又马上销毁，最大的长度为排序数组的长度，所以额外空间为 O(n)
        int[] helper = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        while (p1 <= m && p2 <= r) {
            helper[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        //下面两个循环有且只有一个会执行
        while (p1 <= m) {
            helper[i++] = arr[p1++];
        }
        while (p2 <= r) {
            helper[i++] = arr[p2++];
        }
        //需要注意 l 为归并的左边界，不是定值 0
        for (int j = 0; j < helper.length; j++) {
            arr[l + j] = helper[j];
        }
    }

}
