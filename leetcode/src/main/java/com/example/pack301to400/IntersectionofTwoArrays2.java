package com.example.pack301to400;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by majie on 16/5/23.
 */
public class IntersectionofTwoArrays2 {
    /**
     * Given two arrays, write a function to compute their intersection.
     * <p/>
     * Example:
     * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
     * <p/>
     * Note:
     * Each element in the result should appear as many times as it shows in both arrays.
     * The result can be in any order.
     * Follow up:
     * What if the given array is already sorted? How would you optimize your algorithm?
     * What if nums1's size is small compared to num2's size? Which algorithm is better?
     * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            Integer in = map.get(nums1[i]);
            if (in != null) {
                map.put(nums1[i], in + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            Integer in = map.get(nums2[i]);
            if (in != null && in > 0) {
                map.put(nums2[i], in - 1);
                list.add(nums2[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
