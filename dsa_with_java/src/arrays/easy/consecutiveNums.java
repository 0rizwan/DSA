package arrays.easy;

public class consecutiveNums {
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

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 0, 1 };
        int consecutiveNum = findMaxConsecutiveOnes(arr, arr.length);
        System.out.println("Most consecutive num is: " + consecutiveNum);
    }
}
