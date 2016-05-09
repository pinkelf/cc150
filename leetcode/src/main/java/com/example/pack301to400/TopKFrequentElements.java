package com.example.pack301to400;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by majie on 16/5/9.
 */
public class TopKFrequentElements {

    public static class KeyPair {
        public int key;
        public int value;

        public KeyPair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * Given a non-empty array of integers, return the k most frequent elements.
     * <p/>
     * For example,
     * Given [1,1,1,2,2,3] and k = 2, return [1,2].
     * <p/>
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
     * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
     *
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if (value == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], value + 1);
            }
        }

        Comparator<KeyPair> order = new Comparator<KeyPair>() {
            public int compare(KeyPair o1, KeyPair o2) {
                int numbera = o1.value;
                int numberb = o2.value;
                if (numbera < numberb) {
                    return 1;
                } else if (numbera > numberb) {
                    return -1;
                } else {
                    return 0;
                }

            }
        };

        Queue<KeyPair> queue = new PriorityQueue<KeyPair>(k, order);
        for (Integer key : map.keySet()) {
            queue.offer(new KeyPair(key, map.get(key)));
        }

        for (int i = 0; i < k; i++) {
            list.add(queue.poll().key);
        }

        return list;
    }
}
