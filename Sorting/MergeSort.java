package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int low = 0;
        int high = arr.length - 1;
        MergeSorting(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void MergeSorting(int[] arr, int low, int high) {
        // Base condition to exit recursion call
        if (low >= high) {
            return;
        }
        // Dividing arr and sorting individually
        int mid = (low + high) / 2;
        MergeSorting(arr, low, mid);
        MergeSorting(arr, mid + 1, high);
        // Final Merge into single arr
        Merge(arr, low, mid, high);
    }

    private static void Merge(int[] arr, int low, int mid, int high) {
        // create a temp list to store arr values
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
