package collections.recursion.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            displayBoard(board);
        } else {
            System.out.println("Cannot solve Sudoku");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            // if you find the empty element in the row, then break
            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;
            // sudoku is solved.
        }

        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }

        // this means sudoku cannot be solved
        return false;
    }

    // check whether we can put num in the row, col (or) not.
    static boolean isSafe(int[][] board, int row, int col, int num) {
        // check the row wise
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[i][col] == num) {
                return false;
            }
        }

        // check the column wise
        for (int[] nums : board) {
            // check if the number is in the column
            // For different rows, checking the same column
            if (nums[col] == num) {
                return false;
            }
        }

        // check in the 3*3 grid
        int sqrt = (int) Math.sqrt(board.length);
        int startingRow = row - row % sqrt;
        int startingColumn = col - col % sqrt;

        for (int r = startingRow; r < startingRow + sqrt; r++) {
            for (int c = startingColumn; c < startingColumn + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }

        }
        return true;
    }

    static void displayBoard(int[][] board) {
        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
