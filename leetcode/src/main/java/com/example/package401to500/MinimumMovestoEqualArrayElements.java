package com.example.package401to500;

import java.util.Arrays;

/**
 * Created by majie on 16/11/25.
 */

//TODO
public class MinimumMovestoEqualArrayElements {

    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        while (nums[0] < nums[nums.length - 1]) {
            count += update(nums);
            swap(nums);
        }

        return count;
    }

    private static int update(int[] nums) {
        int count = 0;
        while (nums[1] <= nums[2] && nums[0] != nums[nums.length - 1]) {
            nums[0]++;
            nums[1]++;
            count++;
        }
        return count;
    }

    private static void swap(int[] nums) {
        int i = 2;
        while (i < nums.length && nums[i] < nums[1]) {
            i++;
        }
        int temp = nums[i - 1];
        nums[i - 1] = nums[1];
        nums[1] = temp;

        if (nums[0] == nums[nums.length - 1]) {
            return;
        }

        i = 1;
        while (i < nums.length && nums[i] < nums[0]) {
            i++;
        }
        temp = nums[i - 1];
        nums[i - 1] = nums[1];
        nums[1] = temp;
    }
}
