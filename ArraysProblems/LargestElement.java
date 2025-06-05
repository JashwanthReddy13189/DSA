package ArraysProblems;

import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int largest = 0;
        int[] arr = {8, 10, 5, 7, 9};

        // Brute Force Approach
        Arrays.sort(arr);
        System.out.println(" Last Index - " + arr[arr.length - 1]);

        // Recursive Approach
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println(" Largest Element in arr is " + largest);
    }
}
