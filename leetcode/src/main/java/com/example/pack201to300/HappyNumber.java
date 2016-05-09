package com.example.pack201to300;

import java.util.HashSet;

/**
 * Created by majie on 16/5/9.
 */
public class HappyNumber {

    /**
     * Write an algorithm to determine if a number is "happy".
     * <p/>
     * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
     * <p/>
     * Example: 19 is a happy number
     * <p/>
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     *
     * @param n
     * @return
     */
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while (!set.contains(n)) {
            set.add(n);
            n = getNumber(n);
        }
        return n == 1;
    }

    private static int getNumber(int n) {
        int sum = 0;
        int y;
        while (n > 0) {
            y = n % 10;
            n = n / 10;
            sum += y * y;
        }
        return sum;
    }
}
