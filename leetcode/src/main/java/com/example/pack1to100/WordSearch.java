package com.example.pack1to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/2/16.
 */
public class WordSearch {
    /**
     * Given a 2D board and a word, find if the word exists in the grid.
     * <p>
     * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
     * <p>
     * For example,
     * Given board =
     * <p>
     * [
     * ['A','B','C','E'],
     * ['S','F','C','S'],
     * ['A','D','E','E']
     * ]
     * word = "ABCCED", -> returns true,
     * word = "SEE", -> returns true,
     * word = "ABCB", -> returns false.
     *
     * @param board
     * @param word
     * @return
     */

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    List<String> list = new ArrayList<String>();
                    list.add(i + "," + j);
                    board[i][j] = '*';
                    if (check(board, word, i, j, 1)) {
                        return true;
                    }
                    board[i][j] = word.charAt(0);
                }
            }
        }
        return false;
    }

    private static boolean check(char[][] board, String word, int i, int j, int index) {
        if (word.length() == index) {
            return true;
        }

        List<String> nextPos = getNextPosList(board, word, i, j, index);
        if (nextPos.isEmpty()) {
            return false;
        }
        for (int m = 0; m < nextPos.size(); m++) {
            String[] pos = nextPos.get(m).split(",");
            int x = Integer.valueOf(pos[0]);
            int y = Integer.valueOf(pos[1]);
            board[x][y] = '*';
            if (check(board, word, x, y, index + 1)) {
                return true;
            }
            board[x][y] = word.charAt(index);
        }
        return false;
    }

    private static List<String> getNextPosList(char[][] board, String word, int x, int y, int index) {
        List<String> nextPos = new ArrayList<String>();

        char c = word.charAt(index);

        if (x > 0 && c == board[x - 1][y]) {
            nextPos.add(x - 1 + "," + y);
        }
        if (x < board.length - 1 && c == board[x + 1][y]) {
            nextPos.add(x + 1 + "," + y);
        }
        if (y > 0 && c == board[x][y - 1]) {
            nextPos.add(x + "," + (y - 1));
        }
        if (y < board[0].length - 1 && c == board[x][y + 1]) {
            nextPos.add(x + "," + (y + 1));
        }
        return nextPos;
    }
}
