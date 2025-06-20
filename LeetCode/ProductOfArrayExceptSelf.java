package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {4, 8, 3, 4};
        //Brute Force Approach - Only Positives
        System.out.println(Arrays.toString(usingLoops(nums)));
    }

    private static int[] usingLoops(int[] nums) {
        int[] answer = new int[nums.length];
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            System.out.println(prod);
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prod / nums[i];
        }
        return answer;
    }
}
