package com.example.pack1to50;

/**
 * Created by majie on 15/12/15.
 */
public class StringToInteger {

    /**
     * Implement atoi to convert a string to an integer.
     * <p/>
     * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
     * <p/>
     * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
     */

    public static int myAtoi(String str) {
        str = str.trim();
        int result = 0;
        boolean isPositive = true;
        if (str.length() == 0) {
            return result;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '-' || c == '+')) {
                if (c == '-') {
                    isPositive = false;
                }
            } else if (c <= '9' && c >= '0') {
                if (isPositive) {
                    //>max
                    if (result > (Integer.MAX_VALUE / 10)) {
                        return Integer.MAX_VALUE;
                    }
                    result = result * 10 + Character.digit(c, 10);
                    if (result < 0) {
                        // > max
                        return Integer.MAX_VALUE;
                    }
                } else {
                    //<min
                    if (result < (Integer.MIN_VALUE / 10)) {
                        return Integer.MIN_VALUE;
                    }
                    result = result * 10 - Character.digit(c, 10);
                    if (result > 0) {
                        // < min
                        return Integer.MIN_VALUE;
                    }
                }
            } else {
                //not a integer char
                return result;
            }
        }
        return result;
    }
}
