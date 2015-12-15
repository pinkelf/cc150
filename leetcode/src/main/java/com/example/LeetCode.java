package com.example;

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

        //5 longest palindromic substring
        System.out.println("5.longest palindromic substring = " + LongestPalindromicSubstring.longestPalindrome("abcedfghjhg1ab"));

        //6 ZigZag Conversion
        System.out.println("6.zigzag conversion = " + ZigZagConversion.convert("abcdefghijklmnopq", 5));

        //7 Reverse Integer
        System.out.println("7 reverse integer = " + ReverseInteger.reverse(123456));

    }
}
