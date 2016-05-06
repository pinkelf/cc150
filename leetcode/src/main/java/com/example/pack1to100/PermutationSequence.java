package com.example.pack1to100;

/**
 * Created by majie on 15/12/28.
 */
public class PermutationSequence {
    /**
     * The set [1,2,3,…,n] contains a total of n! unique permutations.
     * <p/>
     * By listing and labeling all of the permutations in order,
     * We get the following sequence (ie, for n = 3):
     * <p/>
     * "123"
     * "132"
     * "213"
     * "231"
     * "312"
     * "321"
     * Given n and k, return the kth permutation sequence.
     *
     * @param n
     * @param k
     * @return
     */
    public static String getPermutation(int n, int k) {
        StringBuffer result = new StringBuffer();
        if (n == 0) {
            return result.toString();
        }
        StringBuffer mapping = new StringBuffer();
        for (int i = 1; i < n + 1; i++) {
            mapping.append("" + i);
        }

        getString(result, mapping, n - 1, k);
        return result.toString();
    }

    private static void getString(StringBuffer result, StringBuffer mapping, int n, int k) {
        if (n == 0 || k == 1) {
            result.append(mapping);
            return;
        }
        int steps = getFactorial(n);
        int index = (k - 1) / steps;
        result.append(mapping.charAt(index));
        mapping.deleteCharAt(index);
        int num = k % steps;
        if (num == 0) {
            num = steps;
        }
        getString(result, mapping, n - 1, num);
    }

    private static int getFactorial(int n) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        else
            return n * getFactorial(n - 1);
    }

    //another method, using next permutaion, but LTE
    public static String getPermutation2(int n, int k) {
        if (n == 0) {
            return "";
        }
        int[] nums = new int[n];
        int m = n;
        while (n > 0) {
            nums[n - 1] = n;
            n--;
        }
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
            count++;
        }
        return convert(nums);
    }


    private static String convert(int[] nums) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            buffer.append(nums[i]);
        }
        return buffer.toString();
    }
}
