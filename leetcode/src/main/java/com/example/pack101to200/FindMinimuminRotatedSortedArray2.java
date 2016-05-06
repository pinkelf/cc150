package com.example.pack101to200;

/**
 * Created by majie on 16/3/3.
 */
public class FindMinimuminRotatedSortedArray2 {

    /**
     * Follow up for "Find Minimum in Rotated Sorted Array":
     * What if duplicates are allowed?
     * <p>
     * Would this affect the run-time complexity? How and why?
     * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
     * <p>
     * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
     * <p>
     * Find the minimum element.
     * <p>
     * The array may contain duplicates.
     *
     * @param nums
     * @return
     */
    public static int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }

        return find(nums, 0, nums.length - 1);
    }

    private static int find(int[] nums, int low, int high) {
        if (high - low == 1) {
            return Math.min(nums[low], nums[high]);
        }

        int mid = low + (high - low) / 2;
        if (nums[mid] < nums[low]) {
            return find(nums, low, mid);
        } else if (nums[mid] > nums[high]) {
            return find(nums, mid, high);
        } else {
            return Math.min(find(nums, low, mid), find(nums, mid, high));
        }
    }
}
