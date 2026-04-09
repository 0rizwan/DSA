package arrays;

import java.util.HashMap;

public class longestSubarray {
    // Given an array nums of size n and an integer k, find the length of the
    // longest sub-array that sums to k. If no such sub-array exists, return 0.

    // Brute force approach - TC - O(n*n) SP - O(1)
    public static int longestSubarrayWithK(int[] arr, int k, int n) {
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    int len = j - i + 1;
                    if (maxLen < len) {
                        maxLen = len;
                    }
                }
            }
        }
        return maxLen;
    }

    // Better approach - if the array contains just positives numbers
    // Optimal approach - if the array contains negative and positives both with zero as well.
    public static void longestSubarrayWithK2(int[] arr, int k, int n) {
        HashMap<Long, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - k;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 5, -2, 3 };
        System.out.println("Longest subarray length is " + longestSubarrayWithK(arr, 3, arr.length));
    }
}
