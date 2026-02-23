package basics;

public class basic_recursion {
    // Print Name N times using Recursion
    public static void printNtimes(String name, int n) {
        if (n == 0)
            return;
        System.out.println(name);
        printNtimes(name, n - 1);
    }

    public static void print1toN(int n) {
        if (n == 0)
            return;
        print1toN(n - 1);
        System.out.println(n);
    }

    // Given a number ‘N’, find out the sum of the first N natural numbers
    public static int sumOfN(int n) {
        if (n == 0)
            return 0;
        return n + sumOfN(n - 1);
    }

    public static int factorialOfN(int n) {
        if (n == 0)
            return 1;
        return n * factorialOfN(n - 1);
    }

    // ********** Reverse a given Array **********
    // Using for loop
    public static int[] revArr(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Using recursion or one pointer
    public static void revArr2(int i, int[] arr, int n) {
        if (i >= n / 2)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        revArr2(i + 1, arr, n);
    }

    // Using two pointers
    public static void revArr3(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }

    // isPalindrome string
    static public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters on the left side
            if (!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            // Skip non-alphanumeric characters on the right side
            else if (!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            // If characters are different, it's not a palindrome
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printNtimes("Hello", 5);
        print1toN(5);
        int a = sumOfN(6);
        System.out.println(a);
        factorialOfN(5);

        int[] arr = { 9, 3, 5, 1, 2 };
        revArr(arr);

        int[] arr2 = { 1, 2, 3, 4, 5 };
        revArr2(0, arr2, arr2.length);

        revArr3(arr);
        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);
    }
}
