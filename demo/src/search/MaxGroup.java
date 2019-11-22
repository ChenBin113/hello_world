package search;

public class MaxGroup {
    public static int maxGroup(int[] arr) {
        if (arr == null || arr.length < 2) return 0;

        //�����������ֵ����Сֵ
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        if (max == min) return 0;

        //����Ͱ�������洢����Ϣ
        boolean[] hasNum = new boolean[len + 1];
        int[] maxNum = new int[len + 1];
        int[] minNum = new int[len + 1];

        //��������Ͱ�е���Ϣ
        for (int i = 0; i < len; i++) {
            int index = bucket(arr[i], min, max, len);
            //�˴��ɱ����ʼ�������ֵ��Ӱ��
            maxNum[index] = hasNum[index] ? Math.max(maxNum[index], arr[i]) : arr[i];
            minNum[index] = hasNum[index] ? Math.min(minNum[index], arr[i]) : arr[i];
            hasNum[index] = true;
        }

        //�����õ�����������������ֵ
        int res = 0;
        int lastMax = maxNum[0];
        //ע��˴��� i �� 1 ��ʼ����������Ͱ��Ͱ������ len + 1
        for (int i = 1; i <= len; i++) {
            if (hasNum[i]) {
                res = Math.max(res, minNum[i] - lastMax);
                lastMax = maxNum[i];
            }
        }
        return res;
    }

    public static int bucket(int number, int min, int max, int length) {
        return (int) (number - min) * length / (max - min);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 12};
        System.out.println(maxGroup(arr));
    }
}
