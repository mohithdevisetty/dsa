package collections.patterns;

public class Main {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n - 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row - 1, n - col - 1));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = totalColInRow; col > 0; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalColInRow; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            int noOfSpaces = n - row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print("  ");
            }
            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
