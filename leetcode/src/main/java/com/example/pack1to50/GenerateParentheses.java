package com.example.pack1to50;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/12/20.
 */
public class GenerateParentheses {
    /**
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     * <p/>
     * For example, given n = 3, a solution set is:
     * <p/>
     * "((()))", "(()())", "(())()", "()(())", "()()()"
     *
     * @param n
     * @return
     */

    public static List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        if (n == 0) {
            return results;
        } else {
            results.add("(");
            return generate(1, 0, results, n);
        }
    }

    private static List<String> generate(int left, int right, List<String> results, int n) {
        if (left == n && right == n) {
            return results;
        }
        if (left == n) {
            List<String> result1 = new ArrayList<String>();
            int index = right;
            for (String string : results) {
                String temp = "";
                while (index < n) {
                    temp += ")";
                    index++;
                }
                result1.add(string + temp);
            }
            return result1;
        }


        if (left == right) {
            List<String> result1 = new ArrayList<String>();
            for (String string : results) {
                result1.add(string + "(");
            }
            return generate(left + 1, right, result1, n);
        } else if (left > right) {
            List<String> result1 = new ArrayList<String>();
            List<String> result2 = new ArrayList<String>();
            for (String string : results) {
                result1.add(string + "(");
                result2.add(string + ")");
            }
            List<String> r1 = generate(left + 1, right, result1, n);
            List<String> r2 = generate(left, right + 1, result2, n);
            r1.addAll(r2);
            return r1;
        }
        return results;
    }
}
