package com.example.package401to500;

import java.util.HashSet;

/**
 * Created by majie on 16/11/29.
 */

public class RepeatedSubStringPattern {

    /**
     * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
     * <p>
     * Example 1:
     * Input: "abab"
     * <p>
     * Output: True
     * <p>
     * Explanation: It's the substring "ab" twice.
     *
     * @param str
     * @return
     */
    public static boolean repeatedSubstringPattern(String str) {
        if (str.length() < 2) {
            return false;
        }
        HashSet<String> set = new HashSet<String>();

        for (int i = 1; i < str.length(); i++) {
            if (str.length() % i == 0) {
                set.add(str.substring(0, i));
                int j = i;
                while (j < str.length()) {
                    if (!set.contains(str.substring(j, j + i))) {
                        break;
                    }
                    j += i;
                    if (j == str.length()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
