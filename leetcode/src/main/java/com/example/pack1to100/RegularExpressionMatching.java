package com.example.pack1to100;

/**
 * Created by majie on 16/5/6.
 */
public class RegularExpressionMatching {

    /**
     * Implement regular expression matching with support for '.' and '*'.
     * <p/>
     * '.' Matches any single character.
     * '*' Matches zero or more of the preceding element.
     * <p/>
     * The matching should cover the entire input string (not partial).
     * <p/>
     * The function prototype should be:
     * bool isMatch(const char *s, const char *p)
     * <p/>
     * Some examples:
     * isMatch("aa","a") → false
     * isMatch("aa","aa") → true
     * isMatch("aaa","aa") → false
     * isMatch("aa", "a*") → true
     * isMatch("aa", ".*") → true
     * isMatch("ab", ".*") → true
     * isMatch("aab", "c*a*b") → true
     *
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int j = 0; j < p.length(); j++) {
            if (p.charAt(j) == '*' && dp[0][j - 1]) {
                dp[0][j + 1] = true;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                char c = p.charAt(j);
                if (c == '.' || c == s.charAt(i)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }

                if (c == '*') {
                    // c == '*'
                    if (s.charAt(i) != p.charAt(j - 1) && p.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1] || dp[i + 1][j] || dp[i][j + 1];
                    }
                }
            }
        }

        return dp[s.length()][p.length()];
    }
}
