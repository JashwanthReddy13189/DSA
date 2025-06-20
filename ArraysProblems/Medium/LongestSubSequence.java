package ArraysProblems.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubSequence {
    public static void main(String[] args) {
        int[] nums = {100, 102, 101, 101, 4, 100, 1, 3, 1, 2, 1, 4};
        System.out.println(longestSeqBrute(nums));
        System.out.println(longestSeqBetter(nums));
        System.out.println(longestSeqOptimal(nums));
    }

    private static int longestSeqOptimal(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int longest = 1;

        // if array length is 0 return 0
        if (n == 0) {
            return 0;
        }

        // 1.fill the set with all unique nums
        // TC -> O(logN)
        for (int num : nums) {
            set.add(num);
        }

        // 2. find the longest sequence
        for (int st : set) {
            if (!set.contains(st - 1)) {
                int cnt = 1;
                int x = st;
                while (set.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    // Better Approach
    // TC -> O(NlogN) + O(N)
    // SC -> O(1)
    private static int longestSeqBetter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int longest = 1, lastSmaller = Integer.MIN_VALUE, cnt = 0;
        for (int num : nums) {
            if (num - 1 == lastSmaller) {
                lastSmaller = num;
                cnt++;
            } else if (num != lastSmaller) {
                cnt = 1;
                lastSmaller = num;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    // Brute Force Approach
    // TC -> O(N)*O(N)
    // SC -> O(1)
    private static int longestSeqBrute(int[] nums) {
        int n = nums.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int cnt = 1;
            // Do linear search in nums for all x+1 available nums
            while (ls(nums, x + 1)) {
                // For every num present
                // Increase the count and num by 1
                cnt = cnt + 1;
                x = x + 1;
            }
            // Find the longest between prev longest and cnt
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    private static boolean ls(int[] nums, int num) {
        for (int j : nums) {
            // return true if num present in nums array
            if (j == num) {
                return true;
            }
        }
        // return false if num does not exist in nums array
        return false;
    }
}
