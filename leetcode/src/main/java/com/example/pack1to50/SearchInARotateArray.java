package com.example.pack1to50;

/**
 * Created by majie on 15/12/23.
 */
public class SearchInARotateArray {
    /**
     * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
     * <p/>
     * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
     * <p/>
     * You are given a target value to search. If found in the array return its index, otherwise return -1.
     * <p/>
     * You may assume no duplicate exists in the array.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        return search(0, nums.length - 1, target, nums);
    }

    private static int search(int low, int high, int target, int[] nums) {
        if (low == high) {
            if (nums[low] == target) {
                return low;
            } else {
                return -1;
            }
        }

        if (low == high - 1) {
            if (nums[low] == target) {
                return low;
            } else if (nums[high] == target) {
                return high;
            } else {
                return -1;
            }
        }


        int mid = (low + high) / 2;

        if (nums[mid] == target) {
            return mid;
        } else {
            if (nums[low] < target && target < nums[mid]) {
                return search(low, mid - 1, target, nums);
            } else if (nums[mid] < target && target < nums[high]) {
                return search(mid + 1, high, target, nums);
            } else {
                int a = search(low, mid - 1, target, nums);
                if (a == -1) {
                    return search(mid + 1, high, target, nums);
                } else {
                    return a;
                }
            }
        }
    }
}
