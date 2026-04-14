package arrays;

import java.util.Arrays;

public class twoSum {
    // Two Sum : Check if a pair with given sum exists in Array
    // Problem Statement: Given an array of integers arr[] and an integer target.

    // 1st variant: Return YES if there exist two numbers such that their sum is
    // equal to the target. Otherwise, return NO.

    // 2nd variant: Return indices of the two numbers such that their sum is equal
    // to the target. Otherwise, we will return {-1, -1}.

    // Brute force approach TC - O(n*n) SP - O(1)
    public static String isTwoSum(int[] arr, int n, int target) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static int[] twoSumIndices(int[] arr, int n, int target) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        System.out.println(isTwoSum(arr, arr.length, 7));
        System.out.println(Arrays.toString(twoSumIndices(arr, arr.length, 7)));
    }
}
