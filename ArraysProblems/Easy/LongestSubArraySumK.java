package ArraysProblems.Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        //int[] arr = {1};
        int n = arr.length;
        int k = 3, len = 0;

        //System.out.println(bruteForceApproach(arr, n, k, len));

        //System.out.println(betterApproach(arr, n, k, len));

        System.out.println(optimalApproach(arr, n, k, len));
    }

    private static int optimalApproach(int[] arr, int n, int k, int len) {

        int cnt = 0;
        int left = 0, right = 0;
        long sum = arr[0];
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                cnt = cnt + 1;
                len = Math.max(len, right - left + 1);
            }
            right++;
            if (right < n) sum += arr[right];
        }
        System.out.println(cnt);
        return len;
    }

    private static long betterApproach(int[] arr, int n, int k, long len) {
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.println(" sum - " + sum);
            if (sum == k) len = Math.max(len, i + 1);
            long rem = sum - k;
            System.out.println(" rem - " + rem);
            if (preSumMap.containsKey(rem)) {
                long mapLen = i - preSumMap.get(rem);
                len = Math.max(len, mapLen);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
            for (Map.Entry<Long, Integer> mp : preSumMap.entrySet()) {
                System.out.println("mp.getKey()" + mp.getKey() + " " + "mp.getValue()" + mp.getValue());
            }
            System.out.println(" len - " + len);
        }

        return len;
    }

    private static int bruteForceApproach(int[] arr, int n, int k, int len) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        return len;
    }
}
