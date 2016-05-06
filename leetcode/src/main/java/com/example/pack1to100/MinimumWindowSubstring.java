package com.example.pack1to100;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/4/16.
 */
public class MinimumWindowSubstring {
    /**
     * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
     * <p/>
     * For example,
     * S = "ADOBECODEBANC"
     * T = "ABC"
     * Minimum window is "BANC".
     * <p/>
     * Note:
     * If there is no such window in S that covers all characters in T, return the empty string "".
     * <p/>
     * If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
     *
     * @param s
     * @param t
     * @return
     */
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.get(t.charAt(i)) == null ? -1 : map.get(t.charAt(i)) - 1);
        }

        int minleft = 0;
        int minright = 0;
        int minlength = s.length() + 1;

        int length = t.length();
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = map.get(c);
            if (count != null) {
                map.put(c, count + 1);
                if (count < 0) {
                    length--;
                }
            }

            //use length only once. use minlength for others.
            if (length == 0) {
                //update left
                char cleft = s.charAt(left);
                while (map.get(cleft) == null || map.get(cleft) > 0) {
                    if (map.get(cleft) != null) {
                        map.put(cleft, map.get(cleft) - 1);
                    }
                    left++;
                    cleft = s.charAt(left);
                }

                //find a match
                if (minlength > i - left + 1) {
                    minleft = left;
                    minright = i;
                    minlength = i - left + 1;
                }
            }
        }
        if (length != 0) {
            return "";
        }
        return s.substring(minleft, minright + 1);
    }
}
