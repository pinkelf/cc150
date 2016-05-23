package com.example.pack201to300;

/**
 * Created by majie on 16/5/23.
 */
public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }

        int index = 0;
        while (true) {
            if ((a & 1) == 1) {
                break;
            }
            index++;
            a = a >>> 1;
        }

        int mask = 1;
        while (index > 0) {
            mask = mask << 1;
            index--;
        }

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & mask) == 0) {
                result[0] ^= nums[i];
            } else {
                result[1] ^= nums[i];
            }
        }

        return result;
    }
}
