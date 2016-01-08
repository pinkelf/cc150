package com.example.pack51to100;

import java.util.ArrayList;

/**
 * Created by majie on 16/1/6.
 */
public class SetMatrixZeroes {
    /**
     * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
     * <p>
     * click to show follow up.
     * <p>
     * Follow up:
     * Did you use extra space?
     * A straight forward solution using O(mn) space is probably a bad idea.
     * A simple improvement uses O(m + n) space, but still not the best solution.
     * Could you devise a constant space solution?
     *
     * @param matrix
     */

    //constant space solution
    public static void setZeroes(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        //mark first column & row
        boolean fc = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                fc = true;
                break;
            }
        }
        boolean fr = false;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                fr = true;
                break;
            }
        }

        //use first column & row to mark
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //set inner matrix to 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        //set first column & row
        if (fc) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (fr) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    //O(mn) space solution
    public static void setZeroes2(int[][] matrix) {
        //use m & n array to mark
        ArrayList<Integer> m = new ArrayList<Integer>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    m.add(i);
                    n.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (m.contains(i)) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (n.contains(j)) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
