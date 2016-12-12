package com.example.pack201to300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by majie on 16/12/12.
 */

public class CourseSchedule {
    /**
     * There are a total of n courses you have to take, labeled from 0 to n - 1.
     * <p>
     * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
     * <p>
     * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
     * <p>
     * For example:
     * <p>
     * 2, [[1,0]]
     * There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
     * <p>
     * 2, [[1,0],[0,1]]
     *
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

        //record graph in a map & record nodes which indegree == 0
        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][1];
            int next = prerequisites[i][0];
            if (map.containsKey(course)) {
                map.get(course).add(next);
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(next);
                map.put(course, list);
            }
            indegree[next]++;
        }

        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        // loop indegree == 0,remove it.judge if there is something left.
        // if left, the graph has a circle.
        while (!queue.isEmpty()) {
            int course = queue.poll();
            ArrayList<Integer> list = map.get(course);
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    indegree[list.get(i)]--;
                    if (indegree[list.get(i)] == 0) {
                        queue.offer(list.get(i));
                    }
                }
            }
        }

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
