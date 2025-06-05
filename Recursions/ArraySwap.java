package Recursions;

import java.util.Scanner;

public class ArraySwap {

    public static void main(String[] args) {
        int n;
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }
        int l = 0;
        int r = arr.length - 1;
        funcTwoPointer(l, arr, r);
        System.out.println(" Two Pointer Array Swap ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        funcOnePointer(0, arr, n);
        System.out.println(" One Pointer Array Swap ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Two pointers array swap 
    private static void funcTwoPointer(int l, int arr[], int r) {
        if (l >= r) {
            return;
        }
        if (l != r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        funcTwoPointer(l+1, arr, r-1);
    }

    // One pointer array swap
    private static void funcOnePointer(int i, int arr[], int n) {
        if (i >= n / 2) {
            return;
        }
        if (i != n - i - 1) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        funcOnePointer(i + 1, arr, n);
    }
}
