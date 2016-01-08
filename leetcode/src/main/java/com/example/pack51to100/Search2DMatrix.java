package com.example.pack51to100;

/**
 * Created by majie on 16/1/7.
 */
public class Search2DMatrix {
    /**
     * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
     * <p/>
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the previous row.
     * For example,
     * <p/>
     * Consider the following matrix:
     * <p/>
     * [
     * [1,   3,  5,  7],
     * [10, 11, 16, 20],
     * [23, 30, 34, 50]
     * ]
     * Given target = 3, return true.
     *
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int i = 0;
        while (i < matrix.length) {
            if (matrix[i][0] == target) {
                return true;
            }
            if (matrix[i][0] < target && (i + 1 >= matrix.length || matrix[i + 1][0] > target)) {
                return bSearch(matrix[i], 0, matrix[i].length - 1, target);
            }
            i++;
        }
        return false;
    }

    private static boolean bSearch(int[] array, int low, int high, int target) {
        if (target < array[low] || target > array[high]) {
            return false;
        }
        if (low == high) {
            return array[low] == target;
        }
        int mid = (low + high) / 2;
        if (array[mid] == target) {
            return true;
        } else if (target < array[mid]) {
            return bSearch(array, low, mid, target);
        } else {
            return bSearch(array, mid + 1, high, target);
        }
    }
}
