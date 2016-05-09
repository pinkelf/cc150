package com.example.pack201to300;

import java.util.Arrays;

/**
 * Created by majie on 16/5/9.
 */
public class ValidAnagram {

    /**
     * Given two strings s and t, write a function to determine if t is an anagram of s.
     * <p/>
     * For example,
     * s = "anagram", t = "nagaram", return true.
     * s = "rat", t = "car", return false.
     * <p/>
     * Note:
     * You may assume the string contains only lowercase alphabets.
     * <p/>
     * Follow up:
     * What if the inputs contain unicode characters? How would you adapt your solution to such case?
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        //simple sort method. can use hashMap / prime plus to optimize
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
