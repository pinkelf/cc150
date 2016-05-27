package com.example.pack101to200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by majie on 16/5/27.
 */
public class ReapeatedDNASequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        if (s.length() < 11) {
            return result;
        }

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            Integer num = map.get(sub);
            if (num == null || num == 0) {
                map.put(sub, 1);
            } else {
                num++;
                map.put(sub, num);
                if (num == 2) {
                    result.add(sub);
                }
            }
        }

        return result;
    }
}
