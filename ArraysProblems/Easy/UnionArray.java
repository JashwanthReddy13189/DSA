package ArraysProblems.Easy;

import java.util.*;

public class UnionArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};

        // Brute Force
        //usingSet(nums1, nums2);

        // Optimal Approach
        usingPointers(nums1, nums2);
    }

    private static void usingPointers(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int n1 = nums1.length, n2 = nums2.length;
        List<Integer> union = new ArrayList<>();
        while (i < n1 && j < n2) {
            System.out.println(" Runs/n " + i + " " + j);
            if (nums1[i] <= nums2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
                i++;
            }
        }
        while (j < n2) {
            if (union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
                j++;
            }
        }
        System.out.print("[");
        for (
                int m : union) {
            System.out.print(m + ", ");
        }
        System.out.print("]");
    }

    private static void usingSet(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int k : nums1) {
            set.add(k);
        }
        for (int j : nums2) {
            set.add(j);
        }
        int[] union = new int[set.size()];
        int i = 0;
        for (int m : set) {
            union[i++] = m;
        }
        System.out.println(Arrays.toString(union));
    }
}
