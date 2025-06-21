package ArraysProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 8, 1, 3, 4, 6};

        //bruteForceApproach(nums);

        optimalApproach(nums);

    }

    private static void optimalApproach(int[] nums) {
        int n = nums.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void bruteForceApproach(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                temp.add(num);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }
        for (int k = temp.size(); k < nums.length; k++) {
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
