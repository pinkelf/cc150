package com.example.pack1to100;

/**
 * Created by majie on 16/3/10.
 */
public class SudokuSolver {
    /**
     * Write a program to solve a Sudoku puzzle by filling the empty cells.
     * <p>
     * Empty cells are indicated by the character '.'.
     * <p>
     * You may assume that there will be only one unique solution.
     * <p>
     * <p>
     * A sudoku puzzle...
     * <p>
     * <p>
     * ...and its solution numbers marked in red.
     *
     * @param board
     */
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int i, int j, char c) {
        for (int m = 0; m < board.length; m++) {
            if (board[m][j] == c) {
                return false;
            }
        }
        for (int n = 0; n < board[0].length; n++) {
            if (board[i][n] == c) {
                return false;
            }
        }
        for (int a = (i / 3) * 3; a < (i / 3) * 3 + 3; a++) {
            for (int b = (j / 3) * 3; b < (j / 3) * 3 + 3; b++) {
                if (board[a][b] == c) {
                    return false;
                }
            }
        }
        return true;
    }
}
