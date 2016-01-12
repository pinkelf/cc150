package com.example.pack51to100;

import com.example.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by majie on 16/1/11.
 */
public class NQueens2 {

    /**
     * Follow up for N-Queens problem.
     * <p>
     * Now, instead outputting board configurations, return the total number of distinct solutions.
     *
     * @param n
     * @return
     */
    public static int totalNQueens(int n) {
        int result = 0;
        Stack<Point> stack = new Stack<Point>();
        int[] resultList = new int[n];
        Arrays.fill(resultList, -1);
        for (int i = n; i > 0; i--) {
            stack.push(new Point(0, i - 1));
        }

        while (!stack.isEmpty()) {
            Point point = stack.pop();
            if (resultList[0] == -1) {
                resultList[0] = point.y;
            } else {
                //backtrace
                for (int i = n - 1; i > point.x; i--) {
                    resultList[i] = -1;
                }
                resultList[point.x] = point.y;
            }

            if (resultList[n - 1] != -1) {
                result++;
                if (stack.isEmpty()) {
                    return result;
                }
                point = stack.pop();
                for (int i = n - 1; i > point.x; i--) {
                    resultList[i] = -1;
                }
                resultList[point.x] = point.y;
            }

            pushAvaToStack(resultList, point.x + 1, n, stack);
        }
        return result;
    }

    private static void pushAvaToStack(int[] resultList, int pos, int n, Stack stack) {
        if (resultList[0] == -1) {
            return;
        }
        ArrayList<Point> result = new ArrayList<Point>();
        boolean isConflict = false;
        //push available pos[] in next row to stack
        for (int i = 0; i < n; i++) {
            isConflict = false;
            Point target = new Point(pos, i);
            for (int j = 0; j < resultList.length; j++) {
                if (resultList[j] == -1) {
                    break;
                }
                if (isConflict(new Point(j, resultList[j]), target)) {
                    isConflict = true;
                    break;
                }
            }
            if (!isConflict) {
                stack.push(target);
            }
        }
    }

    private static boolean isConflict(Point point, Point target) {
        //check conflict pos
        if (target.x == point.x || target.y == point.y || target.x - point.x == target.y - point.y || target.x + target.y == point.x + point.y) {
            return true;
        }
        return false;
    }

}
