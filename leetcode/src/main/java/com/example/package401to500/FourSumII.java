package com.example.package401to500;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by majie on 16/11/30.
 */

public class FourSumII {
    /**
     * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.
     * <p>
     * To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500. All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.
     * <p>
     * Example:
     * <p>
     * Input:
     * A = [ 1, 2]
     * B = [-2,-1]
     * C = [-1, 2]
     * D = [ 0, 2]
     * <p>
     * Output:
     * 2
     *
     * @param A
     * @param B
     * @param C
     * @param D
     * @return
     */
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tmp = A[i] + B[j];
                if (!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                } else {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int tmp = -(C[i] + D[j]);
                if (map.containsKey(tmp)) {
                    count += map.get(tmp);
                }
            }
        }
        return count;
    }

    public static int fourSumCount2(int[] A, int[] B, int[] C, int[] D) {
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);

        int count = 0;
        for (int a = 0; a < A.length; a++) {
            for (int b = 0; b < B.length; b++) {
                int c = 0;
                int d = D.length - 1;
                while (c < C.length && d > -1) {
                    int tmp = A[a] + B[b] + C[c] + D[d];
                    if (tmp > 0) {
                        d--;
                    } else if (tmp < 0) {
                        c++;
                    } else {
                        //tmp == 0
                        int left = C[c];
                        int leftCount = 0;
                        while (left == C[c]) {
                            c++;
                            leftCount++;
                        }

                        int right = D[d];
                        int rightCount = 0;
                        while (right == D[d]) {
                            d--;
                            rightCount++;
                        }

                        count += leftCount * rightCount;
                    }
                }
            }
        }

        return count;
    }

}
