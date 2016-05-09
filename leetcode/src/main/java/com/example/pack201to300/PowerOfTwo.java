package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class PowerOfTwo {
    /**
     * Given an integer, write a function to determine if it is a power of two.
     *
     * @param n
     * @return
     */
    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        return (n & n - 1) == 0;
    }
}
