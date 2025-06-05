package CodingNinjas;

import java.util.Arrays;

public class SecondLargestAndSmallestElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 7, 46, 87, 6};
        int n = arr.length;
        int[] secOrderElements = getSecondOrderElements(n, arr);
        System.out.println(Arrays.toString(secOrderElements));
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int[] secondOrderElements = new int[2];
        int largest = a[0], sLargest = -1;
        int smallest = a[0], sSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                sLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > sLargest) {
                sLargest = a[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                sSmallest = smallest;
                smallest = a[i];
            } else if (a[i] != smallest && a[i] < sSmallest) {
                sSmallest = a[i];
            }
        }
        secondOrderElements[0] = sLargest;
        secondOrderElements[1] = sSmallest;
        return secondOrderElements;
    }
}