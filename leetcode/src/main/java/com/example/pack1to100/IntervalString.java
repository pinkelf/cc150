package com.example.pack1to100;

/**
 * Created by Administrator on 2016/3/28.
 */
public class IntervalString {

    /**
     * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
     * <p/>
     * For example,
     * Given:
     * s1 = "aabcc",
     * s2 = "dbbca",
     * <p/>
     * When s3 = "aadbbcbcac", return true.
     * When s3 = "aadbbbaccc", return false.
     *
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public static boolean isInterleave(String s1, String s2, String s3) {
        //DP solution
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        if (s1.length() == 0) {
            return s3.equals(s2);
        }
        if (s2.length() == 0) {
            return s3.equals(s1);
        }

        boolean[][] result = new boolean[s1.length() + 1][s2.length() + 1];
        result[0][0] = true;

        for (int i = 1; i < s1.length() + 1; i++) {
            if (result[i - 1][0] && s3.charAt(i - 1) == s1.charAt(i - 1)) {
                result[i][0] = true;
            } else {
                result[i][0] = false;
            }
        }
        for (int j = 1; j < s2.length() + 1; j++) {
            if (result[0][j - 1] && s3.charAt(j - 1) == s2.charAt(j - 1)) {
                result[0][j] = true;
            } else {
                result[0][j] = false;
            }
        }

        for (int m = 1; m < s1.length() + 1; m++) {
            for (int n = 1; n < s2.length() + 1; n++) {
                result[m][n] = false;
                if (result[m][n - 1] && s3.charAt(m + n - 1) == s2.charAt(n - 1)) {
                    result[m][n] = true;
                }
                if (result[m - 1][n] && s3.charAt(m + n - 1) == s1.charAt(m - 1)) {
                    result[m][n] = true;
                }
            }
        }

        return result[s1.length()][s2.length()];
    }

    //recursion, TLE
    public static boolean isInterleave2(String s1, String s2, String s3) {
        if (s1.length() == 0) {
            return s3.equals(s2);
        }
        if (s2.length() == 0) {
            return s3.equals(s1);
        }
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);
        if (c1 == c3 && c2 == c3) {
            return isInterleave2(s1, s2.substring(1, s2.length()), s3.substring(1, s3.length())) || isInterleave2(s1.substring(1, s1.length()), s2, s3.substring(1, s3.length()));
        } else if (c1 == c3) {
            return isInterleave2(s1.substring(1, s1.length()), s2, s3.substring(1, s3.length()));
        } else if (c2 == c3) {
            return isInterleave2(s1, s2.substring(1, s2.length()), s3.substring(1, s3.length()));
        } else {
            return false;
        }
    }
}
