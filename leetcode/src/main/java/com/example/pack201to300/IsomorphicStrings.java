package com.example.pack201to300;

import java.util.HashMap;

/**
 * Created by majie on 16/5/9.
 */
public class IsomorphicStrings {

    /**
     * Given two strings s and t, determine if they are isomorphic.
     * <p/>
     * Two strings are isomorphic if the characters in s can be replaced to get t.
     * <p/>
     * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
     * <p/>
     * For example,
     * Given "egg", "add", return true.
     * <p/>
     * Given "foo", "bar", return false.
     * <p/>
     * Given "paper", "title", return true.
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            Character c = map1.get(s.charAt(i));
            if (c == null) {
                map1.put(s.charAt(i), t.charAt(i));
            } else if (c == t.charAt(i)) {
                continue;
            } else {
                return false;
            }

            Character d = map2.get(t.charAt(i));
            if (d == null) {
                map2.put(t.charAt(i), s.charAt(i));
            } else if (d == s.charAt(i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
