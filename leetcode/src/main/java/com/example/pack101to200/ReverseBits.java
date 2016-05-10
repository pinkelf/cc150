package com.example.pack101to200;

/**
 * Created by majie on 16/5/10.
 */
public class ReverseBits {

    /**
     * Reverse bits of a given 32 bits unsigned integer.
     * <p/>
     * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
     * <p/>
     * Follow up:
     * If this function is called many times, how would you optimize it?
     *
     * @param n
     * @return
     */
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1 | (n & 1);
            n = n >>> 1;
        }
        return result;
    }
}
