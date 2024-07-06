package BinarySearch;

public class SmallestCharacter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(search(letters, target));
    }
    static char search(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start<=end) {
            int mid = start +(end - start) / 2;
            if(letters[mid] > target) {
                end = mid - 1;
            }
            if(letters[mid] < target) {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
