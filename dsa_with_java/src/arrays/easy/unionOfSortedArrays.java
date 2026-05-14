package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class unionOfSortedArrays {
    // Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of
    // two sorted arrays.
    // The union of two arrays can be defined as the common and distinct elements in
    // the two arrays.
    // Using Set -
    // TC - O((m+n)log(m+n)) SC - O(m + n)
    public static int[] findUnion(int[] arr1, int[] arr2, int m, int n) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            set.add(arr2[i]);
        }
        int[] unionArr = new int[set.size()];
        int index = 0;
        for (int item : set) {
            unionArr[index] = item;
            index++;
        }
        return unionArr;
    }

    // Using Map -
    public static List<Integer> findUnion2(int[] arr1, int[] arr2, int m, int n) {
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        }
        List<Integer> unionList = new ArrayList<>();
        for (int key : freq.keySet()) {
            unionList.add(key);
        }
        return unionList;
    }

    // Optimal solution using two pointers -
    // TC - O(m + n) SC - O(m + n)
    public static List<Integer> findUnion3(int[] arr1, int[] arr2, int m, int n) {
        ArrayList<Integer> unionArr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
                    unionArr.add(arr2[j]);
                }
                j++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                    unionArr.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
                unionArr.add(arr1[i]);
            }
            i++;
        }
        while (j < n) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
                unionArr.add(arr2[j]);
            }
            j++;
        }
        return unionArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4 };
        int[] arr2 = { 2, 3, 4, 5, 6, 6 };
        int[] unionList = findUnion(arr1, arr2, arr1.length, arr2.length);
        findUnion2(arr1, arr2, arr1.length, arr2.length);
        System.out.println("Union of two arrays " + Arrays.toString(unionList));

        List<Integer> unionArr = findUnion3(arr1, arr2, arr1.length, arr2.length);
        System.out.println(unionArr);
    }

}
