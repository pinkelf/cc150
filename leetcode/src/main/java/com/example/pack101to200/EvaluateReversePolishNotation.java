package com.example.pack101to200;

import java.util.Stack;

/**
 * Created by majie on 16/5/6.
 */
public class EvaluateReversePolishNotation {
    /**
     * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
     * <p/>
     * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
     * <p/>
     * Some examples:
     * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
     * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
     *
     * @param tokens
     * @return
     */
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if (str.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = b + a;
                stack.push(c);
            } else if (str.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = b - a;
                stack.push(c);
            } else if (str.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = b * a;
                stack.push(c);
            } else if (str.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                int c = b / a;
                stack.push(c);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

        return stack.pop();
    }
}
