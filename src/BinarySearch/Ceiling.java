package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 57};
        System.out.println(search(arr, 14));
    }
    static int search(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
        while(s<=e) {
            int m = s + (e-s) / 2;
            if(arr[m] == target) {
                return m;
            }
            if(arr[m] > target) {
                e = m - 1;
            }
            if(arr[m] < target) {
                s = m + 1;
            }
        }
        return arr[s];
    }
}
