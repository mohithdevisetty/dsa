package collections.binarysearch;

import java.util.Arrays;

// How to find the target in the sorted matrix(row wise sorted, column wise sorted)
public class RolColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 50)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c= matrix.length-1;

        while(r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
