package com.example.pack201to300;

/**
 * Created by majie on 16/12/9.
 */

public class HouseRobberII {

    /**
     * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention.
     * This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.
     * Meanwhile, the security system for these houses remain the same as for those in the previous street.
     * <p>
     * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
     *
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        //base on house robber I, we use an very straight solution here.
        //There are 3 cases, rob first, rob last, don't rob first or last.
        //so we loop three times with different boundaries and return the maximum.
        int robPre = 0;
        int notRobPre = 0;
        for (int i = 1; i < nums.length - 2; i++) {
            int curRob = notRobPre + nums[i];
            int curNotRob = Math.max(robPre, notRobPre);
            robPre = curRob;
            notRobPre = curNotRob;
        }

        int robLast = Math.max(robPre, notRobPre) + nums[nums.length - 1];

        robPre = 0;
        notRobPre = 0;
        for (int i = 2; i < nums.length - 1; i++) {
            int curRob = notRobPre + nums[i];
            int curNotRob = Math.max(robPre, notRobPre);
            robPre = curRob;
            notRobPre = curNotRob;
        }
        int robFirst = Math.max(robPre, notRobPre) + nums[0];

        robPre = 0;
        notRobPre = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int curRob = notRobPre + nums[i];
            int curNotRob = Math.max(robPre, notRobPre);
            robPre = curRob;
            notRobPre = curNotRob;
        }
        int robMid = Math.max(robPre, notRobPre);

        return Math.max(robMid, Math.max(robLast, robFirst));
    }
}
