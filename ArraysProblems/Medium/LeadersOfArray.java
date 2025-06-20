package ArraysProblems.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersOfArray {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};
        leadersBrute(nums);
        leadersOptimal(nums);
    }

    private static void leadersOptimal(int[] nums) {
        int n = nums.length, max = nums[n-1];
        List<Integer> list = new ArrayList<>();
        list.add(max);
        for (int i = n-1; i>=0; i--) {
            if (nums[i] > max) {
                list.add(nums[i]);
                max = nums[i];
            }
        }
        list.forEach((element) -> System.out.print(element + " "));
    }

    private static void leadersBrute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] < nums[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                System.out.println(nums[i] + " " + i);
                list.add(nums[i]);
            }
        }
        list.forEach((element) -> System.out.print(element + " "));
        Collections.sort(list);
        System.out.println();
        list.forEach((element) -> System.out.print(element + " "));
    }


}
