package com.example.pack201to300;

/**
 * Created by majie on 16/5/23.
 */
public class HIndex2 {
    /**
     * Follow up for H-Index: What if the citations array is sorted in ascending order? Could you optimize your algorithm?
     *
     * @param citations
     * @return
     */
    public static int hIndex(int[] citations) {
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                return citations.length - i;
            }
        }
        return 0;
    }
}
