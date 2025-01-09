package collections.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countPaths(3, 3));
//        System.out.println(printPaths("", 3, 3));
//        pathPrint("", 4, 4);
//        System.out.println(pathReturn("", 4, 4));
//        System.out.println(pathReturnDiagonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", board, 0, 0);
    }

    // It returns the count of possible ways to reach from starting point to end of the matrix(maze)
    static int countPaths(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int down = countPaths(r - 1, c);
        int right = countPaths(r, c - 1);
        return down + right;
    }

    // It prints all possible ways to reach from starting point to end of the matrix(maze)
    // D -> Down,  R -> Right
    static void pathPrint(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 0 && c > 0) {
            pathPrint(p + 'D', r - 1, c);
            pathPrint(p + 'R', r, c - 1);
        }
    }

    // Return all possible ways to reach from starting point to end in a matrix/maze
    static List<String> pathReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if (r > 0 && c > 0) {
            list.addAll(pathReturn(p + 'D', r - 1, c));
            list.addAll(pathReturn(p + 'R', r, c - 1));
        }
        return list;
    }

    // Return all possible ways to reach from starting point to end in a matrix/maze including diagonal paths also
    // V -> Vertical/Down   H -> Horizontal/Right    D -> Diagonal
    static List<String> pathReturnDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if (r > 0 && c > 0) {
            list.addAll(pathReturnDiagonal(p + 'V', r - 1, c));
            list.addAll(pathReturnDiagonal(p + 'H', r, c - 1));
        }
        if (r > 1 && c > 1) {
            list.addAll(pathReturnDiagonal(p + 'D', r - 1, c - 1));
        }
        return list;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}
