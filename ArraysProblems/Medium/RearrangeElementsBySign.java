package ArraysProblems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] nums = {-1, 1}; //, 5, 6, 7,};
        // These approaches are for equal no of positives and negatives
        // Brute Force
        //System.out.println(Arrays.toString(usingLoops(nums)));

        // Optimal Approach using 2 pointers
        System.out.println(Arrays.toString(usingPointers(nums)));

        // Rearranging if we don't have equal no of positives and negatives
        // we will fall back to brute force approach to rearrange
        //usingLoopsIncludingLeftovers(nums);

    }

    private static void usingLoopsIncludingLeftovers(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                nums[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                nums[index] = neg.get(i);
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static int[] usingPointers(int[] nums) {
        int pos = 0, neg = 1, n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }

    private static int[] usingLoops(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) positives.add(nums[i]);
            else negatives.add(nums[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            ans[2 * i] = positives.get(i);
            ans[2 * i + 1] = negatives.get(i);
        }
        return ans;
    }
}
