package ArraysProblems.Medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        //System.out.println(Arrays.toString(arr));
    }

    static void sortColors(int[] arr) {
        // Dutch National Flag Algorithm
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
                System.out.println(" mid++ happened - " + mid);
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            System.out.println(" Values after run" + " low - " + low + " mid - " + mid + " high - " + high);
            System.out.println(Arrays.toString(arr));
        }
    }
}
