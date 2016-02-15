package com.example.pack101to150;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/2/15.
 */
public class PascalTriangle {

    /**
     * Given numRows, generate the first numRows of Pascal's triangle.
     * <p>
     * For example, given numRows = 5,
     * Return
     * <p>
     * [
     * [1],
     * [1,1],
     * [1,2,1],
     * [1,3,3,1],
     * [1,4,6,4,1]
     * ]
     *
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        result.add(list);

        for (int i = 1; i < numRows; i++) {
            List<Integer> newlist = new ArrayList<Integer>();
            List<Integer> upper = result.get(i - 1);
            for (int j = 0; j < i + 1; j++) {
                int left = j > 0 ? upper.get(j - 1) : 0;
                int right = j < upper.size() ? upper.get(j) : 0;
                newlist.add(left + right);
            }
            result.add(newlist);
        }

        return result;
    }
}
