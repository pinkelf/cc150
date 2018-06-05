package com.example.p801to900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SubDomainVisits {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < cpdomains.length; i++) {
            split(map, cpdomains[i]);
        }

        for (Map.Entry entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;
    }

    private static void split(HashMap<String, Integer> map, String str) {
        int counts = Integer.parseInt(str.split(" ")[0]);
        String domain = str.split(" ")[1];
        add(map, domain, counts);
        for (int i = 0; i < domain.length(); i++) {
            if (domain.charAt(i) == '.') {
                add(map, domain.substring(i + 1, domain.length()), counts);
            }
        }
    }

    private static void add(HashMap<String, Integer> map, String str, int counts) {
        Integer value = map.get(str);
        if (value == null) {
            map.put(str, counts);
        } else {
            map.put(str, counts + value);
        }
    }
}
