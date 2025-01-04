package collections.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 987, -76, 0};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        int p1 = 0;
        int p2 = 0;

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
}
