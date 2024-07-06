package Stacks;

import java.util.Arrays;
import java.util.List;

public class GameOfStacks {
//    public static void main(String[] args) {
//        List<Integer> a = List.of(1, 2, 3, 4);
//        List<Integer> b = List.of(2, 5, 7, 2);
//        int maxSum = 11;
//        int ans = twoStacks(maxSum, a, b);
//        System.out.println(ans);
//    }
//    static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
//        int result = 0, st1_count = 0, st2_count = 0, total_sum = 0;
////        Get elements from the first stack
//        for(Integer st1_element : a) {
//            if(total_sum + st1_element > maxSum) {
//                break;
//            }
//            total_sum += st1_element;
//            st1_count++;
//            result = st1_count;
//        }
//
////        Try to use elements of second stack
//        for(Integer st2_element : b) {
//            total_sum += st2_element;
//            st2_count++;
//            while(total_sum > maxSum  && st1_count > 0) {
//                total_sum -= a.get(st1_count - 1);
//                st1_count--;
//            }
//            result = (total_sum <= maxSum) ? Math.max(st1_count + st2_count, result) : result;
//        }
//        return result;
//    }


    public static void main(String[] args) {
        int x = 10;
        int[] a = {4, 2, 4, 6, 4, 1};
        int[] b = {2, 1, 8,5};
        int ans = twoStacks(x, a, b, 0 , 0);
        System.out.println(ans - 1);
    }
    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if(sum > x) {
            return count;
        }
        if(a.length == 0 || b.length == 0) {
            return count;
        }
        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count + 1);
        return Math.max(ans1, ans2);
    }
}
