package com.example.pack101to200;

/**
 * Created by majie on 16/5/9.
 */
public class HouseRob {
    /**
     * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
     * <p/>
     * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
     *
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        int robPre = 0;
        int notRobPre = 0;
        for (int i = 0; i < nums.length; i++) {
            int curRob = notRobPre + nums[i];
            int curNotRob = Math.max(robPre, notRobPre);
            robPre = curRob;
            notRobPre = curNotRob;
        }

        return Math.max(robPre, notRobPre);
    }
}
