package com.example.pack101to200;

import java.util.Stack;

/**
 * Created by majie on 16/5/25.
 */
public class SurroundedRegions {

    public static class Index {
        int x;
        int y;

        public Index(int i, int j) {
            this.x = i;
            this.y = j;
        }
    }

    public static void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }
        //row
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'O') {
                mark(board, 0, j);
            }
            if (board[board.length - 1][j] == 'O') {
                mark(board, board.length - 1, j);
            }
        }
        //column
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') {
                mark(board, i, 0);
            }
            if (board[i][board[0].length - 1] == 'O') {
                mark(board, i, board[0].length - 1);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private static void mark(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        Stack<Index> stack = new Stack<Index>();
        stack.push(new Index(i, j));
        while (!stack.isEmpty()) {
            Index index = stack.pop();
            board[index.x][index.y] = '*';
            if (index.x + 1 < board.length && board[index.x + 1][index.y] == 'O') {
                stack.push(new Index(index.x + 1, index.y));
            }
            if (index.x > 0 && board[index.x - 1][index.y] == 'O') {
                stack.push(new Index(index.x - 1, index.y));
            }
            if (index.y + 1 < board[0].length && board[index.x][index.y + 1] == 'O') {
                stack.push(new Index(index.x, index.y + 1));
            }
            if (index.y > 0 && board[index.x][index.y - 1] == 'O') {
                stack.push(new Index(index.x, index.y - 1));
            }
        }
    }
}
