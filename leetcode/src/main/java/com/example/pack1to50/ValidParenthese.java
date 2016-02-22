package com.example.pack1to50;

import java.util.Stack;

/**
 * Created by majie on 15/12/16.
 */
public class ValidParenthese {
    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p/>
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */

    public static boolean isValid(String s) {
        int length = s.length();
        if (length == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            if (stack.isEmpty()) {
                char c = s.charAt(i);
                if (c == ')' || c == ']' || c == '}') {
                    return false;
                }
                stack.add(s.charAt(i));
                continue;
            }
            char l = stack.peek();
            char r = s.charAt(i);
            if ((r == ')' && l == '(') || (r == ']' && l == '[') || (r == '}' && l == '{')) {
                stack.pop();
            } else {
                stack.push(r);
            }
        }
        return stack.isEmpty();
    }
}
