package com.example.pack51to100;

import com.example.pack1to50.NextPermutation;

/**
 * Created by majie on 15/12/28.
 */
public class PermutationSequence {
    //FIXME LTE
    public static String getPermutation(int n, int k) {
        if (n == 0) {
            return "";
        }
        int[] nums = new int[n];
        int m = n;
        while (n > 0) {
            nums[n - 1] = n;
            n--;
        }
//        final int[] orignal = Arrays.copyOf(nums, nums.length);
        int mod = getFactorial(m);
        int count = 1;
        k = k % mod;
        if (k == 1) {
            return convert(nums);
        } else if (k == 0) {
            k = mod;
        }
        while (count < k) {
            NextPermutation.nextPermutation(nums);
//            if (Arrays.equals(nums, orignal)) {
//                int mod = k % count;
//                k = mod;
//                count = 1;
//            } else {
            count++;
//            }
        }
        return convert(nums);
    }

    private static int getFactorial(int n) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else
            return n * getFactorial(n - 1);
    }

    private static String convert(int[] nums) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            buffer.append(nums[i]);
        }
        return buffer.toString();
    }
}
