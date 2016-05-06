package com.example.pack1to100;

/**
 * Created by Administrator on 2015/12/15.
 */
public class LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return strs[0];
        }

        int length = strs[0].length();
        int i;
        for (i = 0; i < length; i++) {
            char a = strs[0].charAt(i);
            for (int j = 1; j < size; j++) {
                while (i >= strs[j].length() || strs[j].charAt(i) != a) {
                    if (i == 0) {
                        return "";
                    } else {
                        return strs[0].substring(0, i);
                    }
                }
            }
        }
        return strs[0].substring(0, i);
    }
}
