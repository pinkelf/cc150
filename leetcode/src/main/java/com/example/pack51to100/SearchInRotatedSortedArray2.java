package com.example.pack51to100;

/**
 * Created by majie on 16/1/12.
 */
public class SearchInRotatedSortedArray2 {
    /**
     * Follow up for "Search in Rotated Sorted Array":
     * What if duplicates are allowed?
     * <p/>
     * Would this affect the run-time complexity? How and why?
     * <p/>
     * Write a function to determine if a given target is in the array.
     * <p/>
     * Subscribe to see which companies asked this question
     *
     * @param nums
     * @param target
     * @return
     */
    public static boolean search(int[] nums, int target) {
        int result = search(0, nums.length - 1, target, nums);
        return result != -1;
    }

    private static int search(int low, int high, int target, int[] nums) {
        if (low == high) {
            if (nums[low] != target) {
                return -1;
            } else {
                return low;
            }
        }
        if (low == high - 1) {
            if (nums[low] != target && nums[high] != target) {
                return -1;
            }
            if (nums[low] == target) {
                return low;
            }
            if (nums[high] == target) {
                return high;
            }
        }


        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else {
            //use while loop to skip duplicates.
            if (nums[low] < target && target < nums[mid]) {
                int j = 1;
                while (mid - j > low && nums[mid] == nums[mid - j]) {
                    j++;
                }
                return search(low, mid - j, target, nums);
            } else if (nums[mid] < target && target < nums[high]) {
                int i = 1;
                while (mid + i < high && nums[mid] == nums[mid + i]) {
                    i++;
                }
                return search(mid + i, high, target, nums);
            } else {
                int j = 1;
                while (mid - j > low && nums[mid] == nums[mid - j]) {
                    j++;
                }
                int a = search(low, mid - j, target, nums);
                if (a == -1) {
                    int i = 1;
                    while (mid + i < high && nums[mid] == nums[mid + i]) {
                        i++;
                    }
                    return search(mid + i, high, target, nums);
                } else {
                    return a;
                }
            }
        }
    }
}
