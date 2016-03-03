package com.example.pack51to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/3/2.
 */
public class TextJustification {
    /**
     * Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.
     * <p>
     * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters.
     * <p>
     * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
     * <p>
     * For the last line of text, it should be left justified and no extra space is inserted between words.
     * <p>
     * For example,
     * words: ["This", "is", "an", "example", "of", "text", "justification."]
     * L: 16.
     * <p>
     * Return the formatted lines as:
     * [
     * "This    is    an",
     * "example  of text",
     * "justification.  "
     * ]
     * Note: Each word is guaranteed not to exceed L in length.
     *
     * @param words
     * @param maxWidth
     * @return
     */
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<String>();

        int length = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (length + words[i].length() > maxWidth) {
                addString(words, index, i, maxWidth, result, false);
                index = i;
                length = 0;
                i--;
            } else {
                length = length + words[i].length() + 1;
            }
        }
        addString(words, index, words.length, maxWidth, result, true);

        return result;
    }

    private static void addString(String[] words, int start, int end, int maxWidth, List<String> result, boolean lastLine) {
        StringBuffer buffer = new StringBuffer();
        for (int i = start; i < end; i++) {
            buffer.append(words[i]).append(" ");
        }
        if (buffer.length() == 0) {
            return;
        }
        //remove the end " "
        buffer.delete(buffer.length() - 1, buffer.length());

        //how many "  " can be.
        //= words.size()-1;
        int colums = end - start - 1;
        int size = buffer.length();

        if (colums == 0 || lastLine) {
            //add " " in the end
            addSpaces(buffer, size, maxWidth - size);
        } else {
            //add " " in the middle
            int spaces = maxWidth - size;
            int avg = spaces / colums;
            int left = spaces % colums;
            for (int i = 0; i < maxWidth; i++) {
                if (i > buffer.length() - 2) {
                    break;
                }
                if (buffer.charAt(i) != ' ' && buffer.charAt(i + 1) == ' ') {
                    if (left > 0) {
                        left--;
                        addSpaces(buffer, i + 1, avg + 1);
                    } else {
                        addSpaces(buffer, i + 1, avg);
                    }
                }
            }
        }

        result.add(buffer.toString());
    }

    private static void addSpaces(StringBuffer buffer, int index, int nums) {
        for (int i = 0; i < nums; i++) {
            buffer.insert(index, " ");
        }
    }
}
