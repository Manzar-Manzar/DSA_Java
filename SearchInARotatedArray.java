package BinarySearch;

public class SearchInARotatedArray {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2};
        System.out.println(arr[findPivot(arr)]);
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                end--;
            }
        }
        return -1;
    }
}
