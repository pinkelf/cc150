package com.example.pack51to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/1/13.
 */
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        return com(n, k, 0);
    }

    private static List<List<Integer>> com(int n, int k, int index) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k == 1) {
            for (int i = index; i < n; i++) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i + 1);
                result.add(list);
            }
            return result;
        }
        if (n - k == index) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < k; i++) {
                list.add(i + index + 1);
            }
            result.add(list);
            return result;
        }
        List<List<Integer>> result1 = com(n, k - 1, index + 1);
        for (int i = 0; i < result1.size(); i++) {
            result1.get(i).add(0, index + 1);
        }
        result.addAll(result1);
        result.addAll(com(n, k, index + 1));
        return result;
    }
}
