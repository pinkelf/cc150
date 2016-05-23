package com.example.pack201to300;

/**
 * Created by majie on 16/5/23.
 */
public class MaximalSquare {
    /**
     * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing all 1's and return its area.
     * <p/>
     * For example, given the following matrix:
     * <p/>
     * 1 0 1 0 0
     * 1 0 1 1 1
     * 1 1 1 1 1
     * 1 0 0 1 0
     * Return 4.
     *
     * @param matrix
     * @return
     */
    public static int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int[][] rect = new int[matrix.length][matrix[0].length];

        int max = 0;
        for (int i = 0; i < rect.length; i++) {
            rect[i][0] = matrix[i][0] - '0';
            max = Math.max(rect[i][0], max);
        }

        for (int j = 0; j < rect[0].length; j++) {
            rect[0][j] = matrix[0][j] - '0';
            max = Math.max(rect[0][j], max);
        }

        for (int i = 1; i < rect.length; i++) {
            for (int j = 1; j < rect[0].length; j++) {
                if (matrix[i][j] == '1') {
                    int min = Math.min(rect[i - 1][j], Math.min(rect[i - 1][j - 1], rect[i][j - 1]));
                    rect[i][j] = min + 1;
                    max = Math.max(max, rect[i][j]);
                } else {
                    rect[i][j] = 0;
                }
            }
        }

        return max * max;
    }
}
