package arrays.easy;

public class removeDuplicates {
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
    
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,5};
        int res = removeDuplicate(arr);
        System.out.println(res);
    }
}
