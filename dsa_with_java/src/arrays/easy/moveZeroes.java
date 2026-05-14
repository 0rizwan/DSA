package arrays.easy;

import java.util.Arrays;

public class moveZeroes {
    // You are given an array of integers, your task is to move all the zeros in the
    // array to the end of the array and move non-negative integers to the front by
    // maintaining their order.
    // Brute force approach - TC: O(n), SC: O(n)
    public static void moveZeroes1(int[] arr, int n) {
        if (n == 0)
            return;
        int[] temp = new int[n];

        int index = 0;

        // Step 1: copy non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Step 2: fill remaining with zeros
        for (int i = index; i < n; i++) {
            temp[i] = 0;
        }

        // Step 3: copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Optimal approach - TC: O(n), SC: O(1)
    public static void moveZeroes2(int[] arr, int n) {
        int j = -1;

        // Find the first zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        // If no zero found, return
        if (j == -1)
            return;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 0, 6, 7 };
        moveZeroes1(arr, arr.length);
        System.out.println("Move zeroes to end - " + Arrays.toString(arr));
    }
}
