package com.example;

import com.example.pack1to20.AddTwoNumbers;
import com.example.pack1to20.ContainerWithMostWater;
import com.example.pack1to20.IntegerToRoman;
import com.example.pack1to20.LongestCommonPrefix;
import com.example.pack1to20.LongestPalindromicSubstring;
import com.example.pack1to20.MedianOfTwoSortedArrays;
import com.example.pack1to20.PalindromeNumber;
import com.example.pack1to20.ReverseInteger;
import com.example.pack1to20.RomanToInteger;
import com.example.pack1to20.StringToInteger;
import com.example.pack1to20.ThreeSum;
import com.example.pack1to20.TwoSum;
import com.example.pack1to20.ZigZagConversion;

import java.util.Arrays;

public class LeetCode {
    public static void main(String... args) {
        //1 two sum
        System.out.println("1.two sum = " + Arrays.toString(TwoSum.twoSum(new int[]{1, 2, 4, 5, 10, 15}, 9)));

        //2 add two numbers
        AddTwoNumbers.ListNode a = new AddTwoNumbers.ListNode(1);
        a.next = new AddTwoNumbers.ListNode(2);
        a.next.next = new AddTwoNumbers.ListNode(3);
        AddTwoNumbers.ListNode b = new AddTwoNumbers.ListNode(9);
        b.next = new AddTwoNumbers.ListNode(3);
        b.next.next = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode r2 = AddTwoNumbers.addTwoNumbers(a, b);
        System.out.print("2.add two numbers = ");
        while (r2 != null) {
            System.out.print(r2.val + "->");
            r2 = r2.next;
        }
        System.out.println("");

        //3 Longest Substring Without Repeating Characters

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
    }
}
