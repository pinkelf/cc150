package com.example.pack1to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 15/12/31.
 */
public class SpiralMatrix {
    /**
     * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
     * <p/>
     * For example,
     * Given the following matrix:
     * <p/>
     * [
     * [ 1, 2, 3 ],
     * [ 4, 5, 6 ],
     * [ 7, 8, 9 ]
     * ]
     * You should return [1,2,3,6,9,8,7,4,5].
     *
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        return getInteger(matrix, 0, 0, matrix.length, matrix[0].length, list);

    }

    private static List<Integer> getInteger(int[][] matrix, int x, int y, int m, int n, List<Integer> list) {
        if (m == 0 || n == 0) {
            return list;
        }
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                list.add(matrix[x][y + i]);
            }
            return list;
        }
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                list.add(matrix[x + i][y]);
            }
            return list;
        }

        //x=0,y=0,m=3,n=4
        //(0,0)->(0,2)
        for (int a = 0; a < n - 1; a++) {
            list.add(matrix[x][a + y]);
        }
        //(0,3)->(1,3)
        for (int b = 0; b < m - 1; b++) {
            list.add(matrix[b + x][y + n - 1]);
        }
        //(2,3)->(2,1)
        for (int c = n - 1; c > 0; c--) {
            list.add(matrix[x + m - 1][c + y]);
        }
        //(2,0)->(1,0)
        for (int d = m - 1; d > 0; d--) {
            list.add(matrix[d + x][y]);
        }

        return getInteger(matrix, x + 1, y + 1, m - 2, n - 2, list);
    }
}
