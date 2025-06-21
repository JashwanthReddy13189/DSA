package ArraysProblems.Easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int n = nums.length;

        // Only Approach
        consecutiveOnes(nums, n);

    }

    private static void consecutiveOnes(int[] nums, int n) {
        int cnt = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        System.out.println(max);
    }
}
