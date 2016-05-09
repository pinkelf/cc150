package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class UglyNumber {

    /**
     * Write a program to check whether a given number is an ugly number.
     * <p/>
     * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
     * <p/>
     * Note that 1 is typically treated as an ugly number.
     *
     * @param num
     * @return
     */
    public static boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        return num == 1;
    }
}
