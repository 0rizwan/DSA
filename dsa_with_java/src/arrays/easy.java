package arrays;

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

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };
        int max = findLargestElement(arr1, arr1.length);
        System.out.println("The largest element in the array is: " + max);

    }
}
