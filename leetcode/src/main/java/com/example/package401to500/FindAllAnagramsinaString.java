package com.example.package401to500;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by majie on 16/12/14.
 */

public class FindAllAnagramsinaString {
    /**
     * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
     * <p>
     * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
     * <p>
     * The order of output does not matter.
     * <p>
     * Example 1:
     * <p>
     * Input:
     * s: "cbaebabacd" p: "abc"
     * <p>
     * Output:
     * [0, 6]
     * <p>
     * Explanation:
     * The substring with start index = 0 is "cba", which is an anagram of "abc".
     * The substring with start index = 6 is "bac", which is an anagram of "abc".
     *
     * @param s
     * @param p
     * @return
     */
    public static List<Integer> findAnagrams(String s, String p) {
        int[] mark = new int[26];
        for (int i = 0; i < p.length(); i++) {
            mark[p.charAt(i) - 'a']++;
        }

        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String sub = s.substring(i, i + p.length());
            int[] index = Arrays.copyOf(mark, mark.length);
            if (check(sub, index)) {
                list.add(i);
            }
        }

        return list;
    }

    private static boolean check(String sub, int[] index) {
        for (int i = 0; i < sub.length(); i++) {
            if (index[sub.charAt(i) - 'a'] == 0) {
                return false;
            } else {
                index[sub.charAt(i) - 'a']--;
            }
        }
        return true;
    }
}
