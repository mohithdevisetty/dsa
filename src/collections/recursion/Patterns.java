package collections.recursion;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        bubbleSort_own(5, 0, 0);
//        triangle_explained(5, 0);
//        triangle2(5, 0);
        int[] arr = {1, 4, 3, 5, 987, -76, 0};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {45, 34, 8, 9, 23, 87, 0, -4, -66, -2};
        bubbleSort_own(arr2, arr2.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr2));
    }

    static void bubbleSort(int[] arr, int r, int c) {
        if (r == 0) return;
        if (c < r) {
            if (arr[c] > arr[c + 1]) swap(arr, c, c + 1);
            bubbleSort(arr, r, c + 1);
        } else {
            bubbleSort(arr, r - 1, 0);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    // Inspired from triangle_own method logic
    static void bubbleSort_own(int[] arr, int n, int row, int col) {
        if (col >= n) {
//            System.out.println();
            col = 0;
            n = n - 1;
            row++;
        }
        if (n == 0) {
            return;
        }
//        System.out.print("* ");
        if (arr[col] > arr[col + 1]) swap(arr, col, col + 1);
        bubbleSort_own(arr, n, row, col + 1);
    }

    static void bubbleSort_own(int n, int row, int col) {
        if (col >= n) {
            System.out.println();
            col = 0;
            n = n - 1;
            row++;
        }
        if (n == 0) {
            return;
        }
        System.out.print("* ");
        bubbleSort_own(n, row, col + 1);
    }

    static void triangle_explained(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangle_explained(r, c + 1);
        } else {
            System.out.println();
            triangle_explained(r - 1, 0);
        }
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("* ");
        } else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }
}
