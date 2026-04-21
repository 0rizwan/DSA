package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// next_permutation : find next lexicographically greater permutation

// Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the 
// given array into the lexicographically next greater permutation of numbers.

// If such an arrangement is not possible, it must rearrange to the 
// lowest possible order (i.e., sorted in ascending order).

public class nextPermutation {
    // Generating permutations for given array of nums
    static void generate(int[] arr, int index) {
        // Base case
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            generate(arr, index + 1);
            swap(arr, i, index);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Brute force approach
    // TC - O(O(n!*n)) SC - O(n!)
    public static List<Integer> nextPermutation1(int[] nums) {

        // Step 1: Store all permutations
        List<List<Integer>> all = new ArrayList<>();

        // Step 2: Generate permutations
        permute(nums, 0, all);

        // Step 3: Sort lexicographically (custom comparator needed)
        Collections.sort(all, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != b.get(i)) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Step 4: Convert input array to list
        List<Integer> current = new ArrayList<>();
        for (int num : nums) {
            current.add(num);
        }

        // Step 5: Find current permutation and return next
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).equals(current)) {

                // If last permutation → return first
                if (i == all.size() - 1) {
                    return all.get(0);
                }

                // Else return next
                return all.get(i + 1);
            }
        }

        return current;
    }

    // Backtracking to generate permutations
    private static void permute(int[] nums, int start, List<List<Integer>> all) {
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            all.add(temp);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            permute(nums, start + 1, all);
            swap(nums, i, start); // backtrack
        }
    }

    

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        generate(arr, 0);

        List<Integer> result = nextPermutation1(arr);
        System.out.println("Next permutation is: " + result);
    }
}
