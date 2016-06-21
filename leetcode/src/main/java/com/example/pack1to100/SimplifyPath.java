package com.example.pack1to100;

import java.util.Stack;

/**
 * Created by majie on 16/6/21.
 */
public class SimplifyPath {
    /**
     * Given an absolute path for a file (Unix-style), simplify it.
     * <p/>
     * For example,
     * path = "/home/", => "/home"
     * path = "/a/./b/../../c/", => "/c"
     *
     * @param path
     * @return
     */
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        for (String dir : path.split("/")) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!dir.equals(".") && !dir.equals("")) {
                stack.push(dir);
            }
        }

        String result = "";
        while (!stack.isEmpty()) {
            result = "/" + stack.pop() + result;
        }

        return result.equals("") ? "/" : result;
    }

}
