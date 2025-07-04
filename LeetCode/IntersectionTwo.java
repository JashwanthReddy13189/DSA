package LeetCode;

import java.util.*;

public class IntersectionTwo {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        System.out.println(Arrays.toString(intersectionSorted(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int num: nums1) {
            set1.add(num);
        }
        for (int num: nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] intersectionSorted(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Found intersection, add to result if not already added
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
