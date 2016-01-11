package com.example.pack51to100;

import com.example.Pos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by majie on 16/1/11.
 */
public class NQueens {

    /**
     * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
     * <p/>
     * <p/>
     * Given an integer n, return all distinct solutions to the n-queens puzzle.
     * <p/>
     * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
     * <p/>
     * For example,
     * There exist two distinct solutions to the 4-queens puzzle:
     * <p/>
     * [
     * [".Q..",  // Solution 1
     * "...Q",
     * "Q...",
     * "..Q."],
     * <p/>
     * ["..Q.",  // Solution 2
     * "Q...",
     * "...Q",
     * ".Q.."]
     * ]
     *
     * @param n
     * @return
     */
    //FIXME TLE
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        Stack<Pos> stack = new Stack<Pos>();
        ArrayList<Pos> resultList = new ArrayList<Pos>();
        for (int i = n; i > 0; i--) {
            stack.push(new com.example.Pos(0, i - 1));
        }

        while (!stack.isEmpty()) {
            com.example.Pos pos = stack.pop();
            if (resultList.isEmpty()) {
                resultList.add(pos);
            } else {
                //backtrace
                for (int i = resultList.size() - 1; i >= pos.x; i--) {
                    resultList.remove(i);
                }
                resultList.add(pos);
            }

            if (resultList.size() == n) {
                convertResult(resultList, result);
                if (stack.isEmpty()) {
                    return result;
                }
                pos = stack.pop();
                for (int i = resultList.size() - 1; i >= pos.x; i--) {
                    resultList.remove(i);
                }
                resultList.add(pos);
            }

            pushAvaToStack(resultList, pos.x + 1, n, stack);
        }
        return result;
    }

    private static void pushAvaToStack(ArrayList<Pos> resultList, int pos, int n, Stack stack) {
        ArrayList<Pos> result = new ArrayList<Pos>();
        boolean isConflict = false;
        //push available pos[] in next row to stack
        for (int i = 0; i < n; i++) {
            isConflict = false;
            com.example.Pos target = new com.example.Pos(pos, i);
            for (int j = 0; j < resultList.size(); j++) {
                if (isConflict(resultList.get(j), target)) {
                    isConflict = true;
                    break;
                }
            }
            if (!isConflict) {
                stack.push(target);
            }
        }
    }

    private static boolean isConflict(com.example.Pos pos, com.example.Pos target) {
        //check conflict pos
        if (target.x == pos.x || target.y == pos.y || target.x - pos.x == target.y - pos.y || target.x + target.y == pos.x + pos.y) {
            return true;
        }
        return false;
    }

    private static void convertResult(ArrayList<Pos> resultList, List<List<String>> result) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < resultList.size(); i++) {
            StringBuffer string = new StringBuffer();
            int x = resultList.get(i).x;
            int count = 0;
            while (count < result.size()) {
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
