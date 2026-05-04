package arrays.medium;

// Stock Buy And Sell
// Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day. 
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class stockBuyNSell {

    // Brute force approach -
    public static int stockbuySell(int[] arr, int n) {
        int maxProfit = 0;
        for (int i = 0; i < n - 1; i++) {
            int profit = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    profit = arr[j] - arr[i];
                }
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    // Optimal approach -
    public static int stockbuySell2(int[] arr, int n) {
        int maxProfit = 0;
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            int profit = 0;
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else {
                profit = arr[i] - smallest;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stockbuySell(arr, arr.length));

        System.out.println(stockbuySell2(arr, arr.length));
    }
}
