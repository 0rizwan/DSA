package arrays.medium;

import java.util.HashMap;
import java.util.Map;

// Find the Majority Element that occurs more than N/2 times
// Problem Statement:Given an integer array nums of size n, return the majority element of the array.
// The majority element of an array is an element that appears more than n/2 times in the array.
// The array is guaranteed to have a majority element.

public class majorityElement {
    // Brute force approach using nested loops -
    // TC - O(n*n) SC - O(1)
    public static int majorityElement1(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            if (freq > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

    // Better approach using HashMap -
    // TC - O(n) SC - O(n)
    public static int majorityElement2(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry);
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // Moore's voting algorithm - 
    // TC - O(n) SC - O(1)
    public static int majorityElement3(int[] arr, int n) {
        int count = 0;
        int elem = -1;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                elem = arr[i];
                count = 1;
            } else if (arr[i] == elem) {
                count++;
            } else {
                count--;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elem) {
                cnt++;
            }
        }
        if (cnt > n / 2) {
            return elem;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4 };
        int a = majorityElement1(arr, arr.length);
        System.out.println(a);

        int b = majorityElement2(arr, arr.length);
        System.out.println(b);

        int c = majorityElement3(arr, arr.length);
        System.out.println(c);
    }
}
