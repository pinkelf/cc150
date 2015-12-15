package com.example;

import java.util.ArrayList;

/**
 * Created by majie on 15/12/15.
 */
public class ReverseInteger {
    /**
     * Reverse digits of an integer.
     * <p/>
     * Example1: x = 123, return 321
     * Example2: x = -123, return -321
     */
    public static int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Integer.MAX_VALUE / 10 < sum || Integer.MIN_VALUE / 10 > sum) {
                return 0;
            }
            sum = sum * 10 + list.get(i);
        }
        return sum;
    }
}
