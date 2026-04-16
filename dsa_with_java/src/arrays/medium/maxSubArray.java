package arrays.medium;

import java.util.Arrays;

// Kadane's Algorithm : Maximum Subarray Sum in an Array

// Problem Statement: Given an integer array nums, find the subarray with the largest sum 
// and return the sum of the elements present in that subarray.
// A subarray is a contiguous non-empty sequence of elements within an array.
public class maxSubArray {

    // Brute force approach using three loops -
    // TC - O(n*n*n) SC - O(1)
    public static int maxSubArray1(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        int[] subarray = Arrays.copyOfRange(arr, start, end);
        System.out.println(Arrays.toString(subarray));

        return maxSum;
    }

    // Slightly better than brute approach -
    public static int maxSubArray2(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }
        int[] subarray = Arrays.copyOfRange(arr, start, end + 1);
        System.out.println(Arrays.toString(subarray));

        return maxSum;
    }

    // Optimal approach using Kadane's algorithm -
    // TC - O(n) SC - O(1)
    public static int maxSubArray3(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        // Printing the subarray
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            if (i == ansEnd)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println("]");

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, -2, 7, -4 };
        int a = maxSubArray1(arr, arr.length);
        System.out.println(a);

        int b = maxSubArray2(arr, arr.length);
        System.out.println(b);

        int[] arr2 = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int c = maxSubArray3(arr2, arr2.length);
        System.out.println(c);
    }
}
