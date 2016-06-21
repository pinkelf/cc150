package com.example.pack201to300;

import java.util.ArrayList;

/**
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.
 * <p/>
 * Examples:
 * [2,3,4] , the median is 3
 * <p/>
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * <p/>
 * Design a data structure that supports the following two operations:
 * <p/>
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 * For example:
 * <p/>
 * add(1)
 * add(2)
 * findMedian() -> 1.5
 * add(3)
 * findMedian() -> 2
 * Created by majie on 16/6/21.
 */
public class MedianFinder {
    private ArrayList<Integer> list = new ArrayList<Integer>();

    // Adds a number into the data structure.
    public void addNum(int num) {
        if (list.isEmpty()) {
            list.add(num);
        } else if (list.get(0) >= num) {
            list.add(0, num);
        } else if (list.get(list.size() - 1) <= num) {
            list.add(num);
        } else {
            //use binary search to locate the insert index
            int low = 0;
            int high = list.size() - 1;
            while (low <= high) {
                if (high - low == 1) {
                    if (list.get(low) > num) {
                        list.add(low, num);
                    } else if (list.get(high) < num) {
                        list.add(high + 1, num);
                    } else {
                        list.add(high, num);
                    }
                    break;
                }
                int mid = (low + high) / 2;
                if (list.get(mid) > num) {
                    high = mid;
                } else if (list.get(mid) < num) {
                    low = mid;
                } else {
                    list.add(mid, num);
                    break;
                }
            }
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        int size = list.size();
        if (size % 2 == 1) {
            return list.get(size / 2);
        } else {
            return ((double) (list.get(size / 2) + list.get(size / 2 - 1))) / 2.0;
        }
    }

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();
}
