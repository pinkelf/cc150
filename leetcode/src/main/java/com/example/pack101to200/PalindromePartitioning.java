package com.example.pack101to200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/6/17.
 */
public class PalindromePartitioning {

    /**
     * Given a string s, partition s such that every substring of the partition is a palindrome.
     * <p/>
     * Return all possible palindrome partitioning of s.
     * <p/>
     * For example, given s = "aab",
     * Return
     * <p/>
     * [
     * ["aa","b"],
     * ["a","a","b"]
     * ]
     *
     * @param s
     * @return
     */
    // standard dp soluton.
    // there is a tricky skill to avoid isPalindrome costs, by using another dp matrix.
    public static List<List<String>> partition(String s) {
        List<List<String>>[] dp = new ArrayList[s.length() + 1];

        //init dp[0]
        dp[0] = new ArrayList<List<String>>();
        dp[0].add(new ArrayList<String>());

        //count dp
        for (int i = 1; i < s.length() + 1; i++) {
            String str = s.substring(0, i);
            dp[i] = new ArrayList<List<String>>();
            for (int j = i - 1; j > -1; j--) {
                String sub = str.substring(j, i);
                if (isPalindrome(sub)) {
                    for (List<String> list : dp[j]) {
                        List<String> temp = new ArrayList<String>(list);
                        temp.add(sub);
                        dp[i].add(temp);
                    }
                }
            }
        }

        return dp[s.length()];
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
