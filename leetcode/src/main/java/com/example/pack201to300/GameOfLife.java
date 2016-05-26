package com.example.pack201to300;

/**
 * Created by majie on 16/5/26.
 */
public class GameOfLife {
    /**
     * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
     * <p/>
     * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
     * <p/>
     * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
     * Any live cell with two or three live neighbors lives on to the next generation.
     * Any live cell with more than three live neighbors dies, as if by over-population..
     * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
     * Write a function to compute the next state (after one update) of the board given its current state.
     * <p/>
     * Follow up:
     * Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
     * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
     *
     * @param board
     */
    public static void gameOfLife(int[][] board) {
        if (board.length == 0) {
            return;
        }
        int[][] matrix = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                matrix[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                checkLive(board, matrix, i, j);
            }
        }
    }

    private static void checkLive(int[][] matrix, int[][] board, int i, int j) {
        int count = 0;
        if (i > 0) {
            if (j - 1 > -1 && board[i - 1][j - 1] == 1) {
                count++;
            }
            if (board[i - 1][j] == 1) {
                count++;
            }
            if (j + 1 < board[0].length && board[i - 1][j + 1] == 1) {
                count++;
            }
        }
        if (i + 1 < board.length) {
            if (j - 1 > -1 && board[i + 1][j - 1] == 1) {
                count++;
            }
            if (board[i + 1][j] == 1) {
                count++;
            }
            if (j + 1 < board[0].length && board[i + 1][j + 1] == 1) {
                count++;
            }
        }

        if (j > 0 && board[i][j - 1] == 1) {
            count++;
        }
        if (j + 1 < board[0].length && board[i][j + 1] == 1) {
            count++;
        }

        if (board[i][j] == 0) {
            if (count == 3) {
                matrix[i][j] = 1;
            }
        } else {
            if (count < 2 || count > 3) {
                matrix[i][j] = 0;
            }
        }
    }
}
