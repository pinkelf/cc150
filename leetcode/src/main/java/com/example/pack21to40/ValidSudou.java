package com.example.pack21to40;

import java.util.HashSet;

/**
 * Created by majie on 15/12/23.
 */
public class ValidSudou {

    /**
     * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
     * <p/>
     * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
     * <p/>
     * <p/>
     * A partially filled sudoku which is valid.
     * <p/>
     * Note:
     * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
     *
     * @param board
     * @return
     */

    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();

        // row
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                char a = board[i][j];
                if (a == '.') {
                    continue;
                }
                if (a < '0' || a > '9') {
                    return false;
                }
                if (!set.contains(a)) {
                    set.add(a);
                } else {
                    return false;
                }
            }
        }

        // column
        for (int m = 0; m < 9; m++) {
            set.clear();
            for (int n = 0; n < 9; n++) {
                char a = board[n][m];
                if (a == '.') {
                    continue;
                }
                if (a < '0' || a > '9') {
                    return false;
                }
                if (!set.contains(a)) {
                    set.add(a);
                } else {
                    return false;
                }
            }
        }

        // cube
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                set.clear();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char a = board[3 * m + i][3 * n + j];
                        if (a == '.') {
                            continue;
                        }
                        if (a < '0' || a > '9') {
                            return false;
                        }
                        if (!set.contains(a)) {
                            set.add(a);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
