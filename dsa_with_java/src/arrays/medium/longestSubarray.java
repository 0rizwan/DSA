package arrays.medium;

import java.util.HashMap;

// Given an array nums of size n and an integer k, find the length of the
// longest sub-array that sums to k. If no such sub-array exists, return 0.
public class longestSubarray {

    // Brute force approach using nested loops - TC - O(n*n) SP - O(1)
    public static int longestSubarrayWithK(int[] arr, int n, int k) {
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
    // Optimal approach - if the array contains negative and positives both with
    // zero as well.
    // TC - O(n) SC - O(n)
    public static int longestSubarrayWithK2(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(prefixSum - k)) {
                int len = i - map.get(prefixSum - k);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }

    // Optimal approach using two pointers - if all the numbers are positive
    // TC - O(n) SP - O(1)
    public static int longestSubarrayWithK3(int[] arr, int n, int k) {
        int sum = 0;
        int maxLen = 0;
        int left = 0, right = 0;

        while (right < n) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 5, -2, 3 };
        System.out.println("Longest subarray length is " + longestSubarrayWithK(arr, arr.length, 3));

        int[] arr2 = { 1, 2, 3, 1, 1, 1, 1 };
        System.out.println("Longest subarray length is " + longestSubarrayWithK2(arr2, arr2.length, 6));

        System.out.println("Longest subarray length is " + longestSubarrayWithK3(arr2, arr2.length, 6));
    }
}
