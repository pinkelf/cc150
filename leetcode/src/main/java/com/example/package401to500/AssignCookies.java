package com.example.package401to500;

import java.util.Arrays;

/**
 * Created by majie on 16/11/25.
 */

public class AssignCookies {

    /**
     * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
     * Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with; and each cookie j has a size sj.
     * If sj >= gi, we can assign the cookie j to the child i, and the child i will be content.
     * Your goal is to maximize the number of your content children and output the maximum number.
     *
     * @param g
     * @param s
     * @return
     */
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int content = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                i++;
                j++;
                content++;
            } else {
                j++;
            }
        }

        return content;
    }
}
