package arrays.easy;

public class findSingleElement {
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
        int[] arr = { 4, 1, 2, 1, 2 };
        int singleElem = getSingleElement2(arr, arr.length);
        System.out.println("The single element is: " + singleElem);
    }
}
