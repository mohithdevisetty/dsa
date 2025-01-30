package collections.leetcodepatterns;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {8, 3, -2, 4, 10, -1, 0, 5, 3};
        int[] p = prefixSumArray(arr);
        System.out.println(Arrays.toString(p));

        int sum = rangeSum(p, 0, 7);
        System.out.println(sum);
    }

    static int rangeSum(int[] p, int startindex, int endindex) {
        if (startindex == 0) {
            return p[endindex];
        }
        return p[endindex] - p[startindex - 1];
    }

    static int[] prefixSumArray(int[] arr) {
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;

    }
}
