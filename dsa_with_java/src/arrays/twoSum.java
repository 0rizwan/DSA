package arrays;

import java.util.Arrays;
import java.util.HashMap;

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

    // Better appraoch using HashMap - TC - O(n), SC - O(n)
    public static String isTwoSum2(int[] arr, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int remainingNum = target - arr[i];
            if (map.containsKey(remainingNum)) {
                return "Yes";
            }
            map.put(arr[i], i);
        }
        return "No";
    }

    public static int[] twoSumIndices2(int[] arr, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int remainingNum = target - arr[i];
            if (map.containsKey(remainingNum)) {
                return new int[] { map.get(remainingNum), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    // Optimal only for Yes or No variant not for indices.
    // TC - O(n log n) SC - O(1)
    public static String isTwoSum3(int[] arr, int n, int target){
        int left = 0; 
        int right = n - 1;
        Arrays.sort(arr);

        while(left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return "Yes";
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        System.out.println(isTwoSum(arr, arr.length, 7));
        System.out.println(Arrays.toString(twoSumIndices(arr, arr.length, 7)));
        
        System.out.println(isTwoSum2(arr, arr.length, 18));
        System.out.println(Arrays.toString(twoSumIndices2(arr, arr.length, 7)));

        System.out.println(isTwoSum3(arr, arr.length, 13));
    }
}
