package basics;
import java.util.Scanner;

public class language_fundamentals {

    // ---------------- INPUT / OUTPUT ----------------
    static void inputOutputDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
    }

    // ---------------- DATA TYPES ----------------
    static void dataTypesDemo() {
        int a = 10;
        double b = 5.5;
        char c = 'A';
        String d = "Hello";
        boolean isJavaFun = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(isJavaFun);
    }

    // ---------------- IF ELSE ----------------
    static void ifElseDemo() {
        int n = 7;
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // ---------------- SWITCH CASE ----------------
    static void switchCaseDemo() {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    // ---------------- FOR LOOP ----------------
    static void forLoopDemo() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // ---------------- WHILE LOOP ----------------
    static void whileLoopDemo() {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // ---------------- FUNCTIONS ----------------
    static int add(int a, int b) {
        return a + b;
    }

    static void functionsDemo() {
        int sum = add(3, 4);
        System.out.println("Sum: " + sum);
    }

    // ---------------- ARRAYS ----------------
    static void arraysIntroDemo() {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ---------------- STRINGS ----------------
    static void stringsIntroDemo() {
        String s = "Java";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase());
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        inputOutputDemo();
        dataTypesDemo();
        ifElseDemo();
        switchCaseDemo();
        forLoopDemo();
        whileLoopDemo();
        functionsDemo();
        arraysIntroDemo();
        stringsIntroDemo();
    }
}
