package com.example.pack51to100;


import com.example.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by majie on 16/1/11.
 */
public class NQueens {

    /**
     * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
     * <p>
     * <p>
     * Given an integer n, return all distinct solutions to the n-queens puzzle.
     * <p>
     * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
     * <p>
     * For example,
     * There exist two distinct solutions to the 4-queens puzzle:
     * <p>
     * [
     * [".Q..",  // Solution 1
     * "...Q",
     * "Q...",
     * "..Q."],
     * <p>
     * ["..Q.",  // Solution 2
     * "Q...",
     * "...Q",
     * ".Q.."]
     * ]
     *
     * @param n
     * @return
     */
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        Stack<Point> stack = new Stack<Point>();
        int[] resultList = new int[n];
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
                convertResult(resultList, result);
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

    private static void convertResult(int[] resultList, List<List<String>> result) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < resultList.length; i++) {
            StringBuffer string = new StringBuffer();
            int x = resultList[i];
            int count = 0;
            while (count < resultList.length) {
                if (count == x) {
                    string.append('Q');
                } else {
                    string.append(".");
                }
                count++;
            }
            list.add(string.toString());
        }
        result.add(list);
    }
}
