package com.example.pack1to100;

/**
 * Created by majie on 16/1/4.
 */
public class JumpGame {
    /**
     * Given an array of non-negative integers, you are initially positioned at the first index of the array.
     * <p>
     * Each element in the array represents your maximum jump length at that position.
     * <p>
     * Determine if you are able to reach the last index.
     * <p>
     * For example:
     * A = [2,3,1,1,4], return true.
     * <p>
     * A = [3,2,1,0,4], return false.
     */

    public static boolean canJump(int[] nums) {
        int linkIndex = nums.length - 1;
        int i = nums.length - 2;
        while (i > -1) {
            if (nums[i] >= linkIndex - i) {
                linkIndex = i;
            }
            i--;
        }
        return linkIndex == 0;
    }
}
