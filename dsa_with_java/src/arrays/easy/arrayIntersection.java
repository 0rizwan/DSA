package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class arrayIntersection {
    // Intersection of two sorted arrays
    // Brute force approach -
    public static List<Integer> findIntersection(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visitedArr = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j] && visitedArr[j] == 0) {
                    ans.add(arr1[i]);
                    visitedArr[j] = 1;
                    break;
                }
                if (arr2[j] > arr1[i])
                    break;
            }
        }
        return ans;
    }

    // Optimal approach using two pointers -
    // TC - O(m + n) SP - O(k)
    public static List<Integer> findIntersection2(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            System.out.println(i + " " + j);
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4 };
        int[] arr2 = { 2, 3, 4, 5, 6, 6 };

        List<Integer> intersectionArr = findIntersection(arr1, arr2, arr1.length, arr2.length);
        System.out.println(intersectionArr);

        List<Integer> intersectionArr2 = findIntersection2(arr1, arr2, arr1.length, arr2.length);
        System.out.println(intersectionArr2);
    }
}
