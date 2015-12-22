package com.example.pack21to40;

/**
 * Created by majie on 15/12/22.
 */
public class SearchForARange {
    /**
     * Given a sorted array of integers, find the starting and ending position of a given target value.
     * <p/>
     * Your algorithm's runtime complexity must be in the order of O(log n).
     * <p/>
     * If the target is not found in the array, return [-1, -1].
     * <p/>
     * For example,
     * Given [5, 7, 7, 8, 8, 10] and target value 8,
     * return [3, 4].
     *
     * @param nums
     * @param target
     * @return
     */

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = -1;
        int right = -1;

        int low = 0;
        int high = nums.length - 1;
        //find left
        while (low <= high) {
            int index = (low + high) / 2;
            int result = nums[index];
            if (result == target) {
                if (index == 0 || nums[index] > nums[index - 1]) {
                    left = index;
                    break;
                }
                high = index - 1;
            } else if (result > target) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }

        low = Math.max(left, 0);
        high = nums.length - 1;
        //find right
        while (low <= high) {
            int index = (low + high) / 2;
            int result = nums[index];
            if (result == target) {
                if (index == nums.length - 1 || nums[index] < nums[index + 1]) {
                    right = index;
                    break;
                }
                low = index + 1;
            } else if (result > target) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }
        return new int[]{left, right};
    }
}
