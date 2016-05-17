package com.example.pack101to200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by majie on 16/5/13.
 */
public class WordBreak {

    /**
     * Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
     * <p/>
     * For example, given
     * s = "leetcode",
     * dict = ["leet", "code"].
     * <p/>
     * Return true because "leetcode" can be segmented as "leet code".
     *
     * @param s
     * @param wordDict
     * @return
     */
    public static boolean wordBreak(String s, Set<String> wordDict) {
        if (wordDict.contains(s)) {
            return true;
        }

        //record possible check point
        Set<Integer> index = new HashSet<Integer>();
        if (index.isEmpty()) {
            for (String str : wordDict) {
                index.add(str.length());
            }
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < s.length() + 1; i++) {
            for (Integer num : index) {
                int temp = i - num;
                if (temp > -1) {
                    //if sub string match && any check point is true, set true
                    if (wordDict.contains(s.substring(temp, i)) && dp[temp]) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[s.length()];
    }

    //recursion solution, TLE
    public static boolean wordBreak2(String s, Set<String> wordDict) {
        if (wordDict.contains(s)) {
            return true;
        }
        for (int i = 0; i < s.length(); i--) {
            String head = s.substring(0, i + 1);
            if (wordDict.contains(head)) {
                if (wordBreak2(s.substring(i + 1), wordDict)) {
                    return true;
                }
            }
        }
        return false;
    }
}
