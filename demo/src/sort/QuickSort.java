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
        //�����ж�
        //if (left == right) {
        //    return;
        //}
        if (left < right) {
            //������ź���
            //Math.random() ȡֵ��Χ [0, 1)
            //(Math.random() * (right - left + 1)) �˴���ֵ <= (right - left)����˿��Ա�֤���� first ��������
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
        //left ��Ϊ��������� cur ָ�룬�������� more �߽�ʱ��ֹѭ��
        while (left < more) {
            if (arr[left] < arr[right]) {
                swap(arr, less + 1, left);
                less++;
                left++;
                //�������
                //swap(arr, ++less, left++);
            } else if (arr[left] == arr[right]) {
                left++;
            } else {
                swap(arr, left, more - 1);
                more--;
                //�������
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
