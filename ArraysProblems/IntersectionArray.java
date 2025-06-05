package ArraysProblems;

import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        // Brute Force
        bruteForceIntersection(arr1, arr2);
    }

    private static void bruteForceIntersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] vis = new int[n2];
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j] && vis[j] == 0) {
                    intersection.add(arr1[i]);
                    vis[j] = 1;
                    break;
                }
                if (arr2[j] > arr1[i]) return;
            }
        }
        System.out.print("[");
        for (int m: intersection) {
            System.out.print(m + ", ");
        }
        System.out.print("]");
    }
}
