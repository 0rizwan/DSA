package arrays;

import java.util.Arrays;

// Sort an array of 0s, 1s and 2s
// Problem Statement:Given an array nums consisting of only 0,1,or 2. Sort the array in non-decreasing order.
// The sorting must be done in-place, without making a copy of the original array.

public class sortZeroOneTwo {
    // Brute force approach using nested loops
    // TC - O(n*n) SC - O(1)
    public static void sortZeroOneTwo1(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Better approach using counting and updating
    // TC - O(n) SC - O(1)
    public static void sortZeroOneTwo2(int[] arr, int n) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                cnt0++;
            else if (arr[i] == 1)
                cnt1++;
            else
                cnt2++;
        }
        for (int i = 0; i < cnt0; i++) {
            arr[i] = 0;
        }
        for (int i = cnt0; i < cnt1 + cnt1; i++) {
            arr[i] = 1;
        }
        for (int i = cnt0 + cnt1; i < n; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Optimal approach using Dutch flag algorithm
    // TC - O(n) SC - O(1)
    public static void sortZeroOneTwo3(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0 };
        sortZeroOneTwo1(arr, arr.length);

        int[] arr2 = { 2, 1, 0, 2, 1, 0 };
        sortZeroOneTwo2(arr2, arr2.length);

        int[] arr3 = { 0, 0, 1, 1, 1 };
        sortZeroOneTwo3(arr3, arr3.length);
    }
}
