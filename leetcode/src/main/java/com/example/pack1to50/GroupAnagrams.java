package com.example.pack1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by majie on 15/12/30.
 */
public class GroupAnagrams {

    /**
     * Given an array of strings, group anagrams together.
     * <p/>
     * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * Return:
     * <p/>
     * [
     * ["ate", "eat","tea"],
     * ["nat","tan"],
     * ["bat"]
     * ]
     * Note:
     * For the return value, each inner list's elements must follow the lexicographic order.
     * All inputs will be in lower-case.
     *
     * @param strs
     * @return
     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            String key = getKey(str);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(key, list);
            }
        }

        for (String k : map.keySet()) {
            List<String> r = map.get(k);
            Collections.sort(r);
            result.add(r);
        }

        return result;
    }

    private static String getKey(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }


}
