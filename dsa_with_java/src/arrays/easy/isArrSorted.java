package arrays.easy;

public class isArrSorted {
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

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };

        boolean x = isSorted(arr1, arr1.length);
        System.out.println("Is array sorted - " + x);
    }
}
