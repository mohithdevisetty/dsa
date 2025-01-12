package collections.recursion.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(noOfQueens(board, 0));
    }

    // Since everytime we are passing the column as 0 everytime, so it's imp to pass column
    static int noOfQueens(boolean[][] board, int row) {
        if (row == board.length) {
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // Placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe to place
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += noOfQueens(board, row + 1);

                // Back Tracking: back track values to false
                board[row][col] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // check all rows with the same column (Vertical direction)
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check left diagonal (Up left direction)
        int maxLeft = Math.min(row, col); // This is the maximum distance we can go in left diagonal
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check right diagonal (Up right direction)
        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        // if none of the above 3 directions returns false, it means we can place the queen in this cell.
        // so return true.
        return true;
    }

    static void displayBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean col : row) {
                if (col)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
}
