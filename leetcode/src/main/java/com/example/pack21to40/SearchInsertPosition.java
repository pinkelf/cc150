package com.example.pack21to40;

/**
 * Created by majie on 15/12/22.
 */
public class SearchInsertPosition {
    /**
     * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * <p/>
     * You may assume no duplicates in the array.
     * <p/>
     * Here are few examples.
     * [1,3,5,6], 5 → 2
     * [1,3,5,6], 2 → 1
     * [1,3,5,6], 7 → 4
     * [1,3,5,6], 0 → 0
     */

    public static int searchInsert(int[] nums, int target) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums[0] > target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        boolean smaller = false;

        while (low <= high) {
            index = (low + high) / 2;
            int result = nums[index];
            if (result == target) {
                return index;
            } else if (result > target) {
                high = index - 1;
                smaller = false;
            } else {
                low = index + 1;
                smaller = true;
            }
        }

        if (smaller) {
            return index + 1;
        } else {
            return index;
        }
    }
}
