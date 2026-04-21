package arrays.medium;

import java.util.ArrayList;

// Rearrange Array Elements by Sign

// Problem Statement:There’s an array ‘A’ of size ‘N’ with an equal number of positive 
// and negative elements. Without altering the relative order of positive and negative elements,
// you must return an array of alternately positive and negative values.
public class rearrangeBySign {

    // Brute force approach using two arrays -
    // TC - O(n + n/2), SC - O(n/2 + n/2 = n)
    public static int[] rearrangeBySign1(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        return arr;
    }

    // Optimal approach - Its just slightly better
    // TC - O(n), SC - O(n)
    public static int[] rearrangeBySign2(int[] arr, int n) {
        int[] ans = new int[n];
        int posInd = 0;
        int negInd = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[posInd] = arr[i];
                posInd += 2;
            } else {
                ans[negInd] = arr[i];
                negInd += 2;
            }
        }
        return ans;
    }

    // If positives and negatives number are not equal this is the
    // only solution for that.
    // TC - O(n + n = n), SC = O(n)
    public static int[] rearrangeBySign3(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Step 1: Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        // Step 2: Place positives at even indices and negatives at odd indices
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -4, -5, -9 };
        int[] res = rearrangeBySign1(arr, arr.length);
        System.out.println(res);

        int[] res2 = rearrangeBySign2(arr, arr.length);
        System.out.println(res2);

        int[] arr2 = { -1, -2, -5, -4, 6, 9 };
        int[] res3 = rearrangeBySign3(arr2, arr2.length);
        System.out.println(res3);
    }
}
