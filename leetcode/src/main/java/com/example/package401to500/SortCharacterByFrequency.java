package com.example.package401to500;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by majie on 17/1/24.
 */

public class SortCharacterByFrequency {
    public static String frequencySort(String s) {
        TreeMap<Integer, HashSet<Character>> treemap = new TreeMap<Integer, HashSet<Character>>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = map.get(c);
            if (count == null) {
                map.put(c, 1);
            } else {
                map.put(c, count + 1);
            }

            int index = map.get(c);
            HashSet<Character> newset = treemap.get(index);
            HashSet<Character> oldset = treemap.get(index - 1);
            if (newset == null) {
                HashSet<Character> set = new HashSet<Character>();
                set.add(c);
                treemap.put(index, set);
            } else {
                newset.add(c);
                treemap.put(index, newset);
            }
            if (oldset != null) {
                oldset.remove(c);
                treemap.put(index - 1, oldset);
            }
        }

        StringBuilder builder = new StringBuilder();
        Iterator iter = treemap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            HashSet<Character> set = (HashSet<Character>) entry.getValue();
            for (Character c : set) {
                int count = (int) entry.getKey();
                while (count > 0) {
                    builder.append(c);
                    count--;
                }
            }
        }

        return builder.reverse().toString();
    }
}
