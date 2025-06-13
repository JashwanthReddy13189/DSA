package ArraysProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int target = 14;
        //System.out.println(Arrays.toString(twoSum(arr, n, target)));
        //System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSumOptimal(arr, n, target)));
    }

    private static int[] twoSumOptimal(int[] arr, int n, int target) {
        int start = 0, end = n - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) return new int[]{start, end};
            else if (sum < target) start++;
            else end--;
        }
        return new int[]{-1, -1};
    }

    private static int[] twoSum(int[] arr, int n, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }

    public static int[] twoSum(int[] a, int t) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int x = t - a[i];
            if (m.containsKey(x))
                return new int[]{m.get(x), i};
            m.put(a[i], i);
        }
        return new int[0];
    }
}
