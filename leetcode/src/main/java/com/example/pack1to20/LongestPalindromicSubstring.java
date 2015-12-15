package com.example.pack1to20;

/**
 * Created by majie on 15/12/15.
 */
public class LongestPalindromicSubstring {

    /**
     * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
     */

    public static String longestPalindrome(String s) {
        int max = 1;
        int length = s.length();
        int begin = 0;
        int end = 0;
        if (length == 1) {
            return s;
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; i - j > -1 && i + j < length; j++) {
                if ((s.charAt(i - j) == s.charAt(i + j))) {
                    if ((2 * j + 1 > max)) {
                        max = 2 * j + 1;
                        begin = i - j;
                        end = i + j;
                    }
                } else {
                    break;
                }
            }
            for (int j = 1; i - j > -2 && i + j < length; j++) {
                if ((s.charAt(i - j + 1) == s.charAt(i + j))) {
                    if ((2 * j > max)) {
                        max = 2 * j;
                        begin = i - j + 1;
                        end = i + j;
                    }
                } else {
                    break;
                }
            }
        }
        return s.substring(begin, end + 1);
    }
}
