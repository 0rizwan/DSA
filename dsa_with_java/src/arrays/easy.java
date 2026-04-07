package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class easy {
    // Given an array, we have to find the largest element in the array.
    public static int findLargestElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Given an array, find the second smallest and second largest element in the
    // array. Print ‘-1’ in the event that either of them doesn’t exist.
    public static int secondSmallest(int[] arr, int n) {
        if (n < 2)
            return -1;

        int small = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                secondSmallest = small;
                small = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != small) {
                secondSmallest = arr[i];
            }
        }

        // If no second smallest found
        if (secondSmallest == Integer.MAX_VALUE) {
            return -1;
        }

        return secondSmallest;
    }

    public static int secondLargest(int[] arr, int n) {
        if (n < 2)
            return -1;

        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                secondLargest = large;
                large = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != large) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
            return -1;

        return secondLargest;
    }

    // Given an array of size n, write a program to check if the given array is
    // sorted in (ascending / Increasing / Non-decreasing) order or not. If the
    // array is sorted then return True, Else return False.
    public static boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Given an integer array sorted in non-decreasing order, remove the duplicates
    // in place such that each unique element appears only once. The relative order
    // of the elements should be kept the same.

    // If there are k elements after removing the duplicates, then the first k
    // elements of the array should hold the final result. It does not matter what
    // you leave beyond the first k elements.
    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    // Given an array of integers, rotating array of elements by k elements either
    // left or right.
    // Note: There is no need to return anything, just modify the given array.
    public static void leftRotateByOne(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;
        int[] temp = Arrays.copyOfRange(arr, 0, k);

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void rotateRight(int[] arr, int n, int k) {
        if (n == 0)
            return;
        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, n - k, n);
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Optimal approach to rotate an array by k places.
    public static void rotateArrByK(int[] arr, int n, int k, String direction) {
        if (n == 0 || k == 0)
            return;
        k = k % n;

        if (direction.equals("left")) {
            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, n - 1);
            reverseArray(arr, 0, n - 1);
        } else if (direction.equals("right")) {
            reverseArray(arr, n - k, n - 1);
            reverseArray(arr, 0, n - k - 1);
            reverseArray(arr, 0, n - 1);
        }
    }

    // Given an array, and an element num the task is to find if num is present in
    // the given array or not. If present print the index of the element or print
    // -1.
    public static int linearSearch(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // You are given an array of integers, your task is to move all the zeros in the
    // array to the end of the array and move non-negative integers to the front by
    // maintaining their order.
    // Brute force approach - TC: O(n), SC: O(n)
    public static void moveZeroes(int[] arr, int n) {
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

    // Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of
    // two sorted arrays.
    // The union of two arrays can be defined as the common and distinct elements in
    // the two arrays.
    // Using Set -
    // TC - O((m+n)log(m+n)) SC - O(m + n)
    public static int[] findUnion(int[] arr1, int[] arr2, int m, int n) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            set.add(arr2[i]);
        }
        int[] unionArr = new int[set.size()];
        int index = 0;
        for (int item : set) {
            unionArr[index] = item;
            index++;
        }
        return unionArr;
    }

    // Using Map -
    public static List<Integer> findUnion2(int[] arr1, int[] arr2, int m, int n) {
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }
        List<Integer> unionList = new ArrayList<>();
        for (int key : freq.keySet()) {
            unionList.add(key);
        }
        return unionList;
    }

    // Optimal solution using two pointers -
    // TC - O(m + n) SC - O(m + n)
    public static List<Integer> findUnion3(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> unionArr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
                    unionArr.add(arr2[j]);
                }
                j++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                unionArr.add(arr1[i]);
            }
            i++;
        }
        while (j < n) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
                unionArr.add(arr2[j]);
            }
            j++;
        }
        return unionArr;
    }

    // Intersection of two sorted arrays
    // Brute force approach -
    public static List<Integer> findIntersection(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visitedArr = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j] && visitedArr[j] == 0) {
                    ans.add(arr1[i]);
                    visitedArr[j] = 1;
                    break;
                }
                if (arr2[j] > arr1[i])
                    break;
            }
        }
        return ans;
    }

    // Optimal approach using two pointers -
    // TC - O(m + n) SP - O(k)
    public static List<Integer> findIntersection2(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            System.out.println(i + " " + j);
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    // Find the Missing Number from an array of distinct integers
    // TC - O(n) SC - O(1)
    public static int findMissingNumber(int[] arr) {
        int actualSum = 0;
        int expectedSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            expectedSum += i;
        }
        return expectedSum - actualSum;
    }

    // Given an array that contains only 1 and 0 return the count of maximum
    // consecutive ones in the array..
    public static int findMaxConsecutiveOnes(int[] arr, int n) {
        int freq = 0;
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                freq++;
                if (freq > maxFreq) {
                    maxFreq = freq;
                }
            } else {
                freq = 0;
            }
        }
        return maxFreq;
    }

    // Given a non-empty array of integers arr, every element appears twice except
    // for one. Find that single one.
    // Brute force approach using nested loops - TC - O(n*n) SC - O(1)
    public static int getSingleElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count == 2)
                        break;
                }
            }
            if (count == 1)
                return arr[i];
        }
        return -1;
    }

    // Optimal approach using XOR - TC - O(n) SC - O(1) 
    public static int getSingleElement2(int[] arr, int n) {
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };
        int max = findLargestElement(arr1, arr1.length);
        System.out.println("The largest element in the array is: " + max);

        int secondSmallest = secondSmallest(arr1, arr1.length);
        int secondLargest = secondLargest(arr1, arr1.length);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
        System.out.println("The second largest element in the array is: " + secondLargest);

        boolean x = isSorted(arr1, arr1.length);
        System.out.println("Is array sorted - " + x);

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array before: " + Arrays.toString(arr2));
        rotateRight(arr2, arr2.length, 2);
        System.out.println("Array after : " + Arrays.toString(arr2));

        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArrByK(arr3, arr3.length, 2, "right");
        System.out.println(Arrays.toString(arr2));

        int a = linearSearch(arr1, arr1.length, 9);
        System.out.println("Linear search: " + a);

        int[] arr4 = { 1, 2, 0, 4, 0, 6, 7 };
        moveZeroes(arr4, arr4.length);
        System.out.println("Move zeroes to end - " + Arrays.toString(arr4));

        int[] arr5 = { 1, 1, 2, 3, 4 };
        int[] arr6 = { 2, 3, 4, 5, 6, 6 };
        int[] unionList = findUnion(arr5, arr6, arr5.length, arr6.length);
        findUnion2(arr5, arr6, arr5.length, arr6.length);
        System.out.println("Union of two arrays " + Arrays.toString(unionList));

        List<Integer> unionArr = findUnion3(arr5, arr6, arr5.length, arr6.length);
        System.out.println(unionArr);

        List<Integer> intersectionArr = findIntersection(arr5, arr6, arr5.length, arr6.length);
        System.out.println(intersectionArr);

        List<Integer> intersectionArr2 = findIntersection2(arr5, arr6, arr5.length, arr6.length);
        System.out.println(intersectionArr2);

        int[] arr7 = { 1, 3, 4 };
        int missingNum = findMissingNumber(arr7);
        System.out.println("Missing number is: " + missingNum);

        int[] arr8 = { 1, 0, 1, 1, 0, 1 };
        int consecutiveNum = findMaxConsecutiveOnes(arr8, arr8.length);
        System.out.println("Most consecutive num is: " + consecutiveNum);

        int[] arr9 = { 4, 1, 2, 1, 2 };
        int singleElem = getSingleElement2(arr9, arr9.length);
        System.out.println("The single element is: " + singleElem);
    }
}
