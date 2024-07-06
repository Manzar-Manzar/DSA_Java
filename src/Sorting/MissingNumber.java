package Sorting;

import java.util.Arrays;

public class MissingNumber {
//    public static void main(String[] args) {
//        int[] arr = {1, 0, 3, 2, 5};
//        cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void cyclicSort(int[] arr) {
//        for(int i = 0; i < arr.length - 1; i++) {
//            int correctIndex = arr[i];
//            if(arr[i] != arr[correctIndex]) {
//                swap(arr, i, correctIndex);
//            }
//        }
//    }
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

    public static void main(String[] args) {
        int[] arr= {1, 0, 2, 4};
        int missingNumber = cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber);
    }
    static int cyclicSort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            } else{
                i++;
            }
        }
        for(int index = 0; index<arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
