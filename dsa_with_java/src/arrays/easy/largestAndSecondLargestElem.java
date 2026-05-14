package arrays.easy;

public class largestAndSecondLargestElem {
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
