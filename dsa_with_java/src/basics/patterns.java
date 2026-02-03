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

    public static void main(String[] args) {
        pattern1(4);
        pattern2(5);
        pattern3(4);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(7);
        pattern8(7);
        pattern9(10);
    }
}
