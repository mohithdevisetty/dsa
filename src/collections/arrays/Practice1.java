package collections.arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = new int[3000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
