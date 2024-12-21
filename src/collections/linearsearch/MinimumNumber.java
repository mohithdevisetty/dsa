package collections.linearsearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {-10, 487, 7, 28, 19, 24, -20};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
