package com.example.pack101to150;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/2/15.
 */
public class Triangle {
    /**
     * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
     * <p>
     * For example, given the following triangle
     * [
     * [2],
     * [3,4],
     * [6,5,7],
     * [4,1,8,3]
     * ]
     * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
     *
     * @param triangle
     * @return
     */
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) {
            return 0;
        }
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        //from bottom to top.
        //dp solution.
        paths.add(triangle.get(triangle.size() - 1));
        for (int i = triangle.size() - 2; i > -1; i--) {
            List<Integer> list = new ArrayList<Integer>();
            List<Integer> path = paths.get(0);
            for (int j = 0; j < path.size() - 1; j++) {
                list.add(triangle.get(i).get(j) + Math.min(path.get(j), path.get(j + 1)));
            }
            paths.add(0, list);
        }
        return paths.get(0).get(0);

    }
}
