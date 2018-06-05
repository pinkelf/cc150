package com.example.p701to800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition763 {
    public static List<Integer> partitionLabels(String S) {
        int[] upper = new int[26];
        int[] lower = new int[26];
        Arrays.fill(upper, -1);
        Arrays.fill(lower, -1);
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a';
            if (upper[index] == -1) {
                upper[index] = i;
                lower[index] = i;
            } else {
                lower[index] = i;
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        int result = 0;
        int start = 0;
        while (result < S.length()) {
            result = check(start, upper, lower);
            list.add(result-start);
            start = result;
        }

        return list;
    }

    public static int check(int index, int[] upper, int[] lower) {
        boolean fill = false;
        int res = -1;
        int start = index;
        int end = -1;
        for (int i = 0; i < 26; i++) {
            if (upper[i] == start) {
                end = lower[i];
            }
        }
        while (!fill) {
            for (int i = 0; i < 26; i++) {
                if (upper[i] > start && upper[i] < end) {
                    if (lower[i] > end) {
                        end = lower[i];
                        break;
                    }
                }
            }
            fill = true;
        }
        return end + 1;
    }
}
