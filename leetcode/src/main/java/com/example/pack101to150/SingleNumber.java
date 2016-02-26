package com.example.pack101to150;

/**
 * Created by majie on 16/2/26.
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        //a^b^b =a, 0^a = a;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
