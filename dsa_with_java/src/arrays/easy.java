package arrays;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };
        int max = findLargestElement(arr1, arr1.length);
        System.out.println("The largest element in the array is: " + max);

        int secondSmallest = secondSmallest(arr1, arr1.length);
        int secondLargest = secondLargest(arr1, arr1.length);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
        System.out.println("The second largest element in the array is: " + secondLargest);

        boolean x = isSorted(arr1, arr1.length);
        System.out.println(x);

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array before: " + Arrays.toString(arr2));
        rotateRight(arr2, arr2.length, 2);
        System.out.println("Array after : " + Arrays.toString(arr2));

        int[] arr3 = {1,2,3,4,5,6,7};
        rotateArrByK(arr3, arr3.length, 2, "right");
        System.out.println(Arrays.toString(arr2));

        int a = linearSearch(arr1, arr1.length, 9);
        System.out.println(a);
    }
}
