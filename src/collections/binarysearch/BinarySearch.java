package collections.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 10, 22, 36, 47, 58};
        int target = 100;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }
}
