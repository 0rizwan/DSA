package basics;

public class sorting_algos {
    // Repeatedly find the smallest element from the unsorted part and move it to
    // the front.
    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Repeatedly swap adjacent elements if they are in the wrong order until the
    // list is sorted.
    public static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // Move through the array and keep swapping the current element left until it
    // reaches its correct place in the already sorted part
    public static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 81, 5, 24, 4, 9 };
        selectionSort(arr, arr.length);
        bubbleSort(arr, arr.length);
        insertionSort(arr, arr.length);
    }
}
