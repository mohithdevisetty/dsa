package collections.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 987, -76, 0};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1, 4, 3, 5, 987, -76, 0};
        mergeSortInPlace(arr2, 0, arr2.length);
        System.out.println(Arrays.toString(arr2));
    }


    // Using Recursion
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        int p1 = 0;
        int p2 = 0;


        // Now that you have 2 sub arrays that are sorted each other. Just merge them in a sorted way and return it back.
        int[] newArr = new int[arr1.length + arr2.length];
        int index = 0;

        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                newArr[index] = arr1[p1];
                p1++;
            } else {
                newArr[index] = arr2[p2];
                p2++;
            }
            index++;
        }


        // It is possible that any elements left over in the arr1 or arr2 that needs to be added to the newArr.
        while (p1 < arr1.length) {
            newArr[index] = arr1[p1];
            p1++;
            index++;
        }

        while (p2 < arr2.length) {
            newArr[index] = arr2[p2];
            p2++;
            index++;
        }

        return newArr;
    }

    // Using In-Place merge sort
    static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
