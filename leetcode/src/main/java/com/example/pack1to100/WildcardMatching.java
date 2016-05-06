package com.example.pack1to100;

/**
 * Created by majie on 16/5/6.
 */
public class WildcardMatching {
    /**
     * Implement wildcard pattern matching with support for '?' and '*'.
     * <p/>
     * '?' Matches any single character.
     * '*' Matches any sequence of characters (including the empty sequence).
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
     * isMatch("aa", "*") → true
     * isMatch("aa", "a*") → true
     * isMatch("ab", "?*") → true
     * isMatch("aab", "c*a*b") → false
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

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                char c = p.charAt(j);
                if (c != '*') {
                    dp[i + 1][j + 1] = dp[i][j] && (s.charAt(i) == c || c == '?');
                } else {
                    boolean flag = false;
                    for (int k = 0; k <= i + 1; k++) {
                        if (dp[k][j]) {
                            flag = true;
                            break;
                        }
                    }
                    dp[i + 1][j + 1] = j == 0 || flag;
                }
            }
        }

        return dp[s.length()][p.length()];
    }
}
