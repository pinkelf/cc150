package com.example.package401to500;

/**
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 * <p>
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 * Created by majie on 17/1/24.
 */

public class NumberComplement {
    public static int findComplement(int num) {
        //though 0/1 stored in a stack, use an integer as stack
        int comp = 0;
        int result = 0;
        int length = 0; //record stack depth

        //push compelment 0.1 into stack
        while (num != 0) {
            comp = comp << 1;
            if ((num & 1) == 0) {
                comp = comp + 1;
            }
            num = num >> 1;
            length++;
        }

        //pull the result from the stack
        while (length != 0) {
            result = result << 1;
            result = result + (comp & 1);
            comp = comp >> 1;
            length--;
        }

        return result;
    }
}
