package collections.binarysearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Find the smallest letter grater than the target

// This is exactly same as ceiling problem.
public class SmallestNumber {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        System.out.println(findSmallestNumber(arr, 'j'));
    }

    static char findSmallestNumber(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
