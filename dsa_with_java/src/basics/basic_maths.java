package basics;

import java.util.ArrayList;
import java.util.List;

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
        int revNum = 0;
        int digit = 0;
        while (n != 0) {
            digit = n % 10;
            revNum = (revNum * 10) + digit;
            n = n / 10;
        }
        System.out.println("After reverse: " + revNum);
        return revNum;
    }

    // Given an integer N, return true if it is a palindrome else return false.
    public static boolean isPalindrome(int n) {
        int num = n;
        int revNum = 0;
        int digit = 0;

        while (num != 0) {
            digit = num % 10;
            revNum = (revNum * 10) + digit;
            num = num / 10;
        }
        // return n == revNum;
        if (n == revNum) {
            System.out.println("Palindrom");
            return true;
        } else {
            System.out.println("Not palindrome");
            return false;
        }
    }

    // Given an integer N, return all divisors of N
    public static List<Integer> getDivisors(int N) {
        List<Integer> res = new ArrayList<>();

        // Brute force approach - O(N)
        // for(int i = 1; i <= N; i++){
        // if(N % i == 0){
        // res.add(i);
        // }
        // }

        // Optimal approach - O(sqrt(N))
        // i <= Math.sqrt(N) and i * i <= N both are same but same but Math takes lil
        // more time
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                res.add(i);
                if (N / i != i) {
                    res.add(N / i);
                }
            }
        }
        System.out.println(res);
        return res;
    }

    // Given two integers N1 and N2, find their greatest common divisor.
    public static int findGcd(int N1, int N2) {
        // Brute force approach - O(min(N1, N2))
        int gcd = 1;
        for (int i = 1; i <= Math.min(N1, N2); i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of two num is: " + gcd);
        return gcd;
    }

    public static void main(String[] args) {
        // extractDigits(5431);
        // countDigits(4565);
        // reverseIntDigits(46215);
        // isPalindrome(45544);
        getDivisors(36);
        findGcd(13, 11);
    }
}
