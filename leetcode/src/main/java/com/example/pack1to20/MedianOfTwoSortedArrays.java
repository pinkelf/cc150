package com.example.pack1to20;

/**
 * Created by majie on 15/12/15.
 */

public class MedianOfTwoSortedArrays {
    /**
     * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        if (length1 == 0 && length2 == 0) {
            return 0;
        } else if (length1 == 0) {
            if (length2 % 2 == 1) {
                return nums2[length2 / 2];
            } else {
                return ((double) nums2[length2 / 2] + nums2[length2 / 2 + 1]) / 2;
            }
        } else if (length2 == 0) {
            if (length1 % 2 == 1) {
                return nums1[length1 / 2];
            } else {
                return ((double) nums1[length1 / 2] + nums1[length1 / 2 + 1]) / 2;
            }
        }

        //findIndex the mid element.
        //%2 == 1
        //the mid have (m+n)/2 elements bigger and (m+n)/2 elements smaller, and index is (m+n)/2
        //%2 == 0
        //the mid have (m+n)/2 -1 elements bigger and (m+n)/2 -1 elements smaller and index is (m+n)/2 -1, (m+n)/2
        if ((length1 + length2) % 2 == 1) {
            return findIndex(nums1, 0, length1 - 1, nums2, 0, length2 - 1, (length1 + length2) / 2);
        } else {
            return (findIndex(nums1, 0, length1 - 1, nums2, 0, length2 - 1, (length1 + length2) / 2 - 1) + findIndex(nums1, 0, length1 - 1, nums2, 0, length2 - 1, (length1 + length2) / 2)) * 0.5;
        }


    }

    //TODO
    private static double findIndex(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int index) {
        return 0;
    }

}
