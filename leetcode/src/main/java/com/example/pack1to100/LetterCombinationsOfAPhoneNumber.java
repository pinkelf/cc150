package com.example.pack1to100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by majie on 15/12/16.
 */
public class LetterCombinationsOfAPhoneNumber {
    /**
     * Given a digit string, return all possible letter combinations that the number could represent.
     * <p>
     * A mapping of digit to letters (just like on the telephone buttons) is given below.
     * <p>
     * Input:Digit string "23"
     * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
     */

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        }

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("0", " ");
        map.put("1", "");
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        List<String> list = new ArrayList<String>();
        list.add("");
        for (int i = 0; i < digits.length(); i++) {
            list = getList(digits.charAt(i), map, list);
        }

        return list;

    }

    private static List<String> getList(char c, HashMap<String, String> map, List<String> list) {
        ArrayList<String> strings = new ArrayList<String>();
        String value = map.get(String.valueOf(c));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < value.length(); j++) {
                strings.add(list.get(i) + "" + value.charAt(j));
            }
        }
        return strings;
    }
}
