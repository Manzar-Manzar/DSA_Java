package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 14, 18};
        System.out.println(floor(arr, 15));
    }
    static int floor(int[] arr, int target) {
        if(arr.length== 0) {
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
        while(s<=e) {
            int m = s + (e - s) / 2;
            if(arr[m] == target) {
                return target;
            }
            if(arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return arr[e];
    }
}
