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
        int low = 0;
        int high = citations.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (citations[mid] >= citations.length - mid) {
                if (mid > 0 && citations[mid - 1] >= citations.length - mid + 1) {
                    high = mid;
                } else {
                    return citations.length - mid;
                }
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}
