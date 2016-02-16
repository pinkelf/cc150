package com.example.pack51to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/2/16.
 */
public class WordSearch {
    /**
     * Given a 2D board and a word, find if the word exists in the grid.
     * <p/>
     * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
     * <p/>
     * For example,
     * Given board =
     * <p/>
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

    //TLE
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    List<String> list = new ArrayList<String>();
                    list.add(i + "," + j);
                    if (check(board, word, list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean check(char[][] board, String word, List<String> list) {
        if (word.length() == list.size()) {
            return true;
        }

        int index = list.size() - 1;
        String[] pos = list.get(index).split(",");
        int x = Integer.valueOf(pos[0]);
        int y = Integer.valueOf(pos[1]);

        List<String> nextPos = getNextPosList(board, word, list);
        if (nextPos.isEmpty()) {
            return false;
        }
        for (int i = 0; i < nextPos.size(); i++) {
            list.add(nextPos.get(i));
            if (check(board, word, list)) {
                return true;
            }
            list.remove(list.size() - 1);
        }
        return false;
    }

    private static List<String> getNextPosList(char[][] board, String word, List<String> list) {
        List<String> nextPos = new ArrayList<String>();

        char c = word.charAt(list.size());

        int index = list.size() - 1;
        String[] pos = list.get(index).split(",");
        int x = Integer.valueOf(pos[0]);
        int y = Integer.valueOf(pos[1]);

        if (x > 0 && c == board[x - 1][y] && !isInList(list, x - 1 + "," + y)) {
            nextPos.add(x - 1 + "," + y);
        }
        if (x < board.length - 1 && c == board[x + 1][y] && !isInList(list, x + 1 + "," + y)) {
            nextPos.add(x + 1 + "," + y);
        }
        if (y > 0 && c == board[x][y - 1] && !isInList(list, x + "," + (y - 1))) {
            nextPos.add(x + "," + (y - 1));
        }
        if (y < board[0].length - 1 && c == board[x][y + 1] && !isInList(list, x + "," + (y + 1))) {
            nextPos.add(x + "," + (y + 1));
        }
        return nextPos;
    }

    private static boolean isInList(List<String> list, String pos) {
        for (int i = list.size() - 1; i > -1; i--) {
            if (list.get(i).equals(pos)) {
                return true;
            }
        }
        return false;
    }
}
