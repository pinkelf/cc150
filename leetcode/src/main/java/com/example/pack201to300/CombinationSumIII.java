package com.example.pack201to300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/5/23.
 */
public class CombinationSumIII {

    /**
     * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
     * <p/>
     * Ensure that numbers within the set are sorted in ascending order.
     * <p/>
     * <p/>
     * Example 1:
     * <p/>
     * Input: k = 3, n = 7
     * <p/>
     * Output:
     * <p/>
     * [[1,2,4]]
     * <p/>
     * Example 2:
     * <p/>
     * Input: k = 3, n = 9
     * <p/>
     * Output:
     * <p/>
     * [[1,2,6], [1,3,5], [2,3,4]]
     *
     * @param k
     * @param n
     * @return
     */
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k > 9 || k < 0 || n > 55) {
            return result;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        combine(k, n, 1, list, result);

        return result;
    }

    private static void combine(int k, int n, int index, List<Integer> list, List<List<Integer>> result) {
        if (n == 0  && k == 0) {
            result.add(new ArrayList(list));
            return;
        }
        if (index > n || k > n || k < 0 || n < 0) {
            return;
        }
        for (int i = index; i < 10; i++) {
            if(i > n){
                break;
            }
            list.add(i);
            combine(k - 1, n - i, i + 1, list, result);
            list.remove(list.size()-1);
        }
    }
}
