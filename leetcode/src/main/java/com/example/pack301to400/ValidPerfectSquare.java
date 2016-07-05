package com.example.pack301to400;

/**
 * Created by majie on 16/7/5.
 */
public class ValidPerfectSquare {
    /**
     * Given a positive integer num, write a function which returns True if num is a perfect square else False.
     * <p/>
     * Note: Do not use any built-in library function such as sqrt.
     * <p/>
     * Example 1:
     * <p/>
     * Input: 16
     * Returns: True
     * Example 2:
     * <p/>
     * Input: 14
     * Returns: False
     *
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        if ((num & 1) == 1) {
            for (int i = 1; i < num + 1; ) {
                if (i * i < num) {
                    i += 2;
                } else if (i * i == num) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            for (int i = 2; i < num + 1; ) {
                if (i * i < num) {
                    i += 2;
                } else if (i * i == num) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
