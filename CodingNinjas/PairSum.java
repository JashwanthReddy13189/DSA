package CodingNinjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2};
        int target = 4;
        List<int[]> ans = pairSumOptimal(arr, arr.length, target);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }

    public static List<int[]> pairSum(int[] arr, int n, int target) {
        // Write your code here.
        Arrays.sort(arr);
        List<int[]> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - arr[i])) {
                ans.add(new int[]{target - arr[i], arr[i]});
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }

    private static List<int[]> pairSumOptimal(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int start = 0, end = n - 1;
        List<int[]> ans = new ArrayList<>();
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                if (arr[start] == arr[end]) {
                    // Special case: identical elements
                    // Count all elements with this value between start and end
                    int count = end - start + 1;
                    // Number of pairs = C(count, 2) = count * (count-1) / 2
                    int pairs = count * (count - 1) / 2;

                    for (int i = 0; i < pairs; i++) {
                        ans.add(new int[]{arr[start], arr[end]});
                    }

                    // Break out of loop since we've handled all elements
                    break;

                } else {

                    // Count duplicates on left side
                    int leftCount = 1;
                    while (start + leftCount <= end && arr[start] == arr[start + leftCount]) {
                        leftCount++;
                    }

                    // Count duplicates on right side
                    int rightCount = 1;
                    while (end - rightCount >= start && arr[end] == arr[end - rightCount]) {
                        rightCount++;
                    }

                    // add all combinations
                    // Add leftCount * rightCount pairs
                    for (int i = 0; i < leftCount * rightCount; i++) {
                        ans.add(new int[]{arr[start], arr[end]});
                    }

                    // Move pointers past duplicates
                    start += leftCount;
                    end -= rightCount;
                }
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
}
