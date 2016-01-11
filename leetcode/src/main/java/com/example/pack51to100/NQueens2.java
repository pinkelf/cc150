package com.example.pack51to100;

import com.example.Pos;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by majie on 16/1/11.
 */
public class NQueens2 {

    /**
     * Follow up for N-Queens problem.
     * <p/>
     * Now, instead outputting board configurations, return the total number of distinct solutions.
     *
     * @param n
     * @return
     */
    public static int totalNQueens(int n) {
        int result = 0;
        Stack<Pos> stack = new Stack<Pos>();
        ArrayList<Pos> resultList = new ArrayList<Pos>();
        for (int i = n; i > 0; i--) {
            stack.push(new Pos(0, i - 1));
        }

        while (!stack.isEmpty()) {
            Pos pos = stack.pop();
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
                result++;
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
            Pos target = new Pos(pos, i);
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

    private static boolean isConflict(Pos pos, Pos target) {
        //check conflict pos
        if (target.x == pos.x || target.y == pos.y || target.x - pos.x == target.y - pos.y || target.x + target.y == pos.x + pos.y) {
            return true;
        }
        return false;
    }

}
