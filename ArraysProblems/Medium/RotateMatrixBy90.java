package ArraysProblems.Medium;

import java.util.Arrays;

public class RotateMatrixBy90 {
    public static void main(String args[]) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //System.out.println(Arrays.deepToString(rotateImageBrute(matrix)));
        System.out.println(Arrays.deepToString(rotateImageOptimal(matrix)));
    }

    private static int[][] rotateImageOptimal(int[][] matrix) {

        int n = matrix.length;

        // step 1 : transpose matrix
        for (int i=0; i<n-1;i++) {
            for (int j=i+1; j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i=0; i<n;i++) {
            for (int j=0; j<n/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

        return matrix;
    }

    // Brute Force Approach
    private static int[][] rotateImageBrute(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][n - 1 - i] = matrix[i][j];
            }
        }
        return ans;
    }
}
