package ArraysProblems.Medium;

import java.util.Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        // max sub array sum
        //System.out.println(maxSubArrayBetter(arr));
        //System.out.println(maxSubArrayOptimal(arr));

        // print the max sub array of max sum
        System.out.println(Arrays.toString(maxSubArrayOptimalPrint(arr)));
    }

    private static int[] maxSubArrayOptimalPrint(int[] arr) {
        int n = arr.length, max = Integer.MIN_VALUE, sum = 0, start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {
            if (sum == 0) start = i;
            sum += arr[i];
            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) sum = 0;
        }
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("] ");
        System.out.println(" with max - " + max);
        return new int[]{ansStart, ansEnd};
    }

    private static int maxSubArrayOptimal(int[] nums) {
        int n = nums.length, sum = 0, max = Integer.MIN_VALUE;
        if (n == 1) return nums[0];
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    // BruteForce Approach
    static int maxSubArrayBetter(int[] nums) {
        int n = nums.length, max = Integer.MIN_VALUE;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

}
