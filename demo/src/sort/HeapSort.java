package sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 2, 4, 5, 7, 8, 2, 4, 5};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        while (heapSize != 0) {
            swap(arr, 0, --heapSize);
            //swap(arr, 0, heapSize - 1);
            //heapSize--;
            heapify(arr, 0, heapSize);
        }
    }


    public static void heapInsert(int[] arr, int i) {
        while (arr[i] > arr[(i - 1) / 2]) {
            swap(arr, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }


    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            //比较得到子结点较大值索引
            int largest = (left + 1) < heapSize && arr[left] < arr[left + 1]
                    ? left + 1
                    : left;
            //父结点和子结点比较
            largest = arr[index] < arr[largest]
                    ? largest
                    : index;
            //数据改变了，但是仍保持大根堆结构
            if (largest == index) {
                break;
            }
            swap(arr, index, largest);
            //准备下一轮循环的条件
            index = largest;
            left = index * 2 + 1;
        }
    }


    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
