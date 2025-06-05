package CodingNinjas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 7, 46, 87, 6};
        int[] arr2 = {1, 1, 2, 2, 2, 3, 6, 7, 10, 13, 16};
        int duplicateFreeArray = removeDuplicatesFromArray(arr2);
        int duplicateFreeArrayOptimal = removeDuplicatesFromArrayOptimalApproach(arr);
        System.out.println(duplicateFreeArray);
        System.out.println(duplicateFreeArrayOptimal);
    }

    // Optimal Approach
    private static int removeDuplicatesFromArrayOptimalApproach(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    // Brute Force Approach
    private static int removeDuplicatesFromArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int index = 0;
        for (int i : arr) {
            set.add(i);
        }
        for (int it : set) {
            arr[index] = it;
            index++;
        }
        return index;
    }

}
