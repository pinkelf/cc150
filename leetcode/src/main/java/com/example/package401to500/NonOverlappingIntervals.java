package com.example.package401to500;

import com.example.Interval;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by majie on 16/12/7.
 */

public class NonOverlappingIntervals {

    /**
     * Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
     * <p>
     * Note:
     * You may assume the interval's end point is always bigger than its start point.
     * Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
     * Example 1:
     * Input: [ [1,2], [2,3], [3,4], [1,3] ]
     * <p>
     * Output: 1
     * <p>
     * Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
     *
     * @param intervals
     * @return
     */
    public static int eraseOverlapIntervals(Interval[] intervals) {
        int count = 0;

        TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>();
        //remove duplicated start val.
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i].start;
            int end = intervals[i].end;
            if (treemap.containsKey(start)) {
                treemap.put(start, Math.min(end, treemap.get(start)));
                count++;
            } else {
                treemap.put(start, end);
            }
        }

        Interval mark = new Interval();
        for (Map.Entry entry : treemap.entrySet()) {
            int start = (Integer) entry.getKey();
            int end = (Integer) entry.getValue();
            if (mark.start == 0 && mark.end == 0) {
                mark = new Interval(start, end);
            } else {
                if (mark.end <= start) {
                    mark = new Interval(start, end);
                } else if (mark.end <= end) {
                    count++;
                } else if (mark.end > end) {
                    mark = new Interval(start, end);
                    count++;
                }
            }
        }

        return count;

    }
}
