package com.example;

import com.example.pack1to100.*;
import com.example.pack201to300.AddDigits;
import com.example.pack201to300.BasicCalculator2;
import com.example.pack201to300.BinaryTreePaths;
import com.example.pack201to300.BitwiseANDofNumbersRange;
import com.example.pack201to300.BullsandCows;
import com.example.pack201to300.CombinationSumIII;
import com.example.pack201to300.ContainsDuplicate;
import com.example.pack201to300.ContainsDuplicate2;
import com.example.pack201to300.CourseSchedule;
import com.example.pack201to300.FindtheDuplicatedNumber;
import com.example.pack201to300.FirstBadVersion;
import com.example.pack201to300.GameOfLife;
import com.example.pack201to300.HIndex;
import com.example.pack201to300.HIndex2;
import com.example.pack201to300.HappyNumber;
import com.example.pack201to300.HouseRobberII;
import com.example.pack201to300.InvertBinaryTree;
import com.example.pack201to300.IsomorphicStrings;
import com.example.pack201to300.KthLargestElementInAnArray;
import com.example.pack201to300.KthSmallestElementinaBST;
import com.example.pack201to300.LargestNumber;
import com.example.pack201to300.LongestIncreasingSubsequence;
import com.example.pack201to300.MajorityElement2;
import com.example.pack201to300.MaximalSquare;
import com.example.pack201to300.MinimumSizeSubarraySum;
import com.example.pack201to300.MissingNumber;
import com.example.pack201to300.MoveZeroes;
import com.example.pack201to300.NimGame;
import com.example.pack201to300.PalindromeLinkedList;
import com.example.pack201to300.PerfectSquare;
import com.example.pack201to300.PowerOfTwo;
import com.example.pack201to300.ProductofArrayExceptSelf;
import com.example.pack201to300.RectangleArea;
import com.example.pack201to300.RemoveLinkedListElements;
import com.example.pack201to300.SingleNumber3;
import com.example.pack201to300.SummaryRanges;
import com.example.pack201to300.UglyNumber;
import com.example.pack201to300.ValidAnagram;
import com.example.pack201to300.WordPattern;
import com.example.pack301to400.BulbSwitcher;
import com.example.pack301to400.CoinChange;
import com.example.pack301to400.HouseRobberIII;
import com.example.pack301to400.IntersectionofTwoArrays2;
import com.example.pack301to400.MaximumProductofWordLengths;
import com.example.pack301to400.PowerOfFour;
import com.example.pack301to400.PowerOfThree;
import com.example.pack301to400.ReverseString;
import com.example.pack301to400.ReverseVowelsofaString;
import com.example.pack101to200.*;
import com.example.pack301to400.TopKFrequentElements;
import com.example.pack301to400.Twitter;
import com.example.pack301to400.ValidPerfectSquare;
import com.example.package401to500.ArrangingCoins;
import com.example.package401to500.AssignCookies;
import com.example.package401to500.ConstructtheRectangle;
import com.example.package401to500.FindAllAnagramsinaString;
import com.example.package401to500.FindAllDuplicatesinanArray;
import com.example.package401to500.FindAllNumbersDisappearedinanArray;
import com.example.package401to500.FourSumII;
import com.example.package401to500.FrogJump;
import com.example.package401to500.IslandPerimeter;
import com.example.package401to500.MinimumMovestoEqualArrayElements;
import com.example.package401to500.MinimumMovestoEqualArrayElementsII;
import com.example.package401to500.NonOverlappingIntervals;
import com.example.package401to500.NumberComplement;
import com.example.package401to500.NumberofSegmentsinaString;
import com.example.package401to500.OnesandZeroes;
import com.example.package401to500.PathSumIII;
import com.example.package401to500.ReconstructOriginalDigitsfromEnglish;
import com.example.package401to500.RepeatedSubStringPattern;
import com.example.package401to500.SortCharacterByFrequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import sun.misc.Perf;

