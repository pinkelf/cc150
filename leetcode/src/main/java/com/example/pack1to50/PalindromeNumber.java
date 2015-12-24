package com.example.pack1to50;

import java.util.ArrayList;

/**
 * Created by majie on 15/12/15.
 */
public class PalindromeNumber {
    /**
     * Determine whether an integer is a palindrome. Do this without extra space.
     */

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (x != 0) {
            list.add(x % 10);
            x = x / 10;
        }
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            if (list.get(i) == list.get(size - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
