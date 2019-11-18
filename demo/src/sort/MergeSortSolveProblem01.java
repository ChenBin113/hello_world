package sort;

import java.util.Arrays;

/**
 * ����һ������ arr����һ���� num�����С�ڵ��� num ���������������ߣ����� num ��������������ұߡ�
 */
public class MergeSortSolveProblem01 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 56, 23, 34, 6, 34, 76, 23};
        int number = 30;
        fun1(arr, number);
        //output: [1, 4, 23, 6, 23, 56, 34, 76, 34]
        //���������ֳ��������֣�С�ڵ��� 30 �ʹ��� 30
        System.out.println(Arrays.toString(arr));
    }

    public static void fun1(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            //��ɨ�������С�ڵ��� number��С�ڵ������� index++
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
