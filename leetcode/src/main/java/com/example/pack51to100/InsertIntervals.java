package com.example.pack51to100;

import com.example.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/1/5.
 */
public class InsertIntervals {
    /**
     * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
     * <p/>
     * You may assume that the intervals were initially sorted according to their start times.
     * <p/>
     * Example 1:
     * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
     * <p/>
     * Example 2:
     * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
     * <p/>
     * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
     *
     * @param intervals
     * @param newInterval
     * @return
     */

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> result = new ArrayList<Interval>();

        if (intervals.isEmpty()) {
            result.add(newInterval);
            return result;
        }

        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i++));
        }
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval = new Interval( // we could mutate newInterval here also
                    Math.min(newInterval.start, intervals.get(i).start),
                    Math.max(newInterval.end, intervals.get(i).end));
            i++;
        }
        result.add(newInterval); // add the union of intervals we got
        // add all the rest
        while (i < intervals.size()) {
            result.add(intervals.get(i++));
        }
        return result;
    }
}
