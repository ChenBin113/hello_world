package search;

public class BinarySearch {
    //迭代的方式做二分查找
    public static boolean binarySearch(int target, int[] nums) {
        //边界判断
        if (nums.length == 0 || nums == null) return false;
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (end - begin) / 2 + begin;
            if (target == nums[mid]) {
                return true;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return false;
    }

    //递归的方式做二分查找
    public static int binarySearch(int target, int[] nums, int begin, int end) {
        //边界判断
        if (nums.length == 0 || nums == null) return -1;
        int mid = (end - begin) / 2 + begin;
        if (target == nums[mid]) {
            return mid;
        } else if (target < nums[mid]) {
            end = mid - 1;
        } else {
            begin = mid + 1;
        }
        return binarySearch(target, nums, begin, end);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 7, 8, 9, 10, 11, 13};
        int target = 6;
        System.out.println(binarySearch(target, nums)); //true
        System.out.println(binarySearch(target, nums, 0, nums.length - 1)); //3
    }
}
