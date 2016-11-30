package com.example.package401to500;

import java.util.HashSet;

/**
 * Created by majie on 16/11/29.
 */

public class RepeatedSubStringPattern {

    public static boolean repeatedSubstringPattern(String str) {
        if (str.length() < 2) {
            return false;
        }
        HashSet<String> set = new HashSet<String>();

        for (int i = 1; i < str.length(); i++) {
            if (str.length() % i == 0) {
                set.add(str.substring(0, i));
                int j = i;
                while (j < str.length()) {
                    if (!set.contains(str.substring(j, j + i))) {
                        break;
                    }
                    j += i;
                    if(j == str.length()){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
