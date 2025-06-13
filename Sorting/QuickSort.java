package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int low = 0;
        int high = arr.length - 1;
        quickSorting(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSorting(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            System.out.println(" partitioning completed ");
            quickSorting(arr, low, pIndex - 1);
            quickSorting(arr, pIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        System.out.println(" high - " + high);
        while (i < j) {
            System.out.println(" turn of i " + i + " turn of j " + j + " for values - " + arr[i] + " and " + arr[j]);
            while (arr[i] <= pivot && i <= high - 1) {
                System.out.println(arr[i] + " " + pivot + " " + i + " " + "(high - 1)" + (high - 1));
                System.out.println(" i - " + i);
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                System.out.println(arr[j] + " " + pivot + " " + j + " " + (low + 1));
                System.out.println(" j - " + j);
                j--;
            }
            if (i < j) {
                System.out.println(" Swap Happened indexes " + i + " and " + j + " for values - " + arr[i] + " and " + arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
