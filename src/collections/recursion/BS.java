package collections.recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {3, 9, 0, -9, -3, 12, 66};
        System.out.println(search(arr, 12, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (target == arr[m]) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        } else {
            return search(arr, target, m + 1, e);
        }
    }
}
