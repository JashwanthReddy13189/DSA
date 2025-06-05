package CodingNinjas;

import java.util.Arrays;

public class LargestAndSmallestElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 7, 46, 87, 6};
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
