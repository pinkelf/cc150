package com.example.pack51to100;

/**
 * Created by majie on 16/1/6.
 */
public class PlusOne {
    /**
     * Given a non-negative number represented as an array of digits, plus one to the number.
     * <p>
     * The digits are stored such that the most significant digit is at the head of the list.
     */
    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i > -1) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
            i--;
        }

        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
