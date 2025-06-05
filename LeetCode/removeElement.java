package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

class removeElement {


    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;

        // Brute Force
        //System.out.println(removeElements(arr, val));

        // Optimal Approach
        System.out.println(removeElementsOA(arr, val));
    }

    // Optimal Approach
    private static int removeElementsOA(int[] arr, int val) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return index;
    }

    // Brute Force Approach
    public static int removeElements(int[] nums, int val) {
        int n = nums.length;
        ArrayList<Integer> expectedNums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                expectedNums.add(nums[i]);
            }
            expectedNums.forEach(System.out::print);
            System.out.println();
        }
        int k = expectedNums.size();
        for (int i = 0; i < k; i++) {
            nums[i] = expectedNums.get(i);
        }
        for (int i = k; i < n; i++) {
            nums[i] = val;
        }
        System.out.println(Arrays.toString(nums));
        return expectedNums.size();
    }
}