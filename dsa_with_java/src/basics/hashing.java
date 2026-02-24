package basics;

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

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 1, 2, 4, 3 };
        findFrequency(3, arr);
        strFrequency(',', "hello, this is world.");
    }
}
