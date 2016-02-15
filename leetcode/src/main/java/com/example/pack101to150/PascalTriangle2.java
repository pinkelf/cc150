package com.example.pack101to150;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/2/15.
 */
public class PascalTriangle2 {

    /**
     * Given an index k, return the kth row of the Pascal's triangle.
     * <p>
     * For example, given k = 3,
     * Return [1,3,3,1].
     * <p>
     * Note:
     * Could you optimize your algorithm to use only O(k) extra space?
     *
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> upper = new ArrayList<Integer>();
        List<Integer> current = new ArrayList<Integer>();

        upper.add(1);
        for (int j = 0; j < rowIndex + 1; j++) {
            current.clear();
            for (int i = 0; i < j + 1; i++) {
                int left = i > 0 ? upper.get(i - 1) : 0;
                int right = i < upper.size() ? upper.get(i) : 0;
                current.add(left + right);
            }
            //copy the list
            upper = new ArrayList(current);
        }
        return upper;
    }
}
