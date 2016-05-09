package com.example.pack301to400;

/**
 * Created by majie on 16/5/9.
 */
public class PowerOfFour {
    /**
     * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
     * <p/>
     * Example:
     * Given num = 16, return true. Given num = 5, return false.
     * <p/>
     * Follow up: Could you solve it without loops/recursion?
     *
     * @param num
     * @return
     */
    public static boolean isPowerOfFour(int num) {
        //it should looks like 1(00)*, not 1(0)*;
        //so exclude power of two by & 0101
        return num > 0 && (num & num - 1) == 0 && (num & 0x55555555) != 0;
    }
}
