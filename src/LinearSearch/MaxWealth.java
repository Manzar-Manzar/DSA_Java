package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3, 2, 1}
        };
        System.out.println(max(accounts));
    }
    static int max(int[][] accounts) {
        int max = 0;
        for(int[] account: accounts) {
            int sum =0;
            for (int money : account) {
               sum += money;
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
