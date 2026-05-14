package arrays.easy;

public class linearSearch {
    // Given an array, and an element num the task is to find if num is present in
    // the given array or not. If present print the index of the element or print
    // -1.
    public static int search(int[] arr, int n, int num) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };
        int a = search(arr1, arr1.length, 9);
        System.out.println("Linear search: " + a);
    }
}
