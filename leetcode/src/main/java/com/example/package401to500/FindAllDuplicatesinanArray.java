package com.example.package401to500;

import java.util.LinkedList;
import java.util.List;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 * Created by majie on 17/1/24.
 */

public class FindAllDuplicatesinanArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                list.add(index + 1);
            }
        }

        return list;
    }
}
