package com.example.pack1to50;

/**
 * Created by majie on 15/12/30.
 */
public class RotateImage {
    public static void rotate(int[][] matrix) {
        //when n=4,(0,1)->(1,3)->(3,2)->(2,0)
        //so,(i,j)->(j,n-1-i)->(n-1-i,n-1-j)->(n-1-j,i)
        int n = matrix.length;
        if (n == 1) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
        if (n % 2 == 1) {
            int temp2 = 0;
            for (int k = 0; k < n / 2; k++) {
                temp2 = matrix[k][n / 2];
                matrix[k][n / 2] = matrix[n / 2][k];
                matrix[n / 2][k] = matrix[n - 1 - k][n / 2];
                matrix[n - 1 - k][n / 2] = matrix[n / 2][n - 1 - k];
                matrix[n / 2][n - 1 - k] = temp2;
            }
        }
    }
}
