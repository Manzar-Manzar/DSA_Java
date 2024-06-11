package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {23, 3453, 454, 4567, 3454, 456, 768};
        System.out.println(find(arr));
    }
    static int find(int[] arr) {
        int count = 0;
        for(int n : arr) {
            if(even(n)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int n) {
        int numOfDigits = digits(n);
        return numOfDigits % 2 == 0;
    }
    static int digits(int n) {
        int c = 0;
        while (n != 0){
            n = n / 10;
            c++;
        }
        return c;
    }
}
