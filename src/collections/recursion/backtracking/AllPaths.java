package collections.recursion.backtracking;


import java.util.Arrays;

// In this example, we look at the problem we face and how backtracking helps to overcome that problem.
public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPaths("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        allPathsPrint("", board, 0, 0, path, 1);
    }

    static void allPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // I'm considering this cell in my path.
        // So mark it as false, so that this path's subsequent recursions won't pick this cell.
        maze[r][c] = false;

        // Going Down
        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }

        // Going Right
        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }

        // Going Up
        // Here the column remains same but row is decrementing by 1
        if (r > 0) {
            allPaths(p + 'U', maze, r - 1, c);
        }

        // Going Left
        // Here the row remains same but column is decrementing by 1
        if (c > 0) {
            allPaths(p + 'L', maze, r, c - 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // I'm considering this cell in my path.
        // So mark it as false, so that this path's subsequent recursions won't pick this cell.
        maze[r][c] = false;
        path[r][c] = step;

        // Going Down
        if (r < maze.length - 1) {
            allPathsPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        // Going Right
        if (c < maze[0].length - 1) {
            allPathsPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        // Going Up
        // Here the column remains same but row is decrementing by 1
        if (r > 0) {
            allPathsPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        // Going Left
        // Here the row remains same but column is decrementing by 1
        if (c > 0) {
            allPathsPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
