package arrays.easy;

public class missingNumber {
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

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4 };
        int missingNum = findMissingNumber(arr);
        System.out.println("Missing number is: " + missingNum);
    }
}
