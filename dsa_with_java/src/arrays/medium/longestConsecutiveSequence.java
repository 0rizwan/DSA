package arrays.medium;

import java.util.Arrays;
import java.util.HashSet;

// Longest Consecutive Sequence in an Array
// Problem Statement: Given an array nums of n integers.
// Return the length of the longest sequence of consecutive integers. 
// The integers in this sequence can appear in any order.
public class longestConsecutiveSequence {
    // Brute force approach using two loops -
    // TC - O(n*n), SC - O(1)
    public static int longestConsecutive(int[] arr, int n) {
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr, x + 1) == true) {
                x = x + 1;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    // Better approach by sorting the array -
    public static int longestConsecutive2(int[] arr, int n) {
        Arrays.sort(arr);
        int longest = 1;
        int lastSmallest = Integer.MIN_VALUE;
        int currentCnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmallest) {
                currentCnt += 1;
                lastSmallest = arr[i];
            } else if (arr[i] != lastSmallest) {
                currentCnt = 1;
                lastSmallest = arr[i];
            }
            longest = Math.max(longest, currentCnt);
        }
        return longest;
    }

    // Optimal approach using Set -
    // TC - O(3n), SC - O(n)
    public static void longestConsecutive3(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int item : set) {
            if (!set.contains(item - 1)) {
                cnt = 1;
                int x = item;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
            }
            longest = Math.max(longest, cnt);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 4, 1, 3, 6 };
        System.out.println(longestConsecutive(arr, arr.length));

        int[] arr2 = { 10, 2, 1, 2, 2, 2, 3, 3, 100, 101, 102, 4, 1, 3, 6 };
        System.out.println(longestConsecutive2(arr2, arr2.length));
    }
}
