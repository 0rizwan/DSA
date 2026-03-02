package basics;

import java.util.HashMap;

public class hashing {
    static public void findFrequency(int q, int[] arr) {
        int[] hash = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println(hash[q]);
    }

    static public void strFrequency(char q, String str) {
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)] += 1;
        }
        System.out.println(hash[q]);
    }

    static public void frequencyInArrays(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int maxFreq = 0, minFreq = n;
        int maxElem = 0, minElem = 0;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxElem = element;
            }
            if (count < minFreq) {
                minFreq = count;
                minElem = element;
            }
            System.out.println(entry.getKey() + " >> " + entry.getValue());
        }
        System.out.println("The highest frequency element is: " + maxElem);
        System.out.println("The lowest frequency element is: " + minElem);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 1, 2, 4, 3 };
        findFrequency(3, arr);
        strFrequency(',', "hello, this is world.");
        frequencyInArrays(arr, arr.length);
    }
}
