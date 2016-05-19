package com.example.pack201to300;

import java.util.PriorityQueue;

/**
 * Created by majie on 16/5/19.
 */
public class KthLargestElementInAnArray {
    /**
     * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
     * <p/>
     * For example,
     * Given [3,2,1,5,6,4] and k = 2, return 5.
     * <p/>
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ array's length.
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > queue.peek()) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }
        return queue.peek();
    }
}
