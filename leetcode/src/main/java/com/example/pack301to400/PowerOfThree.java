package com.example.pack301to400;

/**
 * Created by majie on 16/5/9.
 */
public class PowerOfThree {

    /**
     * Given an integer, write a function to determine if it is a power of three.
     * <p/>
     * Follow up:
     * Could you do it without using any loop / recursion?
     *
     * @param n
     * @return
     */
    public static boolean isPowerOfThree(int n) {
        while (n > 1) {
            if (n % 3 != 0 && n != 1) {
                return false;
            }
            n = n / 3;
        }

        return n == 1;
    }
}
