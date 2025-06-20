package ArraysProblems.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(6, 5, 1, 6, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(2, 8, 0, 7, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 4, 0, 6, 2)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 6, 3, 7, 5)));
        //matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size(); // row size ith
        int m = matrix.get(0).size(); // col size jth

        System.out.println("The Initial matrix is: ");
        for (ArrayList<Integer> row : matrix) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        int[][] matrixArr = {{0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}};

        System.out.println(Arrays.toString(zeroMatrixArray(matrixArr)));

        //ArrayList<ArrayList<Integer>> ans = zeroMatrixBrute(matrix, n, m);
        //ArrayList<ArrayList<Integer>> ans = zeroMatrixBetter(matrix, n, m);
        ArrayList<ArrayList<Integer>> ans = zeroMatrixOptimal(matrix, n, m);


        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static int[][] zeroMatrixArray(int[][] matrixArr) {
        int col0 = 1;
        int n = matrixArr.length;
        int m = matrixArr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrixArr[i][j] == 0) {
                    // mark ith row
                    matrixArr[i][0] = 0;
                    // mark jth col
                    if (j != 0) {
                        matrixArr[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrixArr[i][j] != 0) {
                    // check for col & row:
                    if (matrixArr[i][0] == 0 || matrixArr[0][j] == 0) {
                        matrixArr[i][j] = 0;
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrixArr[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrixArr[0][j] = 0;
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrixArr[i][0] = 0;
            }
        }

        return matrixArr;
    }

    private static ArrayList<ArrayList<Integer>> zeroMatrixOptimal(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // We can't reduce time complexity much, but
        // we will try to optimize space complexity

        // we will use 1st row and 1st col to store traverses instead of creating a new one
        // as for the first element we can't use same index so we will have a col0 variable to store
        // first element of col
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark ith row
                    matrix.get(i).set(0, 0);
                    // mark jth col
                    if (j != 0) {
                        matrix.get(0).set(j, 0);
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    // check for col & row:
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        //step 3: Finally mark the 1st col & then 1st row:
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }

    // We will take two extra arrays with col and row to mark rows and cols traces with 0
    private static ArrayList<ArrayList<Integer>> zeroMatrixBetter(ArrayList<ArrayList<Integer>> matrix, int n,
                                                                  int m) {
        int[] rows = new int[n];
        int[] cols = new int[m];

        // 1. traverse through the matrix to mark rows and cols into respective arrays
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    rows[i] = 1;
                    cols[i] = 1;
                }
            }
        }

        // loop through the matrix again and check if row or col is marked as 1
        // mark index to 0 if it not 0 already
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    private static ArrayList<ArrayList<Integer>> zeroMatrixBrute(ArrayList<ArrayList<Integer>> matrix, int n,
                                                                 int m) {
        // Brute Force Approach
        // using Loops TC -> O(N^3)


        // mark row/col with -1 if it has 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }

        // now make all -1 row and col with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    private static void markCol(ArrayList<ArrayList<Integer>> matrix, int j) {
        // set all non-zero elements as -1 in the col j:
        for (int i = 0; i < matrix.size(); i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    private static void markRow(ArrayList<ArrayList<Integer>> matrix, int i) {
        // set all non-zero elements as -1 in the row i:
        for (int j = 0; j < matrix.get(0).size(); j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }
}
