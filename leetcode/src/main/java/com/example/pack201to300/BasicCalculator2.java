package com.example.pack201to300;

import java.util.Stack;

/**
 * Created by majie on 16/5/9.
 */
public class BasicCalculator2 {

    /**
     * Implement a basic calculator to evaluate a simple expression string.
     * <p/>
     * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
     * <p/>
     * You may assume that the given expression is always valid.
     * <p/>
     * Some examples:
     * "3+2*2" = 7
     * " 3/2 " = 1
     * " 3+5 / 2 " = 5
     * Note: Do not use the eval built-in library function.
     *
     * @param s
     * @return
     */
    public static int calculate(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        s = s + '+';
        int left = 0;
        char oper = 'a';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOper(c) || i == s.length() - 1) {
                int num = Integer.parseInt(s.substring(left, i).trim());
                if (oper == '-') {
                    stack.push(-num);
                } else if (oper == '*') {
                    stack.push(stack.pop() * num);
                } else if (oper == '/') {
                    stack.push(stack.pop() / num);
                } else {
                    stack.push(num);
                }
                oper = c;
                left = i + 1;
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }

    private static boolean isOper(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
