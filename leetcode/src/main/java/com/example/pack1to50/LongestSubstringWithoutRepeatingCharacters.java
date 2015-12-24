package com.example.pack1to50;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by majie on 15/12/23.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
     */

    public static int lengthOfLongestSubstring1(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int maxLength = 1;
        //use set and 2 loop to check
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    int size = set.size();
                    if (maxLength < size) {
                        maxLength = size;
                    }
                    set.clear();
                    break;
                } else {
                    set.add(c);
                }
            }
        }
        return maxLength;
    }

    public static int lengthOfLongestSubstring2(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int maxLength = 1;
        //use map to save character's position, so i can move faster, not one by one
        //TODO but it is slower than method1 ... T.T
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int length = s.length();
        for (int i = 0; i < length; ) {
            for (int j = i; j < length; j++) {
                char c = s.charAt(j);
                if (map.get(c) != null) {
                    int size = map.size();
                    i = map.get(c) + 1;
                    if (maxLength < size) {
                        maxLength = size;
                    }
                    map.clear();
                    break;
                } else {
                    map.put(c, j);
                }
            }
        }
        return maxLength;
    }
}
