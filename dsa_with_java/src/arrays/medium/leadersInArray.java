package arrays.medium;

import java.util.ArrayList;

// Leaders in an Array - 
// Given an array of integers, find all the leaders in the array.
// An element is considered a leader if it is strictly greater than all the elements to its right.
// The rightmost element is always a leader since there are no elements to its right.

public class leadersInArray {
    // Brute force approach using two nested loops -
    // TC - O(n*n), SC - O(k) 
    // for worst case the space can be n if all the elements are leaders eg. {5,4,3,2,1} 
    public static void leadersInArr(int[] arr, int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader)
                leaders.add(arr[i]);
        }
        System.out.println("Leaders in Array 1 : " + leaders);
    }

    // Optimal approach - 
    // TC - O(n), SC - O(k) 
    // for worst case the space can be n if all the elements are leaders eg. {5,4,3,2,1} 
    public static void leadersInArr2(int[] arr, int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[n - 1];
        leaders.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.println("Leaders in Array 2 : " + leaders);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 13, 0, 3, 6 };
        leadersInArr(arr, arr.length);

        leadersInArr2(arr, arr.length);
    }
}
