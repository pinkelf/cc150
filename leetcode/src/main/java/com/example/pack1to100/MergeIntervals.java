package com.example.pack1to100;

import com.example.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/1/4.
 */


public class MergeIntervals {

    /**
     * Given a collection of intervals, merge all overlapping intervals.
     * <p/>
     * For example,
     * Given [1,3],[2,6],[8,10],[15,18],
     * return [1,6],[8,10],[15,18].
     *
     * @param intervals
     * @return
     */
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        for (int i = 0; i < intervals.size(); i++) {
            merge(result, intervals.get(i));
        }
        return result;
    }

    private static void merge(List<Interval> result, Interval interval) {
        if (result.isEmpty()) {
            result.add(interval);
            return;
        }
        boolean isAdded = false;
        for (int i = 0; i < result.size(); i++) {
            Interval target = result.get(i);
            if (interval.start > target.end || interval.end < target.start) {
                continue;
            }
            if (interval.start <= target.start && interval.end >= target.end) {
                result.remove(target);
                i--;
                continue;
            }
            if (interval.start >= target.start && interval.end <= target.end) {
                return;
            }
            if (interval.start >= target.start && interval.end >= target.end) {
                isAdded = true;
                result.remove(target);
                i--;
                // result.add(new Interval(target.start, interval.end));
                interval = new Interval(target.start, interval.end);
                continue;
            }
            if (interval.start <= target.start && interval.end <= target.end) {
                isAdded = true;
                result.remove(target);
                i--;
                // result.add(new Interval(interval.start, target.end));
                interval = new Interval(interval.start, target.end);
                continue;
            }
        }
        result.add(interval);
    }

}
