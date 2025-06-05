package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        BubbleSorting(arr, n);
        System.out.println(Arrays.toString(arr));
        BubbleSortingRecursive(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void BubbleSorting(int[] arr, int n) {
        System.out.println("Bubble Sort Called");
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void BubbleSortingRecursive(int[] arr, int n) {
        System.out.println(" Bubble Sorting Recursion Called");
        // Base Case
        if (n == 1) {
            return;
        }
        int didSwap = 0;
        // Sorting logic
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                didSwap++;
            }
        }
        // if no swap happens
        if (didSwap == 0) {
            System.out.println(" No Swap Happened ");
            return;
        }

        BubbleSortingRecursive(arr, n - 1);
    }
}
