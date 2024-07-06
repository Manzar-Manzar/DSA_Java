package BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 1, 2, 3};
//        int pivot = findPivot(arr);
//        System.out.println("Pivot is " + pivot);
//        int ans = binarySearch(arr, 2, 0, pivot);
//        if(ans == -1) {
//            ans = binarySearch(arr, 2, pivot + 1, arr.length - 1);
//        }
//        System.out.println("The index of the target is at " + ans);
        int target = 0;
        int ans = search(arr, target);

    }
    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if(pivot == target) {
            return pivot;
        }
        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            if((mid + 1) < arr.length && arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
            if(arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }
        }
        return arr[end];
    }
    static int binarySearch(int[] arr,int target, int start, int end) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if(arr[m] == target) {
                return m;
            }
            if(arr[m] < target) {
                s = m + 1;
            }
            if(arr[m] > target) {
                e = m - 1;
            }
        }
        return -1;
    }
}
