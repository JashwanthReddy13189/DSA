package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        InsertionSorting(arr, n);
        System.out.println(Arrays.toString(arr));
        int i = 0;
        InsertionSortingRecursive(arr, n, i);
        System.out.println(Arrays.toString(arr));
    }

    private static void InsertionSorting(int[] arr, int n) {
        System.out.println("Insertion Sorting");
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    private static void InsertionSortingRecursive(int[] arr, int n, int index) {
        System.out.println("Insertion Sorting Recursive");
        if (index == n) {
            return;
        }
        int j = index;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        InsertionSortingRecursive(arr, n, index + 1);
    }
}
