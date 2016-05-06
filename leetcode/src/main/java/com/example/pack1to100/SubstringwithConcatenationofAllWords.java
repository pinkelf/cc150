package com.example.pack1to100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by majie on 16/3/8.
 */
public class SubstringwithConcatenationofAllWords {

    /**
     * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
     * <p/>
     * For example, given:
     * s: "barfoothefoobarman"
     * words: ["foo", "bar"]
     * <p/>
     * You should return the indices: [0,9].
     * (order does not matter).
     *
     * @param s
     * @param words
     * @return
     */
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<Integer>();
        if (s == null || words == null || words.length == 0) {
            return result;
        }

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int len = words[0].length();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.get(words[i]) == null ? 1 : map.get(words[i]) + 1);
        }

        //for loop i, use kmp or bm to optimize special cases.
        for (int i = 0; i < s.length() - len * words.length + 1; i++) {
            //copy map
            HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
            for (int j = 0; i + j * len + len <= s.length(); j++) {
                String sub = s.substring(i + j * len, i + (j + 1) * len);
                Integer a = copy.get(sub);

                if (a == null || a == 0) {
                    break;
                } else if (a == 1) {
                    copy.remove(sub);
                } else {
                    copy.put(sub, a - 1);
                }

                if (copy.isEmpty()) {
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }
}
