package com.example.pack201to300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by majie on 16/5/9.
 */
public class WordPattern {

    /**
     * Given a pattern and a string str, find if str follows the same pattern.
     * <p/>
     * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
     * <p/>
     * Examples:
     * pattern = "abba", str = "dog cat cat dog" should return true.
     * pattern = "abba", str = "dog cat cat fish" should return false.
     * pattern = "aaaa", str = "dog cat cat dog" should return false.
     * pattern = "abba", str = "dog dog dog dog" should return false.
     * Notes:
     * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
     *
     * @param pattern
     * @param str
     * @return
     */
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<Character, String>();
        HashMap<String, Character> map2 = new HashMap<String, Character>();

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String string = words[i];
            if (map1.get(c) == null && map2.get(string) == null) {
                map1.put(c, string);
                map2.put(string, c);
            } else if ((map1.get(c) != null && map1.get(c).equals(string)) && (map2.get(string) != null && map2.get(string) == c)) {

            } else {
                return false;
            }
        }

        return true;

    }
}
