package ArraysProblems.Medium;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 3, 7, 4};
        // Brute Force Approach using loops
        usingLoops(nums);

        // Optimal Approach
        usingSingleLoop(nums);
    }

    private static void usingSingleLoop(int[] nums) {
        int min = Integer.MAX_VALUE, profit = 0;
        for (int price: nums) {
            if (price<min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }
        System.out.println(profit);
    }

    private static void usingLoops(int[] nums) {
        int maxProfit = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] < nums[j]) {
                    maxProfit = Math.max(maxProfit, nums[j] - nums[i]);
                }
            }
        }
        System.out.println(maxProfit);
    }
}
