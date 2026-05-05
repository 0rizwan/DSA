package arrays.medium;

import java.util.Arrays;

// Set Matrix Zero
// Problem Statement: Given a matrix if an element in the matrix is 0 then 
// you will have to set its entire column and row to 0 and then return the matrix..
public class setMatrixZero {
    // Brute force appraoch -
    // TC - O(m * n * (m + n)), SC - O(1)
    public static void setZeroesMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // filling the rows with -1
                    for (int col = 0; col < cols; col++) {
                        if (matrix[i][col] != 0) {
                            matrix[i][col] = -1;
                        }
                    }
                    // filling the cols with -1
                    for (int row = 0; row < rows; row++) {
                        if (matrix[row][j] != 0) {
                            matrix[row][j] = -1;
                        }
                    }
                }
            }
        }
        // filling the -1 with 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void setZeroesMatrix2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 1: mark rows and columns that contain 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(rows));
        System.out.println(Arrays.toString(cols));
        // Step 2: set elements to 0 based on marks
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 } };

        setZeroesMatrix(matrix);
        setZeroesMatrix2(matrix);
    }
}
