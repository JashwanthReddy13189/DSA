package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

class MergeSortAnArray {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        int n = nums.length;
        int low = 0, high = n - 1;
        mergeSort(nums, low, high);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid + 1);
        mergeSort(nums, mid, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
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

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}