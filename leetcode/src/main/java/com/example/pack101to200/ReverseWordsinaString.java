package com.example.pack101to200;

import java.util.ArrayList;

/**
 * Created by majie on 16/2/26.
 */
public class ReverseWordsinaString {
    public static String reverseWords(String s) {
        ArrayList<String> words = getWords(s.trim());
        StringBuffer buffer = new StringBuffer();
        for (int i = words.size() - 1; i > -1; i--) {
            buffer.append(words.get(i) + " ");
        }
        return buffer.toString().trim();
    }

    private static ArrayList<String> getWords(String s) {
        ArrayList<String> list = new ArrayList<String>();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                list.add(s.substring(l, i + 1));
                break;
            }
            if (l == -1 && s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                l = i+1;
            }
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
                list.add(s.substring(l, i + 1));
                l = -1;

            }
        }
        return list;
    }
}
