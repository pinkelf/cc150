package com.example.pack1to50;

/**
 * Created by majie on 16/1/7.
 */
public class JumpGame2 {
    /**
     * Given an array of non-negative integers, you are initially positioned at the first index of the array.
     * <p/>
     * Each element in the array represents your maximum jump length at that position.
     * <p/>
     * Your goal is to reach the last index in the minimum number of jumps.
     * <p/>
     * For example:
     * Given array A = [2,3,1,1,4]
     * <p/>
     * The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
     * <p/>
     * Note:
     * You can assume that you can always reach the last index.
     *
     * @param nums
     * @return
     */

    //Divide array into a tree, use BFS.
    public static int jump(int[] nums) {
        int level = 0, i = 0, levelMax = 0, nextMax = 0;
        while (i < nums.length) {
            nextMax = Math.max(nums[i] + i, nextMax);
            if (i == levelMax || i == nums.length - 1) {
                level++;
                levelMax = nextMax;
            }
            i++;
        }
        return level - 1;
    }

    //rude search, LTE
    public static int jump2(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int[] jumps = new int[nums.length];
        jumps[0] = 0;
        jumps[1] = 1;

        for (int i = 2; i < nums.length; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (nums[j] >= (i - j)) {
                    if (jumps[i] > jumps[j] + 1) {
                        jumps[i] = jumps[j] + 1;
                    }
                }
            }
        }
        return jumps[nums.length - 1];
    }
}
