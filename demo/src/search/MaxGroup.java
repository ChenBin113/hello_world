package search;

public class MaxGroup {
    public static int maxGroup(int[] arr) {
        if (arr == null || arr.length < 2) return 0;

        //查找数组最大值和最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        if (max == min) return 0;

        //创建桶中三个存储的信息
        boolean[] hasNum = new boolean[len + 1];
        int[] maxNum = new int[len + 1];
        int[] minNum = new int[len + 1];

        //遍历更新桶中的信息
        for (int i = 0; i < len; i++) {
            int index = bucket(arr[i], min, max, len);
            //此处可避免初始化数组的值的影响
            maxNum[index] = hasNum[index] ? Math.max(maxNum[index], arr[i]) : arr[i];
            minNum[index] = hasNum[index] ? Math.min(minNum[index], arr[i]) : arr[i];
            hasNum[index] = true;
        }

        //遍历得到相邻两个数的最大差值
        int res = 0;
        int lastMax = maxNum[0];
        //注意此处的 i 从 1 开始，遍历的是桶，桶长度是 len + 1
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
