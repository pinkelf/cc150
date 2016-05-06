package com.example.pack1to100;

/**
 * Created by majie on 16/1/4.
 */
public class SpiralMatrix2 {
    /**
     * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
     * <p>
     * For example,
     * Given n = 3,
     * <p>
     * You should return the following matrix:
     * [
     * [ 1, 2, 3 ],
     * [ 8, 9, 4 ],
     * [ 7, 6, 5 ]
     * ]
     */
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        getMatrix(n, 0, 0, matrix);
        return matrix;
    }

    private static void getMatrix(int n, int index, int count, int[][] matrix) {
        if (n == 0) {
            return;
        }
        if (n == 1) {
            count++;
            matrix[index][index] = count;
            return;
        }

        //index,index -> index,index+n-2
        for (int a = 0; a < n - 1; a++) {
            count++;
            matrix[index][index + a] = count;
        }
        //index,index+n-1 -> index+n-2, index+n-1
        for (int b = 0; b < n - 1; b++) {
            count++;
            matrix[index + b][index + n - 1] = count;
        }

        //index+n-1,index+n-1 -> index+n-1,index+1
        for (int c = 0; c < n - 1; c++) {
            count++;
            matrix[index + n - 1][index + n - 1 - c] = count;
        }

        //index+n-1,index->index+1,index
        for (int d = 0; d < n - 1; d++) {
            count++;
            matrix[index + n - 1 - d][index] = count;
        }

        getMatrix(n - 2, index + 1, count, matrix);
    }
}
