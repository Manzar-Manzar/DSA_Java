package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(nums, 4));
    }
    static int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e-s)/2;
            if(nums[m] == target) {
                return m;
            }
            if(nums[m] < target) {
                s = m + 1;
            } else if(nums[m] > target) {
                e = m - 1;
            }
        }
        return -1;
    }
}
