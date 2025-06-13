package CodingNinjas;

import java.util.Arrays;

public class LargestAndSmallestElements {
    public static void main(String[] args) {
        int[] arr = {-5, -3, -9, -1, -6, -1, -10, -2};
        int n = arr.length;
        int[] firstOrderElements = getFirstOrderElements(n, arr);
        System.out.println(Arrays.toString(firstOrderElements));
    }

    private static int[] getFirstOrderElements(int n, int[] a) {
        int[] secondOrderElements = new int[2];
        int largest = a[0];
        int smallest = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        secondOrderElements[0] = largest;
        secondOrderElements[1] = smallest;
        return secondOrderElements;
    }
}
