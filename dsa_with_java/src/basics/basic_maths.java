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
    // Brute force approach - O(min(N1, N2))
    public static int findGcd(int N1, int N2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(N1, N2); i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of two num is: " + gcd);
        return gcd;
    }

    // Optimal approach - O(log(min(a, b)))
    public static int findGcdEuclidean(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0) {
            System.out.println("GCD is: " + b);
            return b;
        }
        System.out.println("GCD is: " + a);
        return a;
    }

    // Given an integer N, return true it is an Armstrong number otherwise return
    // false.
    // An Amrstrong number is a number that is equal to the sum of its own digits
    // each raised to the power of the number of digits.
    public static boolean isArmstrong(int num) {
        int n = num;
        int digits = (int) Math.log10(n) + 1;
        int sum = 0;
        while (n != 0) {
            sum = sum + (int) Math.pow(n % 10, digits);
            n = n / 10;
        }
        return sum == n;
    }

    // Given an integer N, check whether it is prime or not. A prime number is a
    // number that is only divisible by 1 and itself and the total number of
    // divisors is 2
    public static boolean isPrime(int num) {
        int divisors = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors++;
                if (num / i != i) {
                    divisors++;
                }
            }
        }
        return divisors == 2;
    }

    // Fibonacci series with diffrent approaches
    // time - O(n) + O(n); space - O(n)
    static public void fibonacci(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println("0 1");
            return;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fib[i]);
        }
    }

    // time - O(n); space - O(1)
    static public void fibonacci2(int n) {
        if (n >= 1) {
            System.out.print(" 0");
        }
        if (n >= 2) {
            System.out.print(" 1");
        }

        int prev2 = 0;
        int prev1 = 1;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
            System.out.print(" " + current);
        }
    }

    // time - O(n); space - O(1)
    static public void fibonacci3(int n) {
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(prev2 + " ");
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
    }

    public static void main(String[] args) {
        // extractDigits(5431);
        // countDigits(4565);
        // reverseIntDigits(46215);
        // isPalindrome(45544);
        // getDivisors(36);
        // findGcd(13, 11);
        findGcdEuclidean(100, 400);
        isArmstrong(123);
        isPrime(13);
        fibonacci(8);
        fibonacci2(8);
        fibonacci3(8);
    }
}
