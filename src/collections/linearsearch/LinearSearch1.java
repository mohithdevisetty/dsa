package collections.linearsearch;

public class LinearSearch1 {
    public static void main(String[] args) {
        int[] arr = {876, 487, 7, 28, 19, 24, 25};
        System.out.println(linearSearch(arr, 100));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
