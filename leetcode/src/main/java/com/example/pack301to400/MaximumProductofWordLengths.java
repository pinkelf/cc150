package com.example.pack301to400;

/**
 * Created by majie on 16/12/2.
 */

public class MaximumProductofWordLengths {
    /**
     * Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
     * <p>
     * Example 1:
     * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
     * Return 16
     * The two words can be "abcw", "xtfn".
     *
     * @param words
     * @return
     */
    public static int maxProduct(String[] words) {
        int[] codes = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            codes[i] = encodes(words[i]);
        }

        int count = 0;
        for (int i = 0; i < codes.length; i++) {
            for (int j = i + 1; j < codes.length; j++) {
                if ((codes[i] & codes[j]) == 0) {
                    count = Math.max(count, words[i].length() * words[j].length());
                }
            }
        }

        return count;
    }

    private static int encodes(String str) {
        int code = 1;
        for (int i = 0; i < str.length(); i++) {
            code = code | (1 << (str.charAt(i) - 'a'));
        }
        return code;
    }
}
