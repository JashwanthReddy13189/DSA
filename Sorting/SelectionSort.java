package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        SelectionSorting(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectionSorting(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i+1; j <= n - 1; j++) {
                if (j > 0 && (arr[j] < arr[minIndex])) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void SelectionSortingRecursive(int[] arr, int n, int i) {
        if (i >= n) {
            return;
        }
        int minIndex = i;
    }
}
