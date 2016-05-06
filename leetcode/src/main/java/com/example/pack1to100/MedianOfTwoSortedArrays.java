package com.example.pack1to100;

/**
 * Created by majie on 15/12/15.
 */

public class MedianOfTwoSortedArrays {
    /**
     * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
     */

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;
        // deal with even & odd
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
    }

    private static double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
        //result judge
        if (aStart > A.length - 1) {
            return B[bStart + k - 1];
        }
        if (bStart > B.length - 1) {
            return A[aStart + k - 1];
        }
        if (k == 1) {
            return Math.min(A[aStart], B[bStart]);
        }


        //get the k/2 number from each array
        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if (aStart + k / 2 - 1 < A.length) {
            aMid = A[aStart + k / 2 - 1];
        }
        if (bStart + k / 2 - 1 < B.length) {
            bMid = B[bStart + k / 2 - 1];
        }

        if (aMid < bMid)
            //a<b means the kth number is in A[astart +k/2, .... , astart+k] & B[bstart, .... , bstart+k/2]
            return getkth(A, aStart + k / 2, B, bStart, k - k / 2);
        else
            return getkth(A, aStart, B, bStart + k / 2, k - k / 2);
    }

}
