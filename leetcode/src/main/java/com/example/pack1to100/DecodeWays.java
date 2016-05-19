package com.example.pack1to100;

/**
 * Created by majie on 16/5/17.
 */
public class DecodeWays {

    /**
     * A message containing letters from A-Z is being encoded to numbers using the following mapping:
     * <p/>
     * 'A' -> 1
     * 'B' -> 2
     * ...
     * 'Z' -> 26
     * Given an encoded message containing digits, determine the total number of ways to decode it.
     * <p/>
     * For example,
     * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
     * <p/>
     * The number of ways decoding "12" is 2.
     *
     * @param s
     * @return
     */
    public static int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int pre = 0;
        int sum = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    if (i > 1 + pre) {
                        sum *= getDecodes(s.substring(pre, i - 1));
                    }
                    pre = i + 1;
                } else {
                    return 0;
                }
            } else if (i == s.length() - 1) {
                sum *= getDecodes(s.substring(pre, s.length()));
            }
        }

        return sum;
    }

    private static int getDecodes(String s) {
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        dp[s.length() - 1] = 1;
        for (int i = s.length() - 2; i > -1; i--) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                dp[i] = dp[i + 1] + dp[i + 2];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
    }
}
