package com.example;

import com.example.pack1to50.*;
import com.example.pack51to100.*;
import com.example.pack101to150.*;
import com.example.pack151to200.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode {
    public static void main(String... args) {
        //1 two sum
        System.out.println("1.two sum = " + Arrays.toString(com.example.pack1to50.TwoSum.twoSum(new int[]{1, 2, 4, 5, 10, 15}, 9)));

        //2 add two numbers
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        ListNode b = new ListNode(9);
        b.next = new ListNode(3);
        b.next.next = new ListNode(5);
        ListNode r2 = com.example.pack1to50.AddTwoNumbers.addTwoNumbers(a, b);
        System.out.print("2.add two numbers = ");
        while (r2 != null) {
            System.out.print(r2.val + "->");
            r2 = r2.next;
        }
        System.out.println("");

        //3 Longest Substring Without Repeating Characters
        System.out.println("3.Longest Substring Without Repeating Characters " + com.example.pack1to50.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1
                ("abcdcd") + "," + com.example.pack1to50.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2
                ("ababcde"));

        //4 Median of Two Sorted Arrays
        int[] a4 = {1, 1, 1, 3};
        int[] b4 = {1, 2, 3, 4};
        System.out.println("4.median of two sorted arrays = " + com.example.pack1to50.MedianOfTwoSortedArrays.findMedianSortedArrays(a4, b4));

        //5 longest palindromic substring
        System.out.println("5.longest palindromic substring = " + com.example.pack1to50.LongestPalindromicSubstring.longestPalindrome("abcedfghjhg1ab"));

        //6 ZigZag Conversion
        System.out.println("6.zigzag conversion = " + com.example.pack1to50.ZigZagConversion.convert("abcdefghijklmnopq", 4));

        //7 Reverse Integer
        System.out.println("7.reverse integer = " + com.example.pack1to50.ReverseInteger.reverse(123456));

        //8 String to Integer(atoi)
        System.out.println("8.atoi = " + com.example.pack1to50.StringToInteger.myAtoi("105225"));

        //9 Palindrome Number
        System.out.println("9.palindrome number = " + com.example.pack1to50.PalindromeNumber.isPalindrome(124565421));

        //10 Regular Expression Matching

        //11 Container With Most Water
        System.out.println("11.Container With Most Water = " + com.example.pack1to50.ContainerWithMostWater.maxArea(new int[]{1, 4, 10, 20, 4, 8, 9}));

        //12 Integer to Roman
        System.out.println("12. integer to roman = " + com.example.pack1to50.IntegerToRoman.intToRoman(123));

        //13 Roman to Integer
        System.out.println("13. roman to integer  = " + com.example.pack1to50.RomanToInteger.romanToInt("XVI"));

        //14 Longest Common Prefix
        System.out.println("14. longest common prefix = " + com.example.pack1to50.LongestCommonPrefix.longestCommonPrefix(new String[]{"abcd", "abc", "abde"}));

        //15 3Sum
        System.out.println("15. 3sum = " + com.example.pack1to50.ThreeSum.threeSum(new int[]{-5, -2, 0, 9, 10, 3, 4, -1,}));

        //16 3Sum Closest
        System.out.println("16. 3sum closest = " + com.example.pack1to50.ThreeSumClosest.threeSumClosest(new int[]{-1, -5, 7, 9, 10, 28}, 5));

        //17 Letter Combinations of a Phone Number
        System.out.println("17. Letter Combinations of a Phone Number = " + com.example.pack1to50.LetterCombinationsOfAPhoneNumber.letterCombinations("12345"));

        //18 4Sum
        System.out.println("18. 4Sum = " + com.example.pack1to50.FourSum.fourSum(new int[]{-1, -5, 7, 9, 10, 28, 4, 3, 2, 9, -15, -10}, 5));

        //19 Remove Nth Node From End of List
        System.out.println("19. Remove Nth Node From End of List");

        //20 Valid Parentheses
        System.out.println("20. Valid Parentheses = " + com.example.pack1to50.ValidParenthese.isValid("(){[]}"));

        //21 merge two sort arrays
        System.out.println("21. Merge two sorted Lists ");

        //22 Generate Parentheses
        System.out.println("22. Generate Parentheses " + com.example.pack1to50.GenerateParentheses.generateParenthesis(3));

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
        System.out.println("25. Reverse Nodes in k-Group " + com.example.pack1to50.ReverseNodesInKGroup.reverseKGroup(a1, 2));

        //26 Remove Duplicates from Sorted Array
        System.out.println("26. Remove Duplicates from Sorted Array " + com.example.pack1to50.RemoveDuplicatesfromSortedArray.removeDuplicates(new int[]{1, 1, 1, 2, 2, 5, 5, 19, 20}));

        //27 Remove Element
        System.out.println("27. Remove Element " + com.example.pack1to50.RemoveElement.removeElement(new int[]{1, 2, 3}, 2));

        //28 Implement strStr()
        System.out.println("28. Implement strStr " + com.example.pack1to50.ImplementstrStr.strStr("abcdefg", "bcd"));

        //31 Next Permutation
        com.example.pack1to50.NextPermutation.nextPermutation(new int[]{1, 2, 3, 5, 4});
        System.out.println("31. Next Permutation");

        //32 longest
        System.out.println("32 " + Longest.longestValidParentheses("(()()"));

        //33 Search in Rotated Sorted Array
        System.out.println("33. Search in Rotated Sorted Array " + com.example.pack1to50.SearchInARotateArray.search(new int[]{284, 287, 289, 293, 295, 298, 0, 3, 8, 9, 10, 11, 12, 15, 17, 19, 20, 22, 26, 29, 30, 31, 35, 36, 37, 38, 42, 43, 45, 50, 51, 54, 56, 58, 59, 60, 62, 63, 68, 70, 73, 74, 81, 83, 84, 87, 92, 95, 99, 101, 102, 105, 108, 109, 112, 114, 115, 116, 122, 125, 126, 127, 129, 132, 134, 136, 137, 138, 139, 147, 149, 152, 153, 154, 155, 159, 160, 161, 163, 164, 165, 166, 168, 169, 171, 172, 174, 176, 177, 180, 187, 188, 190, 191, 192, 198, 200, 203, 204, 206, 207, 209, 210, 212, 214, 216, 221, 224, 227, 228, 229, 230, 233, 235, 237, 241, 242, 243, 244, 246, 248, 252, 253, 255, 257, 259, 260, 261, 262, 265, 266, 268, 269, 270, 271, 272, 273, 277, 279, 281}, 235));

        //34 Search for a range
        System.out.println("34. search for a range " + SearchForARange.searchRange(new int[]{1, 2, 3, 4, 5, 5, 5, 8, 9}, 5));

        //35 SearchInsertPosition
        System.out.println("35. seach insert position " + SearchInsertPosition.searchInsert(new int[]{1, 2, 5, 8, 10}, 6));

        //36 ValidSudou
        System.out.println("36. valid sudou");


        //39 Combination Sum
        System.out.println("39 Combination Sum " + CombinationSum.combinationSum(new int[]{2, 3, 5, 7}, 11));

        //40 Combination Sum2
        System.out.println("40 Combination Sum2 " + CombinationSum2.combinationSum2(new int[]{2, 5, 4, 9, 1, 7, 6}, 11));

        //41 First Missing Positive
        System.out.println("41. First Missing Positive " + FirstMissingPositive.firstMissingPositive(new int[]{1, 2, 3, 8, 9, 10, 5, 7, 4}));

        //42 Trapping rain water
        System.out.println("42. Trapping rain water " + TrappingRainWater.trap(new int[]{2, 1, 3, 1, 4}));


        //45 Jump Game2
        System.out.println("45 Jump Game 2 " + JumpGame2.jump(new int[]{2, 3, 1, 1, 2, 5, 1, 2, 3}));

        //46 Permutations
        System.out.println("46. Permutations " + Permutations.permute(new int[]{1, 2, 3}));

        //47 Permutations 2
        System.out.println("47. Permutations 2 " + Permutations2.permuteUnique(new int[]{1, 2, 1}));

        //48 Rotate Image
        System.out.println("48. Rotate Image ");
        RotateImage.rotate(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});

        //49 GroupAnagrams
        System.out.println("49 GroupAnagrams " + GroupAnagrams.groupAnagrams(new String[]{"abc", "bca", "ade", "abdcde"}));

        //50 Pow(x,n)
        System.out.println("50 Pow(x,n) " + Pow.myPow(23.4, 3));

        //51 N-Queens
        System.out.println("51 N-Queens " + NQueens.solveNQueens2(4).toString());

        //52 N-Queens2
        System.out.println("52 N-Queens 2 " + NQueens2.totalNQueens(8));

        //53 MaximumSubarray
        System.out.println("53 Maximum Subarray " + MaximumSubarray.maxSubArray(new int[]{1, 2, -4, 1, 2, -1, 3}));

        //54 Spiral Matrix
        System.out.println("54 Spiral Matrix " + SpiralMatrix.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));

        //55 Jump Game
        System.out.println("55 Jump Game " + JumpGame.canJump(new int[]{3, 2, 1, 0, 4}));

        //56 Merge Intervals
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(2, 3));
        list.add(new Interval(4, 6));
        list.add(new Interval(7, 8));
        list.add(new Interval(1, 10));
        System.out.println("56 Merge Intervals " + MergeIntervals.merge(list).toString());

        //57 Insert Intervals
        List<Interval> list2 = new ArrayList<>();
        list2.add(new Interval(-1, 3));
        list2.add(new Interval(6, 7));
        System.out.println("57 Insert Intervals " + InsertIntervals.insert(list2, new Interval(4, 5)).toString());

        //58 Length of Last Word
        System.out.println("58 Length of Last Word " + LengthOfLastWord.lengthOfLastWord("hello world"));

        //59 Spiral Matrix
        System.out.println("59 Spiral Matrix 2");
        SpiralMatrix2.generateMatrix(3);

        //60 PermutationSequence
        System.out.println("60. PermutationSequence " + PermutationSequence.getPermutation2(3, 5));

        //61 RotateList
        System.out.println("61 Rotate List " + RotateList.rotateRight(a1, 3));

        //62 Unique Paths
        System.out.println("62 Unique Paths " + UniquePath.uniquePaths(5, 6));

        //63 Unique Paths 2
        System.out.println("63 Unique Paths 2 " + UniquePath2.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));

        //64 Minimum Path Sum
        System.out.println("64 Minimum Path Sum " + MinimumPathSum.minPathSum(new int[][]{{1, 2, 3}, {1, 2, 1}, {2, 1, 3}}));

        //66 Plus One
        System.out.println("66 Plus One " + PlusOne.plusOne(new int[]{1, 1, 0, 1}));

        //67 Add Binary
        System.out.println("67 Add Binary " + AddBinary.addBinary("111", "101"));

        //70 Climbing Stairs
        System.out.println("70 Climbing Stairs " + ClimbingStairs.climbStairs(9));

        //73 Set Matrix Zeroes
        System.out.println("73 Set Matrix Zeroes ");
        SetMatrixZeroes.setZeroes(new int[][]{{1, 2, 3}, {4, 0, 5}});

        //74 Search 2D Matrix
        System.out.println("74 Search 2D Matrix " + Search2DMatrix.searchMatrix(new int[][]{{1, 2, 3, 4}, {6, 7, 8, 9}, {13, 18, 29, 33}}, 45));

        //75 Sort Colors
        System.out.println("75 Sort Colors ");
        SortColors.sortColors(new int[]{1, 0});

        //77 Combinations
        System.out.println("77 Combinations " + Combinations.combine(4, 2).toString());

        //78 Subsets
        System.out.println("78 Subsets " + Subsets.subsets(new int[]{1, 2, 3}).toString());

        //79 Word Search
        System.out.println("79 Word Search " + WordSearch.exist(new char[][]{{'a', 'b', 'c'}, {'a', 's', 'd'}}, "ab"));

        //80 Remove Duplicates from Sorted Array II My Submissions Question
        System.out.println("80 Remove Duplicates from Sorted Array II My Submissions Question " + RemoveDuplicatesfromSortedArray2.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 4}));

        //81 Search In Rotated Sorted Array2
        System.out.println("81 Search In Rotated Sorted Array 2 " + SearchInRotatedSortedArray2.search(new int[]{1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 7, 8, 9, 11, 12, 12}, 4));

        //82 Remove Duplicates From Sorted List 2
        System.out.println("82 Remove Duplicates From Sorted List 2");
        RemoveDuplicatesFromSortedList2.deleteDuplicates(a1);

        //84 Largest Rectangle In Histogram
        System.out.println("84 LargestRectangleInHistogram " + LargestRectangleInHistogram.largestRectangleArea2(new int[]{1, 2, 3}));

        //86 Partition List
        System.out.println("86 Partition List ");
        PartitionList.partition(b, 5);

        //87 Scramble String
        System.out.println("87 Scramble String " + ScrambleString.isScramble("abc", "acb"));

        //88 Merge Sorted Array
        System.out.println("88 Merge Sorted Array ");

        //89 Gray Code
        System.out.println("89 Gray Code " + GrayCode.grayCode(4).toString());

        //92 Reverse Linked List 2
        System.out.println("92 Reverse Linked List 2");
        ReverseLinkedList2.reverseBetween(a1, 1, 3);

        //93 Restore IP Addresses
        System.out.println("93 Restore IP Addresses " + RestoreIPAddress.restoreIpAddresses("0010010").toString());

        //94 Binary Tree Inorder Traversal
        com.example.TreeNode node1 = new TreeNode(1);
        com.example.TreeNode node2 = new TreeNode(2);
        com.example.TreeNode node3 = new TreeNode(3);
        com.example.TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node4;
        node4.left = node3;
        System.out.println("94 Binary Tree Inorder Traversal " + BinaryTreeInorderTraversal.inorderTraversal(node1).toString());

        //96 UniqueBinarySearchTrees
        System.out.println("96 Unique Binary Search Trees " + UniqueBinarySearchTrees.numTrees(5));

        //100 Same Tree
        System.out.println("100 Same Tree " + SameTree.isSameTree(node1, node1));

        //101 Symmetric Tree
        System.out.println("101 Symmetric Tree " + SymmetricTree.isSymmetric(node1));

        //102 Binary Tree Level Order Traversal
        System.out.println("102 Binary Tree Level Order Traversal " + BinaryTreeLevelOrderTraversal.levelOrder(node1).toString());

        //103 Binary Tree Zigzag Level Order Traversal
        System.out.println("103 Binary Tree Zigzag Level Order Traversal " + BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(node1).toString());

        //104 Maximum Depth of Binary Tree
        System.out.println("104 Maximum Depth of Binary Tree " + MaximumDepthofBinaryTree.maxDepth(node1));

        //105 Construct BinaryTree from Preorder and Inorder Traversal
        System.out.println("105 Construct BinaryTree from Preorder and Inorder Traversal");
        ConstructBinaryTreefromPreorderandInorderTraversal.buildTree(new int[]{1, 2, 4, 3}, new int[]{2, 4, 1, 3});

        //106 Construct Binary Tree from Inorder and Post order Traversal
        System.out.println("106 Construct Binary Tree from Inorder and Postorder Traversal");
        ConstructBinaryTreefromInorderandPostorderTraversal.buildTree(new int[]{1, 2}, new int[]{1, 2});

        //107 Binary Tree Level Order Traversal2
        System.out.println("107 Binary Tree Level Order Traversal2");
        BinaryTreeLevelOrderTraversal2.levelOrderBottom(node1);

        //108 Convert Sorted Array to Binary Search Tree
        System.out.println("108 Convert Sorted Array to Binary Search Tree");
        ConvertSortedArraytoBinarySearchTree.sortedArrayToBST(new int[]{1, 2, 3, 4});

        //109 Convert Sorted List to Binary Search Tree
        System.out.println("109 Convert Sorted List to Binary Search Tree ");
        ConvertSortedListtoBinarySearchTree.sortedListToBST(a);

        //110 Balanced Binary Tree
        TreeNode nodea = new TreeNode(1);
        TreeNode nodeb = new TreeNode(-2);
        TreeNode nodec = new TreeNode(-3);
        TreeNode noded = new TreeNode(1);
        TreeNode nodee = new TreeNode(3);
        TreeNode nodef = new TreeNode(-2);
        TreeNode nodeg = new TreeNode(-1);
        nodea.left = nodeb;
        nodea.right = nodec;
        nodeb.left = noded;
        nodeb.right = nodee;
        nodec.left = nodef;
        noded.left = nodeg;
        System.out.println("110 Balanced Binary Tree " + BalancedBinaryTree.isBalanced(nodea));

        //111 Minimum Depth of Binary Tree
        System.out.println("111 Minimum Depth of Binary Tree " + MinimumDepthofBinaryTree.minDepth(nodea));

        //112 Path Sum
        System.out.println("112 Path Sum" + PathSum.hasPathSum(nodea, 2));

        //113 Path Sum 2
        System.out.println("113  Path Sum 2 " + PathSum2.pathSum(nodea, 2).toString());

        //114 Flatten Binary Tree to Linked List
        System.out.println("114 Flatten Binary Tree to Linked List");
        FlatternBinaryTreetoLinkedList.flatten(node1);

        //116 Populating Next Right Pointers in Each Node
        System.out.println("116 Populating Next Right Pointers in Each Node");
        PopulatingNextRightPointersinEachNode.connect(null);

        //118 Pascal's Triangle
        System.out.println("118 Pascal's Triangle " + PascalTriangle.generate(5).toString());

        //119 Pascal's Triangle II
        System.out.println("119 Pascal's Triangle 2 " + PascalTriangle2.getRow(4).toString());

        //120 Triangle
        System.out.println("120 Triangle ");

        //121 Best Time to Buy and Sell Stock
        System.out.println("121 Best Time to Buy and Sell Stock " + BestTimetoBuyandSellStock.maxProfit(new int[]{1, 3, 6, 7, 9, 5, 1, 2}));

        //122 Best Time to Buy and Sell Stock II
        System.out.println("122 Best Time to Buy and Sell Stock2 " + BestTimetoBuyandSellStock2.maxProfit(new int[]{1, 3, 6, 9, 5, 7, 1, 2, 5,}));

        //125 Valid Palindrome
        System.out.println("125 Valid Palindrome " + ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));

        //136 Single Number
        System.out.println("136 Single Number " + SingleNumber.singleNumber(new int[]{1, 2, 3, 2, 3, 1, 5, 6, 5}));

        //141 Linked List Cycle
        System.out.println("141 Linked List Cycle " + LinkedListCycle.hasCycle(a));

        //142 Linked List Cycle 2
        System.out.println("142 Linked List Cycle 2 " + (LinkedListCycle2.detectCycle(a) == null ? "null" : "true"));

        //143 Reorder List
        System.out.println("143 Reorder List ");
        ReorderList.reorderList(a1);

        //151 Reverse Words in a String
        System.out.println("151 Reverse Words in a String " + ReverseWordsinaString.reverseWords("   a    b"));
    }
}
