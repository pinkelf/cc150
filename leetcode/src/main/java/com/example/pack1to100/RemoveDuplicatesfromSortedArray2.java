package com.example.pack1to100;

import java.util.Arrays;

/**
 * Created by majie on 16/1/12.
 */
public class RemoveDuplicatesfromSortedArray2 {

    /**
     * Follow up for "Remove Duplicates":
     * What if duplicates are allowed at most twice?
     * <p/>
     * For example,
     * Given sorted array nums = [1,1,1,2,2,3],
     * <p/>
     * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int mark = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (mark == nums[i]) {
                nums[i] = Integer.MAX_VALUE;
                count--;
            } else if (i > 0 && nums[i] == nums[i - 1]) {
                mark = nums[i];
            }
            count++;
        }

        Arrays.sort(nums);
        return count;
    }
}