public class LeetCode {
    public static void main(String... args) {
        //1 two sum
        System.out.println("1.two sum = " + Arrays.toString(com.example.pack1to100.TwoSum.twoSum(new int[]{1, 2, 4, 5, 10, 15}, 9)));

        //2 add two numbers
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        ListNode b = new ListNode(9);
        b.next = new ListNode(3);
        b.next.next = new ListNode(5);
        ListNode r2 = com.example.pack1to100.AddTwoNumbers.addTwoNumbers(a, b);
        System.out.print("2.add two numbers = ");
        while (r2 != null) {
            System.out.print(r2.val + "->");
            r2 = r2.next;
        }
        System.out.println("");

        //3 Longest Substring Without Repeating Characters
        System.out.println("3.Longest Substring Without Repeating Characters " + com.example.pack1to100.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring1
                ("abcdcd") + "," + com.example.pack1to100.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2
                ("ababcde"));

        //4 Median of Two Sorted Arrays
        int[] a4 = {1, 1, 1, 3};
        int[] b4 = {1, 2, 3, 4};
        System.out.println("4.median of two sorted arrays = " + com.example.pack1to100.MedianOfTwoSortedArrays.findMedianSortedArrays(a4, b4));

        //5 longest palindromic substring
        System.out.println("5.longest palindromic substring = " + com.example.pack1to100.LongestPalindromicSubstring.longestPalindrome("abcedfghjhg1ab"));

        //6 ZigZag Conversion
        System.out.println("6.zigzag conversion = " + com.example.pack1to100.ZigZagConversion.convert("abcdefghijklmnopq", 4));

        //7 Reverse Integer
        System.out.println("7.reverse integer = " + com.example.pack1to100.ReverseInteger.reverse(123456));

        //8 String to Integer(atoi)
        System.out.println("8.atoi = " + com.example.pack1to100.StringToInteger.myAtoi("105225"));

        //9 Palindrome Number
        System.out.println("9.palindrome number = " + com.example.pack1to100.PalindromeNumber.isPalindrome(124565421));

        //10 Regular Expression Matching
        System.out.println("10 Regular Expression Matching " + RegularExpressionMatching.isMatch("aab", "c*a*b"));

        //11 Container With Most Water
        System.out.println("11.Container With Most Water = " + com.example.pack1to100.ContainerWithMostWater.maxArea(new int[]{1, 4, 10, 20, 4, 8, 9}));

        //12 Integer to Roman
        System.out.println("12. integer to roman = " + com.example.pack1to100.IntegerToRoman.intToRoman(123));

        //13 Roman to Integer
        System.out.println("13. roman to integer  = " + com.example.pack1to100.RomanToInteger.romanToInt("XVI"));

        //14 Longest Common Prefix
        System.out.println("14. longest common prefix = " + com.example.pack1to100.LongestCommonPrefix.longestCommonPrefix(new String[]{"abcd", "abc", "abde"}));

        //15 3Sum
        System.out.println("15. 3sum = " + com.example.pack1to100.ThreeSum.threeSum(new int[]{-5, -2, 0, 9, 10, 3, 4, -1,}));

        //16 3Sum Closest
        System.out.println("16. 3sum closest = " + com.example.pack1to100.ThreeSumClosest.threeSumClosest(new int[]{-1, -5, 7, 9, 10, 28}, 5));

        //17 Letter Combinations of a Phone Number
        System.out.println("17. Letter Combinations of a Phone Number = " + com.example.pack1to100.LetterCombinationsOfAPhoneNumber.letterCombinations("12345"));

        //18 4Sum
        System.out.println("18. 4Sum = " + com.example.pack1to100.FourSum.fourSum(new int[]{-1, -5, 7, 9, 10, 28, 4, 3, 2, 9, -15, -10}, 5));

        //19 Remove Nth Node From End of List
        System.out.println("19. Remove Nth Node From End of List");

        //20 Valid Parentheses
        System.out.println("20. Valid Parentheses = " + com.example.pack1to100.ValidParenthese.isValid("(){[]}"));

        //21 merge two sort arrays
        System.out.println("21. Merge two sorted Lists ");

        //22 Generate Parentheses
        System.out.println("22. Generate Parentheses " + com.example.pack1to100.GenerateParentheses.generateParenthesis(3));

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
        System.out.println("25. Reverse Nodes in k-Group " + com.example.pack1to100.ReverseNodesInKGroup.reverseKGroup(a1, 2));

        //26 Remove Duplicates from Sorted Array
        System.out.println("26. Remove Duplicates from Sorted Array " + com.example.pack1to100.RemoveDuplicatesfromSortedArray.removeDuplicates(new int[]{1, 1, 1, 2, 2, 5, 5, 19, 20}));

        //27 Remove Element
        System.out.println("27. Remove Element " + com.example.pack1to100.RemoveElement.removeElement(new int[]{1, 2, 3}, 2));

        //28 Implement strStr()
        System.out.println("28. Implement strStr " + com.example.pack1to100.ImplementstrStr.strStr("abcdefg", "bcd"));

        //30 SubstringwithConcatenationofAllWords
        System.out.println("30 Substring with Concatenation of All Words " + SubstringwithConcatenationofAllWords.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}).toString());

        //31 Next Permutation
        com.example.pack1to100.NextPermutation.nextPermutation(new int[]{1, 2, 3, 5, 4});
        System.out.println("31. Next Permutation");

        //32 longest
        System.out.println("32 " + Longest.longestValidParentheses("(()()"));

        //33 Search in Rotated Sorted Array
        System.out.println("33. Search in Rotated Sorted Array " + com.example.pack1to100.SearchInARotateArray.search(new int[]{284, 287, 289, 293, 295, 298, 0, 3, 8, 9, 10, 11, 12, 15, 17, 19, 20, 22, 26, 29, 30, 31, 35, 36, 37, 38, 42, 43, 45, 50, 51, 54, 56, 58, 59, 60, 62, 63, 68, 70, 73, 74, 81, 83, 84, 87, 92, 95, 99, 101, 102, 105, 108, 109, 112, 114, 115, 116, 122, 125, 126, 127, 129, 132, 134, 136, 137, 138, 139, 147, 149, 152, 153, 154, 155, 159, 160, 161, 163, 164, 165, 166, 168, 169, 171, 172, 174, 176, 177, 180, 187, 188, 190, 191, 192, 198, 200, 203, 204, 206, 207, 209, 210, 212, 214, 216, 221, 224, 227, 228, 229, 230, 233, 235, 237, 241, 242, 243, 244, 246, 248, 252, 253, 255, 257, 259, 260, 261, 262, 265, 266, 268, 269, 270, 271, 272, 273, 277, 279, 281}, 235));

        //34 Search for a range
        System.out.println("34. search for a range " + SearchForARange.searchRange(new int[]{1, 2, 3, 4, 5, 5, 5, 8, 9}, 5));

        //35 SearchInsertPosition
        System.out.println("35. seach insert position " + SearchInsertPosition.searchInsert(new int[]{1, 2, 5, 8, 10}, 6));

        //36 ValidSudoku
        System.out.println("36. valid sudoku");

        //37 Sudoku Solver
        System.out.println("37 sudoku solver");

        //39 Combination Sum
        System.out.println("39 Combination Sum " + CombinationSum.combinationSum(new int[]{2, 3, 5, 7}, 11));

        //40 Combination Sum2
        System.out.println("40 Combination Sum2 " + CombinationSum2.combinationSum2(new int[]{2, 5, 4, 9, 1, 7, 6}, 11));

        //41 First Missing Positive
        System.out.println("41. First Missing Positive " + FirstMissingPositive.firstMissingPositive(new int[]{1, 2, 3, 8, 9, 10, 5, 7, 4}));

        //42 Trapping rain water
        System.out.println("42. Trapping rain water " + TrappingRainWater.trap(new int[]{2, 1, 3, 1, 4}));

        //43 Multiply Strings
        System.out.println("43 Multiply Strings " + MultiplyStrings.multiply("9", "9"));

        //44 Wildcard Matching
        System.out.println("44 Wildcard Matching " + WildcardMatching.isMatch("aab", "c*a*b"));

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
        List<Interval> list = new ArrayList<Interval>();
        list.add(new Interval(2, 3));
        list.add(new Interval(4, 6));
        list.add(new Interval(7, 8));
        list.add(new Interval(1, 10));
        System.out.println("56 Merge Intervals " + MergeIntervals.merge(list).toString());

        //57 Insert Intervals
        List<Interval> list2 = new ArrayList<Interval>();
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

        //68 Text Justification
        System.out.println("68 Text Justification " + TextJustification.fullJustify(new String[]{"What", "must", "be", "shall", "be."}, 12).toString());

        //70 Climbing Stairs
        System.out.println("70 Climbing Stairs " + ClimbingStairs.climbStairs(9));

        //71 Simplify Path
        System.out.println("71 Simplify Path " + SimplifyPath.simplifyPath("/.."));

        //72 Edit Distance
        System.out.println("72 Edit Distance " + EditDistance.minDistance("abcde", "adf"));

        //73 Set Matrix Zeroes
        System.out.println("73 Set Matrix Zeroes ");
        SetMatrixZeroes.setZeroes(new int[][]{{1, 2, 3}, {4, 0, 5}});

        //74 Search 2D Matrix
        System.out.println("74 Search 2D Matrix " + Search2DMatrix.searchMatrix(new int[][]{{1, 2, 3, 4}, {6, 7, 8, 9}, {13, 18, 29, 33}}, 45));

        //75 Sort Colors
        System.out.println("75 Sort Colors ");
        SortColors.sortColors(new int[]{1, 0});

        //76 Minimum Window Substring
        System.out.println("76 Minimum Window Substring " + MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));

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

        //83 Remove Duplicates from Sorted List
        System.out.println("83 Remove Duplicates From Sorted List");
        RemoveDuplicatesFromSortedList.deleteDuplicates(a1);

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

        //90 Subsets2
        System.out.println("90 SubsetsII " + Subsets2.subsetsWithDup(new int[]{1, 2, 2,}));

        //91 Decode Ways
        System.out.println("91 Decode Ways " + DecodeWays.numDecodings("1231012012"));

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

        //95 UniqueBinarySearchTrees2
        System.out.println("95 Unique Binary Search Trees 2 " + UniqueBinarySearchTreesII.generateTrees(3));

        //96 UniqueBinarySearchTrees
        System.out.println("96 Unique Binary Search Trees " + UniqueBinarySearchTrees.numTrees(5));

        //97 isInterleave
        System.out.println("97 Interleaving String " + IntervalString.isInterleave("a", "b", "ab"));

        //98 Validate Binary Search Tree
        TreeNode node98 = new TreeNode(1);
        TreeNode node99 = new TreeNode(1);
        node98.right = node99;
        System.out.println("98 Validate Binary Search Tree " + ValidateBinarySearchTree.isValidBST(node98));

        //99 Recover Binary Search Tree
        System.out.println("99 Recover Binary Search Tree");

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

        //115 Distinct Subsequences
        System.out.println("115 Distinct Subsequences " + DistinctSubsequences.numDistinct("rabbbit", "rabbit"));

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

        //124 Binary Tree Maximum Path Sum
        System.out.println("124 Binary Tree Maximum Path Sum" + BinaryTreeMaximumPathSum.maxPathSum(node1));

        //125 Valid Palindrome
        System.out.println("125 Valid Palindrome " + ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));

        //128 Longest Consecutive Sequence
        System.out.println("128 Longest Consecutive Sequence " + LongestConsecutiveSequence.longestConsecutive(new int[]{15, 3, 5, 6, 10, 9, 7, 8}));

        //129 Sum Root to Leaf Numbers
        System.out.println("129 Sum Root to Leaf Numbers " + SumRoottoLeafNumbers.sumNumbers(node1));

        //130 Surround Regions
        System.out.println("130 Surrounded Regions ");
        SurroundedRegions.solve(new char[][]{{'O'}});

        //131 Palindrome Partitioning
        System.out.println("131 Palindrome Partitioning " + PalindromePartitioning.partition("aab"));

        //132 Palindrome Partitioning2
        System.out.println("131 Palindrome Partitioning2 " + PalindromePartitioning2.minCut("aabadadad"));

        //134 Gas Station
        System.out.println("134 Gas Station " + GasStation.canCompleteCircuit(new int[]{4}, new int[]{5}));

        //135 Candy
        System.out.println("135 Candy " + Candy.candy(new int[]{1, 2, 3, 4, 5, 3, 1, 2, 6, 4, 1}));

        //136 Single Number
        System.out.println("136 Single Number " + SingleNumber.singleNumber(new int[]{1, 2, 3, 2, 3, 1, 5, 6, 5}));

        //138 Copy List with Random Pointer
        System.out.println("138 Copy List with Random Pointer");

        //139 Word Break
        Set<String> set = new HashSet<String>();
        set.add("lee");
        set.add("leet");
        set.add("code");
        System.out.println("139 Word Break " + WordBreak.wordBreak("leetcode", set));

        //140 Word Break II
        HashSet<String> set1 = new HashSet<String>();
        set1.add("cat");
        set1.add("cats");
        set1.add("and");
        set1.add("sand");
        set1.add("dog");
        System.out.println("140 Word Break II " + WordBreak2.wordBreak("catsanddog", set1).toString());

        //141 Linked List Cycle
        System.out.println("141 Linked List Cycle " + LinkedListCycle.hasCycle(a));

        //142 Linked List Cycle 2
        System.out.println("142 Linked List Cycle 2 " + (LinkedListCycle2.detectCycle(a) == null ? "null" : "true"));

        //143 Reorder List
        System.out.println("143 Reorder List ");
        ReorderList.reorderList(a1);

        //144 Binary Tree Preorder Traversal
        System.out.println("144 Binary Tree Preorder Traversal " + BinaryTreePreorderTraversal.preorderTraversal(node1).toString());

        //145 Binary Tree Postorder Traversal
        System.out.println("145 Binary Tree Postorder Traversal " + BinaryTreePostorderTraversal.postorderTraversal(node1).toString());

        //146 LRU Cache
        System.out.println("146 LRU Cache");

        //147 Insertion Sort List
        System.out.println("147 Insertion Sort List ");
        InsertionSortList.insertionSortList(b);

        //148 Sort List
        System.out.println("148 Sort List");
        SortList.sortList(b);

        //150 Evaluate Reverse Polish Notation
        System.out.println("150 Evaluate Reverse Polish Notation " + EvaluateReversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));

        //151 Reverse Words in a String
        System.out.println("151 Reverse Words in a String " + ReverseWordsinaString.reverseWords("   a    b"));

        //153 Find Minimum in Rotated Sorted Array
        System.out.println("153 Find Minimum in Rotated Sorted Array " + FindMinimuminRotatedSortedArray.findMin(new int[]{4, 1, 2, 3}));

        //154 Find Minimum in Rotated Sorted Array 2
        System.out.println("154 Find Minimum in Rotated Sorted Array 2 " + FindMinimuminRotatedSortedArray2.findMin(new int[]{4, 1, 1, 1, 2, 2, 3}));

        //160 Intersection of Two Linked Lists
        System.out.println("160 Intersection of Two Linked Lists " + IntersectionofTwoLinkedLists.getIntersectionNode(a1, a2).val);

        //162 Find Peak Element
        System.out.println("162 Find Peak Element " + FindPeakElement.findPeakElement(new int[]{1, 2, 3, 1}));

        //165 CompareVersionNumbers
        System.out.println("165 Compare Version Numbers " + CompareVersionNumbers.compareVersion("1.2", "1"));

        //168 Excel Sheet Column Title
        System.out.println("168 Excel Sheet Column Title " + ExcelSheetColumnTitle.convertToTitle(32));

        //169 Majority Element
        System.out.println("169 Majority Element " + MajorityElement.majorityElement(new int[]{1, 2, 3, 4, 2, 3, 4, 2, 2, 2, 2, 2}));

        //171 Excel Sheet Column Number
        System.out.println("171 Excel Sheet Column Number " + ExcelSheetColumnNumber.titleToNumber("AC"));

        //179 Largest Number
        System.out.println("179 Largest Number " + LargestNumber.largestNumber(new int[]{1, 2, 21, 232, 23, 32}));

        //187 Repeated DNA Sequences
        System.out.println("187 Repeated DNA Sequences " + ReapeatedDNASequences.findRepeatedDnaSequences("AAAAAAAAAAA"));

        //189 Rotate Array
        System.out.println("189 Rotate Array ");
        RotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 4);

        //190 Reverse Bits
        System.out.println("190 Reverse Bits" + ReverseBits.reverseBits(1));

        //191 Number of 1 Bits
        System.out.println("191 Number of 1 Bits " + NumberOf1Bits.hammingWeight(30));

        //198 House Rob
        System.out.println("198 House Rob " + HouseRob.rob(new int[]{1, 2, 3, 4, 5}));

        //199 Binary Tree Right Side View
        System.out.println("199 Binary Tree Right Side View " + BinaryTreeRightSideView.rightSideView(node1).toString());

        //200 Number of Islands
        System.out.println("200 Number of Islands " + NumberOfIslands.numIslands(new char[][]{{'1', '0'}, {'0', '1'}}));

        //201 Bitwise AND of Numbers Range
        System.out.println("201 Bitwise AND of Numbers Range " + BitwiseANDofNumbersRange.rangeBitwiseAnd(5, 7));

        //202 Happy Number
        System.out.println("202 Happy Number " + HappyNumber.isHappy(19));

        //203 Remove Linked List Elements
        System.out.println("203 Remove Linked List Elements ");
        RemoveLinkedListElements.removeElements(a1, 2);

        //205 Isomorphic Strings
        System.out.println("205 Isomorphic Strings " + IsomorphicStrings.isIsomorphic("abc", "efe"));

        //206  Reverse Linked List
        System.out.println("206 Reverse Linked List");

        //207 Course Schedule
        System.out.println("207 Course Schedule " + CourseSchedule.canFinish(2, new int[][]{{1, 0}}));

        //208 Implement Trie (Prefix Tree)
        System.out.println("208 Implement Trie (Prefix Tree) ");

        //209 Minimum Size Subarray Sum
        System.out.println("209 Minimum Size Subarray Sum " + MinimumSizeSubarraySum.minSubArrayLen(10, new int[]{1, 3, 6, 5, 3, 2}));

        //213 House Robber II
        System.out.println("213 House Robber II " + HouseRobberII.rob(new int[]{1, 2, 3, 4, 8, 7, 2, 3, 9, 1}));

        //215 Kth Largest Element in an Array
        System.out.println("215 Kth Largest Element in an Array " + KthLargestElementInAnArray.findKthLargest(new int[]{1, 3, 4, 2, 6, 8, 4, 5, 9}, 3));

        //216 Combination Sum III
        System.out.println("216  Combination Sum III " + CombinationSumIII.combinationSum3(3, 9).toString());

        //217 Contains Duplicate
        System.out.println("217 Contains Duplicate " + ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4, 1}));

        //219 Contains Duplicate II
        System.out.println("219 Contains Duplicate II  " + ContainsDuplicate2.containsNearbyDuplicate(new int[]{1, 2, 1, 3, 4, 4, 5}, 3));

        //221 Maximal Square
        System.out.println("221 Maximal Square " + MaximalSquare.maximalSquare(new char[][]{{'1', '1', '0', '1'}, {'1', '1', '0', '1'}, {'1', '1', '1', '1'}}));

        //222 Count Complete Tree Nodes
        System.out.println("222 Count Complete Tree Nodes");

        //223 Rectangle Area
        System.out.println("223 Rectangle Area " + RectangleArea.computeArea(0, 0, 2, 2, 1, 1, 3, 3));

        //225 Implement Stack using Queues
        System.out.println("225 Implement Stack using Queues ");

        //226 Invert Binary Tree
        System.out.println("226 Invert Binary Tree ");
        InvertBinaryTree.invertTree(node1);

        //227 Basic Calculator II
        System.out.println("227 Basic Calculator II " + BasicCalculator2.calculate("2*3-5-2/1"));

        //228 Summary Ranges
        System.out.println("228 Summary Ranges " + SummaryRanges.summaryRanges(new int[]{1, 2, 3, 5, 7}));

        //229 Majority Element II
        System.out.println("229 Majority Element II " + MajorityElement2.majorityElement(new int[]{1, 2, 1}).toString());

        //230 Kth Smallest Element in a BST
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        n2.left = n1;
        System.out.println("230 Kth Smallest Element in a BST " + KthSmallestElementinaBST.kthSmallest(n2, 1));

        //231 Power of Two
        System.out.println("231 Power of Two " + PowerOfTwo.isPowerOfTwo(8));

        //232 Implement Queue using Stacks
        System.out.println("232 Implement Queue using Stacks");

        //234 Palindrome Linked List
        System.out.println("234 Palindrome Linked List " + PalindromeLinkedList.isPalindrome(a1));

        //235 Lowest Common Ancestor of a Binary Search Tree
        System.out.println("235 Lowest Common Ancestor of a Binary Search Tree ");

        //236 Lowest Common Ancestor of a Binary Tree
        System.out.println("236 Lowest Common Ancestor of a Binary Tree ");

        //237 Delete Node in a Linked List
        System.out.println("237 Delete Node in a Linked List ");

        //238 Product of Array Except Self
        System.out.println("238 Product of Array Except Self " + ProductofArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));

        //240 Search a 2D Matrix II
        System.out.println("240 Search a 2D Matrix II " + Search2DMatrix.searchMatrix(new int[][]{{1, 2, 4, 6}, {3, 5, 7, 8}}, 5));

        //242 Valid Anagram
        System.out.println("242 Valid Anagram " + ValidAnagram.isAnagram("abc", "cba"));

        //257 Binary Tree Paths
        System.out.println("257 Binary Tree Paths " + BinaryTreePaths.binaryTreePaths(node1).toString());

        //258 Add Digits
        System.out.println("258 Add Digits " + AddDigits.addDigits(123));

        //260 Single Number3
        System.out.println("260 Single Number III " + SingleNumber3.singleNumber(new int[]{0, 2, 1, 1, 3, 3}));

        //263 Ugly Number
        System.out.println("263 Ugly Number " + UglyNumber.isUgly(15));

        //268 Missing Number
        System.out.println("268 Missing Number " + MissingNumber.missingNumber(new int[]{1, 2, 3, 5, 6}));

        //274 H-Index
        System.out.println("274 H-Index " + HIndex.hIndex(new int[]{100}));

        //275 H-Index II
        System.out.println("275 H-Index II " + HIndex2.hIndex(new int[]{1, 2}));

        //278 First Bad Version
        System.out.println("278 First Bad Version " + FirstBadVersion.firstBadVersion(9));

        //279 Perfect Squares
        System.out.println("279 Perfect Squares " + PerfectSquare.numSquares(21));

        //283 Move Zeroes
        System.out.println("283 Move Zeroes ");

        //284 Peeking Iterator
        System.out.println("284 Peeking Iterator");

        //287 Find the Duplicated Number
        System.out.println("287 Find the Duplicated Number " + FindtheDuplicatedNumber.findDuplicate(new int[]{1, 2, 3, 4, 2}));

        //289 Game of Life
        System.out.println("289 Game of Life ");
        GameOfLife.gameOfLife(new int[][]{{1}});

        //290 Word Pattern
        System.out.println("290 Word Pattern " + WordPattern.wordPattern("abbc", "what fuck fuck world"));

        //292 Nim Game
        System.out.println("292 Nim Game " + NimGame.canWinNim(15));

        //295 Find Median from Data Stream
        System.out.println("295 Find Median from Data Stream ");

        //299 Bulls and Cows
        System.out.println("299 Bulls and Cows " + BullsandCows.getHint("1234", "1364"));

        //300 Longest Increasing Subsequence
        System.out.println("300 Longest Increasing Subsequence " + LongestIncreasingSubsequence.lengthOfLIS(new int[]{5, 3, 4, 8, 1, 19}));

        //303 Range Sum Query - Immutable
        System.out.println("303 Range Sum Query - Immutable");

        //304 Range Sum Query 2D - Immutable
        System.out.println("304 Range Sum Query 2D - Immutable");

        //318 Maximum Product of Word Lengths
        System.out.println("318 Maximum Product of Word Lengths " + MaximumProductofWordLengths.maxProduct(new String[]{"abc", "cd", "ab"}));

        //319 Bulb Switch
        System.out.println("319 Bulb Switch " + BulbSwitcher.bulbSwitch(10));

        //322 Coin Change
        System.out.println("322 Coin Change " + CoinChange.coinChange(new int[]{1, 2, 5}, 88));

        //326 Power of Three
        System.out.println("326 Power of Three " + PowerOfThree.isPowerOfThree(27));

        //328 Odd Even Linked List
        System.out.println("328 Odd Even Linked List ");

        //337 House Robber III
        System.out.println("337 House Robber III " + HouseRobberIII.rob(new TreeNode(1)));

        //341 Flatten Nested List Iterator
        System.out.println("341 Flatten Nested List Iterator");

        //342 Power of Four
        System.out.println("342 Power of Four " + PowerOfFour.isPowerOfFour(16));

        //344 Reverse String
        System.out.println("344 Reverse String " + ReverseString.reverseString("abcde"));

        //345 Reverse Vowels of a String
        System.out.println("345 Reverse Vowels of a String " + ReverseVowelsofaString.reverseVowels("hello"));

        //347 Top K Frequent Elements
        System.out.println("347 Top K Frequent Elements " + TopKFrequentElements.topKFrequent(new int[]{1, 2, 3, 4, 5, 2, 4, 6}, 2));

        //350 Intersection of Two Arrays II
        System.out.println("350 Intersection of Two Arrays II " + IntersectionofTwoArrays2.intersect(new int[]{1, 2, 3, 1, 2}, new int[]{1, 2, 1}));

        //355 Twitter
        System.out.println("355 Design Twitter");
        Twitter twitter = new Twitter();

        //367 Valid Perfect Square
        System.out.println("367 Valid Perfect Square " + ValidPerfectSquare.isPerfectSquare(145789));

        //403 Frog Jump
        FrogJump.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17});

        //423 Reconstruct Original Digits from English
        System.out.println("423 Reconstruct Original Digits from English " + ReconstructOriginalDigitsfromEnglish.originalDigits("noehtrwtoee"));

        //434 Number of Segments in a String
        System.out.println("434 Number of Segments in a String " + NumberofSegmentsinaString.countSegments("Hello, my name is John"));

        //435 Non-overlapping Intervals
        System.out.println("435 Non-overlapping Intervals " + NonOverlappingIntervals.eraseOverlapIntervals(new Interval[]{new Interval(1, 2), new Interval(2, 3), new Interval(1, 3)}));

        //437 Path Sum III
        System.out.println("437 Path Sum III " + PathSumIII.pathSum(new TreeNode(1), 1));

        //438 Find All Anagrams in a String
        System.out.println("438 Find All Anagrams in a String " + FindAllAnagramsinaString.findAnagrams("abab", "ab"));

        //441 Arranging Coins
        System.out.println("441 Arranging Coins " + ArrangingCoins.arrangeCoins(8));

        //442 Find All Duplicates in an Array
        System.out.println("442 Find All Duplicates in an Array " + FindAllDuplicatesinanArray.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));

        //448 Find All Numbers Disappeared in an Array
        System.out.println("448 Find All Numbers Disappeared in an Array " + FindAllNumbersDisappearedinanArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));

        //451 Sort Characters By Frequency
        System.out.println("451 Sort Characters By Frequency " + SortCharacterByFrequency.frequencySort("tree"));

        //453
        MinimumMovestoEqualArrayElements.minMoves(new int[]{1, 2, 3});

        //454 4Sum II
        System.out.println("454 4Sum II " + FourSumII.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}));

        //455 Assign Cookies
        System.out.println("455 Assign Cookies " + AssignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 2}));

        //459 Repeated SubString Pattern
        System.out.println("459 Repeated SubString Pattern " + RepeatedSubStringPattern.repeatedSubstringPattern("bb"));

        //462 Minimum Moves to Equal Array Elements II
        System.out.println("462 Minimum Moves to Equal Array Elements II " + MinimumMovestoEqualArrayElementsII.minMoves2(new int[]{1, 2, 3, 4, 5, 6}));

        //463 Island Perimeter
        System.out.println("463 Island Perimeter " + IslandPerimeter.islandPerimeter(new int[][]{{1, 1}, {1, 1}}));

        //474 Ones and Zeroes
        System.out.println("474 Ones and Zeroes " + OnesandZeroes.findMaxForm(new String[]{"01", "1", "0"}, 1, 1));

        //476 Number Complement
        System.out.println("476 Number Complement " + NumberComplement.findComplement(5));

        //492 Construct the Rectangle
        System.out.println("492 Construct the Rectangle " + ConstructtheRectangle.constructRectangle(15));
    }
}


