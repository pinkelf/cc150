package com.example.p501to600;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrickWall {
    public static int leastBricks(List<List<Integer>> wall) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < wall.size(); i++) {
            int sum = 0;
            for (int j = 0; j < wall.get(i).size()-1; j++) {
                sum += wall.get(i).get(j);
                list.add(sum);
            }
        }

        Collections.sort(list);

        int mark = 0;
        int count = 0;
        int max = 1;
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            if (mark != index) {
                mark = index;
                count = 1;
            } else {
                count++;
                max = Math.max(max, count);
            }
        }

        return wall.size() - max;
    }
}
