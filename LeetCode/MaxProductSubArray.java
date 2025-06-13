package LeetCode;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums = {3, -1, 4};

        // Brute Force approach
        System.out.println(usingLoops(nums));

        // Optimal Approach
        System.out.println(optimalApproach(nums));

        // Using 2 pointer
        usingTwoPointer(nums);
    }

    private static void usingTwoPointer(int[] nums) {
        int n = nums.length;
        int l = 1, r = 1;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {
            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;

            l *= nums[i];
            r *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(l, r));
        }
        System.out.println(ans);
    }

    private static int optimalApproach(int[] nums) {
        int n = nums.length, prod = 1, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prod *= nums[i];
            if (prod > max) max = prod;
            if (prod == 0) prod = 1;
            if (prod < 0 && prod < max) prod = 1;
        }
        return max;
    }

    private static int usingLoops(int[] nums) {
        int n = nums.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                max = Math.max(prod, max);
            }
        }
        return max;
    }
}
