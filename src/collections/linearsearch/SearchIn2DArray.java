package collections.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {-9, 9, 10, 3},
                {8, 7, 10},
                {78, 6},
                {2, 5, 23, 12, 19, 33, 28}
        };
        System.out.println(Arrays.toString(findPosition(arr, 5)));
    }

    // this methods find the target element's position and return that position indices as new array
    static int[] findPosition(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
