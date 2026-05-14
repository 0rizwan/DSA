package arrays.easy;

import java.util.Arrays;

public class rotateArray {
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

    public static void main(String[] args) {
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array before: " + Arrays.toString(arr2));
        rotateRight(arr2, arr2.length, 2);
        System.out.println("Array after : " + Arrays.toString(arr2));

        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArrByK(arr3, arr3.length, 2, "right");
        System.out.println(Arrays.toString(arr2));
    }
}
