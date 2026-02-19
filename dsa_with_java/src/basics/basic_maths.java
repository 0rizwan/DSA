package basics;

public class basic_maths {
    // accessing all the digits of number
    public static void extractDigits(int n) {
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            System.out.println("digit " + lastDigit);
            n = n / 10;
        }
    }

    // Given an integer N, return the number of digits in N
    public static int countDigits(int n) {
        // approach 1
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        // Best approach
        // int digits = (n == 0) ? 1 : (int) Math.log10(Math.abs(n)) + 1;

        System.out.println("Total digits: " + count);
        return count;
    }

    // Given an integer N return the reverse of the given number
    public static int reverseIntDigits(int n) {
        int reverseNum = 0;
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println("After reverse: " + reverseNum);
        return reverseNum;
    }

    public static void main(String[] args) {
        extractDigits(5431);
        countDigits(4565);
        reverseIntDigits(46215);
    }
}
