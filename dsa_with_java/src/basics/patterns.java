package basics;

public class patterns {
    // * * * *
    // * * * *
    // * * * *
    // * * * *
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    // *
    // * *
    // * * *
    // * * * *
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    // * * * *
    // * * *
    // * *
    // *
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    // 1
    // 22
    // 333
    // 4444
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    // 1
    // 12
    // 123
    // 1234
    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // 1234
    // 123
    // 12
    // 1
    static void pattern6(int n) {
        // method 1
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        // method 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // ----*----
    // ---***---
    // --*****--
    // -*******-
    // *********
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // *********
    // -*******-
    // --*****--
    // ---***---
    // ----*----
    static void pattern8(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - i; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // ---*---
    // --***--
    // -*****-
    // *******
    // *******
    // -*****-
    // --***--
    // ---*---
    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - i; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // 1
    // 01
    // 101
    // 0101
    // 10101
    static void pattern10(int n) {
        int num;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                num = 0;
            else
                num = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println("");
        }
    }

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    static void pattern11(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println("");
        }
    }

    // E
    // D E
    // C D E
    // B C D E
    // A B C D E
    static void pattern12(int n) {
        // method 1
        int initialVal = 'A' + n - 1;
        for (int i = 0; i < n; i++) {
            int localVal = initialVal;
            for (int j = 0; j <= i; j++) {
                char character = (char) localVal;
                System.out.print(character + " ");
                localVal++;
            }
            initialVal--;
            System.out.println("");
        }

        // method 2
        char initialChar = (char) ('A' + n - 1);
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (initialChar - i); ch <= initialChar; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }

    // ----A----
    // ---ABA---
    // --ABCBA--
    // -ABCDCBA-
    // ABCDEDCBA
    static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            int asciiVal = 65;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                char character = (char) asciiVal;
                System.out.print(character);
                if (k >= i)
                    asciiVal--;
                else
                    asciiVal++;
            }
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    // A
    // BB
    // CCC
    // DDDD
    // EEEEE
    static void pattern14(int n) {
        int asciiVal = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                char character = (char) asciiVal;
                System.out.print(character);
            }
            asciiVal++;
            System.out.println("");
        }
    }

    // ABCDE
    // ABCD
    // ABC
    // AB
    // A
    static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            int asciiVal = 65;
            for (int j = 0; j <= n - i; j++) {
                char character = (char) asciiVal;
                System.out.print(character);
                asciiVal++;
            }
            System.out.println("");
        }
    }

    // A
    // AB
    // ABC
    // ABCD
    // ABCDE
    static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            int asciiVal = 65;
            for (int j = 0; j < i; j++) {
                char character = (char) asciiVal;
                System.out.print(character);
                asciiVal++;
            }
            System.out.println("");
        }
    }

    // 1------1
    // 12----21
    // 123--321
    // 12344321
    static void pattern17(int n) {
        // method 1
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                if (i > j)
                    num++;
            }
            for (int k = 0; k < (n - i - 1) * 2; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print(num);
                num--;
            }
            num = 1;
            System.out.println("");
        }

        // method 2
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            space -= 2;
            System.out.println("");
        }
    }

    // ********
    // ***--***
    // **----**
    // *------*
    // *------*
    // **----**
    // ***--***
    // ********
    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int spaces = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println("");
        }
    }

    // *
    // **
    // ***
    // ****
    // ***
    // **
    // *
    static void pattern19(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // *--------*
    // **------**
    // ***----***
    // ****--****
    // **********
    // ****--****
    // ***----***
    // **------**
    // *--------*
    static void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            // stars
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(5);
        // pattern3(4);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(7);
        // pattern8(7);
        // pattern9(10);
        // pattern10(5);
        // pattern11(5);
        // pattern12(6);
        // pattern13(5);
        // pattern14(5);
        // pattern15(5);
        // pattern16(5);
        // pattern17(5);
        pattern18(4);
        pattern19(5);
        pattern20(5);
    }
}
