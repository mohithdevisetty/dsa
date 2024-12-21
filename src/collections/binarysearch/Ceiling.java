package collections.binarysearch;

// Ceiling of a number
// Ceiling -> means smallest element in the array that is grater than (or) equal to target.
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 10, 22, 36, 47, 58};
        int target = 100;
        System.out.println(findCeling(arr, target));
    }

    static int findCeling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
