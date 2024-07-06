package BinarySearch;

import org.w3c.dom.ls.LSOutput;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2, 34, 56, 67, 89, 90, 98};
//        System.out.println(orderAgnosticBS(arr, 89));

        int[] arr = {9, 8, 7, 6, 3, 2};
        System.out.println(orderAgnosticBS(arr, 6));
    }
    static int orderAgnosticBS(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc;
        if(arr[s] < arr[e]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        while(s<=e) {
            int m = s + (e-s)/2;
            if(arr[m] == target) {
                return m;
            }
            if(isAsc){
                if(arr[m] > target) {
                    e = m -1;
                } else {
                    s = m+1;
                }
            } else {
                if(arr[m] > target) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
