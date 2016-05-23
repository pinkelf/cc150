package com.example.pack201to300;

/**
 * Created by majie on 16/5/23.
 */
public class HIndex {
    public static int hIndex(int[] citations) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < citations.length; i++) {
            max = Math.max(max, citations[i]);
        }
        max = Math.min(max, citations.length);
        for (int i = max; i >= 0; i--) {
            if (isHIndex(citations, i)) {
                return i;
            }
        }
        return 0;
    }

    private static boolean isHIndex(int[] citations, int num) {
        int h = 0;
        int m = 0;
        int l = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > num) {
                h++;
            } else if (citations[i] < num) {
                l++;
            } else {
                m++;
            }
        }
        return num >= h && num <= h + m;
    }
}
