package com.example.pack1to100;

/**
 * Created by majie on 16/1/6.
 */
public class MinimumPathSum {

    /**
     * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
     * <p>
     * Note: You can only move either down or right at any point in time.
     *
     * @param grid
     * @return
     */
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + grid[i][0];
            result[i][0] = sum;
        }

        sum = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + grid[0][j];
            result[0][j] = sum;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = grid[i][j] + Math.min(result[i - 1][j], result[i][j - 1]);
            }
        }

        return result[m - 1][n - 1];
    }
}
