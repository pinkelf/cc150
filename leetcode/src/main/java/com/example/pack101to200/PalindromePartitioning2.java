package com.example.pack101to200;

import java.util.Arrays;

/**
 * Created by majie on 16/6/17.
 */
public class PalindromePartitioning2 {

    /**
     * Given a string s, partition s such that every substring of the partition is a palindrome.
     * <p/>
     * Return the minimum cuts needed for a palindrome partitioning of s.
     * <p/>
     * For example, given s = "aab",
     * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
     *
     * @param s
     * @return
     */
    public static int minCut(String s) {
        // if use the same method as previous problem, it will cause TLE.
        // since we can use a boolean[][] to simplify the panlindrome judge.
        // which is c[j] == c[i] && (i-j<3 || palin[j+1][i-1])
        if (s.length() == 0) {
            return 0;
        }
        boolean[][] isPal = new boolean[s.length() + 1][s.length() + 1];
        int[] dp = new int[s.length() + 1];
        //init dp, max is cut every single char
        for (int i = 0; i < dp.length; i++) {
            dp[i] = i - 1;
        }

        //count dp
        for (int i = 2; i < s.length() + 1; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (s.charAt(j) == s.charAt(i - 1) && (i - j < 3 || isPal[j + 1][i - 1])) {
                    isPal[j][i] = true;
                    dp[i] = Math.min(dp[j] + 1, dp[i]);
                }
            }
        }

        return dp[s.length()];
    }
}
