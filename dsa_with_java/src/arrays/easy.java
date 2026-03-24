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

    // Given an integer array nums, rotate the array to the left by one.
    // Note: There is no need to return anything, just modify the given array.
    public static void leftRotate(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Given an integer array sorted in non-decreasing order, remove the duplicates
    // in place such that each unique element appears only once. The relative order
    // of the elements should be kept the same.

    // If there are k elements after removing the duplicates, then the first k
    // elements of the array should hold the final result. It does not matter what
    // you leave beyond the first k elements.
    public static int removeDuplicate(int[] arr) {
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };
        int max = findLargestElement(arr1, arr1.length);
        System.out.println("The largest element in the array is: " + max);

        int secondSmallest = secondSmallest(arr1, arr1.length);
        int secondLargest = secondLargest(arr1, arr1.length);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
        System.out.println("The second largest element in the array is: " + secondLargest);

    }
}
