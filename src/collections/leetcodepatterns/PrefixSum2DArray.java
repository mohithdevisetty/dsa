package collections.leetcodepatterns;

public class PrefixSum2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, -1, -3, 4, 2, 0, 1},
                {3, -2, 4, 5, -3, -1, 1, 0},
                {0, 1, -3, 1, 3, 2, 4, -2},
                {-1, 3, 4, 7, -2, 0, 1, 3},
                {3, 4, 2, 4, -7, -1, 3, 0},
                {-5, 4, 1, -2, 3, -4, 3, 3},
                {3, 4, 2, 4, -7, -1, 3, 0},
                {-5, 4, 1, -2, 3, -4, 3, 3}
        };


        int[][] p = prefixSum(arr);
        int rangeSum = rangeSum(arr, 0,1,5,5);

        System.out.println(rangeSum);


        print(p);
    }

    static int[][] prefixSum(int[][] arr) {
        int[][] p = new int[arr.length + 1][arr.length + 1];

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                p[i][j] = p[i - 1][j] + p[i][j - 1] - p[i - 1][j - 1] + arr[i - 1][j - 1];
            }
        }
        return p;
    }

    static int rangeSum(int[][] arr, int sRow, int sCol, int eRow, int eCol) {
        sRow += 1;
        sCol += 1;
        eRow += 1;
        eCol += 1;

        int[][] p = prefixSum(arr);
        return p[eRow][eCol] - p[sRow-1][eCol] - p[eRow][sCol-1] + p[sRow-1][sCol-1];
    }

    static void print(int[][] p) {
        for (int[] row : p) {
            for (int col : row) {
                System.out.print(col + "   ");
            }
            System.out.println();
        }
    }
}
