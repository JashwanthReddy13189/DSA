package ArraysProblems;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 88, 5, 5, 8, 8, 9, 9};
        int n = arr.length;

        // Brute Force
        bruteForceApproach(arr, n);

        // Better Approach
        betterApproachHashing(arr, n);

        // Better Approach
        betterApproachMap(arr, n);

        // optimal approach
        optimalApproach(arr, n);

    }

    // Optimal Approach
    private static void optimalApproach(int[] arr, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }

    // Better Approach using Hashing
    private static void betterApproachHashing(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] hash = new int[max + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    // Better Approach using map
    private static void betterApproachMap(int[] arr, int n) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            if (mpp.containsKey(arr[i])) {
                mpp.put(arr[i], cnt + 1);
            } else {
                mpp.put(arr[i], cnt);
            }
        }
        for (Map.Entry<Integer, Integer> mp : mpp.entrySet()) {
            if (mp.getValue() == 1) {
                System.out.println(mp.getKey());
            }
        }
    }

    // Brute Force Approach
    private static void bruteForceApproach(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    cnt++;
                }
            }
            if (cnt == 1) System.out.println(num);
        }
    }

}
