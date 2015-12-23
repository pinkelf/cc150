package com.example;

import com.example.pack21to40.*;
import com.example.pack1to20.*;

import java.util.Arrays;

public class LeetCode {
    public static void main(String... args) {
        //1 two sum
        System.out.println("1.two sum = " + Arrays.toString(TwoSum.twoSum(new int[]{1, 2, 4, 5, 10, 15}, 9)));

        //2 add two numbers
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        ListNode b = new ListNode(9);
        b.next = new ListNode(3);
        b.next.next = new ListNode(5);
        ListNode r2 = AddTwoNumbers.addTwoNumbers(a, b);
        System.out.print("2.add two numbers = ");
        while (r2 != null) {
            System.out.print(r2.val + "->");
            r2 = r2.next;
        }
        System.out.println("");

        //3 Longest Substring Without Repeating Characters
        System.out.println("3.Longest Substring Without Repeating Characters " + LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1
                ("abcdcd") + "," + LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2
                ("ababcde"));

        //4 Median of Two Sorted Arrays
        int[] a4 = {1, 1, 1, 3};
        int[] b4 = {1, 2, 3, 4};
        System.out.println("4.median of two sorted arrays = " + MedianOfTwoSortedArrays.findMedianSortedArrays(a4, b4));

        //5 longest palindromic substring
        System.out.println("5.longest palindromic substring = " + LongestPalindromicSubstring.longestPalindrome("abcedfghjhg1ab"));

        //6 ZigZag Conversion
        System.out.println("6.zigzag conversion = " + ZigZagConversion.convert("abcdefghijklmnopq", 4));

        //7 Reverse Integer
        System.out.println("7.reverse integer = " + ReverseInteger.reverse(123456));

        //8 String to Integer(atoi)
        System.out.println("8.atoi = " + StringToInteger.myAtoi("105225"));

        //9 Palindrome Number
        System.out.println("9.palindrome number = " + PalindromeNumber.isPalindrome(124565421));

        //10 Regular Expression Matching

        //11 Container With Most Water
        System.out.println("11.Container With Most Water = " + ContainerWithMostWater.maxArea(new int[]{1, 4, 10, 20, 4, 8, 9}));

        //12 Integer to Roman
        System.out.println("12. integer to roman = " + IntegerToRoman.intToRoman(123));

        //13 Roman to Integer
        System.out.println("13. roman to integer  = " + RomanToInteger.romanToInt("XVI"));

        //14 Longest Common Prefix
        System.out.println("14. longest common prefix = " + LongestCommonPrefix.longestCommonPrefix(new String[]{"abcd", "abc", "abde"}));

        //15 3Sum
        System.out.println("15. 3sum = " + ThreeSum.threeSum(new int[]{-5, -2, 0, 9, 10, 3, 4, -1,}));

        //16 3Sum Closest
        System.out.println("16. 3sum closest = " + ThreeSumClosest.threeSumClosest(new int[]{-1, -5, 7, 9, 10, 28}, 5));

        //17 Letter Combinations of a Phone Number
        System.out.println("17. Letter Combinations of a Phone Number = " + LetterCombinationsOfAPhoneNumber.letterCombinations("12345"));

        //18 4Sum
        System.out.println("18. 4Sum = " + FourSum.fourSum(new int[]{-1, -5, 7, 9, 10, 28, 4, 3, 2, 9, -15, -10}, 5));

        //19 Remove Nth Node From End of List
        System.out.println("19. Remove Nth Node From End of List");

        //20 Valid Parentheses
        System.out.println("20. Valid Parentheses = " + ValidParenthese.isValid("(){[]}"));

        //21 merge two sort arrays
        System.out.println("21. Merge two sorted Lists ");

        //22 Generate Parentheses
        System.out.println("22. Generate Parentheses " + GenerateParentheses.generateParenthesis(3));

        //23 merge k sort arrays
        System.out.println("23. Merge K sorted Lists ");

        //24 Swap Node in Pairs
        System.out.println("24. Swap Node in Pairs ");

        //25 Reverse Nodes in k-Group
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a5 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a5;
        System.out.println("25. Reverse Nodes in k-Group " + ReverseNodesInKGroup.reverseKGroup(a1, 2));

        //26 Remove Duplicates from Sorted Array
        System.out.println("26. Remove Duplicates from Sorted Array " + RemoveDuplicatesfromSortedArray.removeDuplicates(new int[]{1, 1, 1, 2, 2, 5, 5, 19, 20}));

        //27 Remove Element
        System.out.println("27. Remove Element " + RemoveElement.removeElement(new int[]{1, 2, 3}, 2));

        //28 Implement strStr()
        System.out.println("28. Implement strStr " + ImplementstrStr.strStr("abcdefg", "bcd"));

        //29

        //30

        //31 Next Permutation
        NextPermutation.nextPermutation(new int[]{1, 2, 3, 5, 4});
        System.out.println("31. Next Permutation");

        //32 Longest Valid Parentheses
//        System.out.println("32 Longest Valid Prenthese " + LongestValidParentheses.longestValidParentheses("(()(((()"));

        //33 Search in Rotated Sorted Array
        System.out.println("33. Search in Rotated Sorted Array " + SearchInARotateArray.search(new int[]{284, 287, 289, 293, 295, 298, 0, 3, 8, 9, 10, 11, 12, 15, 17, 19, 20, 22, 26, 29, 30, 31, 35, 36, 37, 38, 42, 43, 45, 50, 51, 54, 56, 58, 59, 60, 62, 63, 68, 70, 73, 74, 81, 83, 84, 87, 92, 95, 99, 101, 102, 105, 108, 109, 112, 114, 115, 116, 122, 125, 126, 127, 129, 132, 134, 136, 137, 138, 139, 147, 149, 152, 153, 154, 155, 159, 160, 161, 163, 164, 165, 166, 168, 169, 171, 172, 174, 176, 177, 180, 187, 188, 190, 191, 192, 198, 200, 203, 204, 206, 207, 209, 210, 212, 214, 216, 221, 224, 227, 228, 229, 230, 233, 235, 237, 241, 242, 243, 244, 246, 248, 252, 253, 255, 257, 259, 260, 261, 262, 265, 266, 268, 269, 270, 271, 272, 273, 277, 279, 281}, 235));

        //34 Search for a range
        System.out.println("34. search for a range " + SearchForARange.searchRange(new int[]{1, 2, 3, 4, 5, 5, 5, 8, 9}, 5));

        //35 SearchInsertPosition
        System.out.println("35. seach insert position " + SearchInsertPosition.searchInsert(new int[]{1, 2, 5, 8, 10}, 6));

        //36 ValidSudou
        System.out.println("36. valid sudou");


    }
}
