package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (Win.horizontal(board, i) || Win.vertical(board, i)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean horizontal(int[][] board, int row) {
        boolean hrsl = false;
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 1) {
                hrsl = true;
                break;
            }
        }
        return hrsl;
    }

    public static boolean vertical(int[][] board, int column) {
        boolean vrsl = false;
        for (int j = 0; j < board.length; j++) {
            if (board[j][column] == 1) {
                vrsl = true;
                break;
            }
        }
        return vrsl;
    }
}
