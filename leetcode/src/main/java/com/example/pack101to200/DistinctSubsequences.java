package com.example.pack101to200;

/**
 * Created by majie on 16/3/8.
 */
public class DistinctSubsequences {
    /**
     * Given a string S and a string T, count the number of distinct subsequences of T in S.
     * <p/>
     * A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
     * <p/>
     * Here is an example:
     * S = "rabbbit", T = "rabbit"
     * <p/>
     * Return 3.
     *
     * @param s
     * @param t
     * @return
     */
    public static int numDistinct(String s, String t) {
        //f(s,t) = f(s-1,t) + s(i) == t(i)?f(s-1,t-1):null;
        if (t.length() == 0) {
            return 1;
        }
        if (s.length() == 0) {
            return 0;
        }
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length() + 1; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < t.length() + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j + 1] + dp[i][j];
                } else {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
