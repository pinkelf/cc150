package com.example.pack101to150;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/4/16.
 */
public class LongestConsecutiveSequence {
    /**
     * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
     * <p/>
     * For example,
     * Given [100, 4, 200, 1, 3, 2],
     * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
     * <p/>
     * Your algorithm should run in O(n) complexity.
     *
     * @param nums
     * @return
     */
    public static int longestConsecutive(int[] nums) {
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.get(a) == null) {
                int left = map.get(a - 1) == null ? 0 : map.get(a - 1);
                int right = map.get(a + 1) == null ? 0 : map.get(a + 1);

                int sum = left + right + 1;
                map.put(a, sum);

                map.put(a - left, sum);
                map.put(a + right, sum);

                max = Math.max(sum, max);
            }
        }

        return max;
    }
}
