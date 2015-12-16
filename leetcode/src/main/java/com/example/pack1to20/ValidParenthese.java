package com.example.pack1to20;

import java.util.ArrayList;

/**
 * Created by majie on 15/12/16.
 */
public class ValidParenthese {
    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */

    public static boolean isValid(String s) {
        int length = s.length();
        if (length == 0) {
            return true;
        }

        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < length; i++) {
            if (list.isEmpty()) {
                list.add(s.charAt(i));
                continue;
            }
            char l = list.get(list.size() - 1);
            char r = s.charAt(i);
            if ((r == ')' && l == '(') || (r == ']' && l == '[') || (r == '}' && l == '{')) {
                list.remove(list.size() - 1);
            } else {
                list.add(s.charAt(i));
            }
        }
        return list.isEmpty();
    }
}
