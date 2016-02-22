package com.example.pack1to50;

import java.util.Stack;

/**
 * Created by majie on 16/2/22.
 */
public class Longest {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int maxLen = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                //positions of '('
                stack.push(i);
            } else { //it's ')'
                if (!stack.empty() && s.charAt(stack.peek()) == '(') {
                    //encountered a valid '()'
                    stack.pop();

                    //if(a1,a2)->valid,(a3,a4)->valid, so (a1,a4)->valid & length = a4-a0;
                    int lastPos = -1;
                    if (!stack.empty()) {
                        lastPos = stack.peek();
                    }

                    int curLen = i - lastPos;

                    maxLen = Math.max(maxLen, curLen);
                } else {
                    stack.push(i);
                }
            }
        }
        return maxLen;
    }
}
