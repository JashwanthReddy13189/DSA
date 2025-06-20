package ArraysProblems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println(spriralMatrix(matrix, n, m));
    }

    private static List<Integer> spriralMatrix(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;
        int[] res = new int[rows * cols];
        int index = 0;
        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right) {
            // add left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                res[index] = matrix[top][i];
                index++;
            }
            top++;

            // add top to bottom elements
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
                res[index] = matrix[i][right];
                index++;
            }
            right--;

            // add right to left elements and also
            // check whether top <= bottom when left and right
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                    res[index] = matrix[bottom][i];
                    index++;
                }
                bottom--;
            }

            // add bottom to top elements and also
            // check whether left <= right
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                    res[index] = matrix[i][left];
                    index++;
                }
                left++;
            }
        }
        System.out.println(Arrays.toString(res));
        return result;
    }
}
