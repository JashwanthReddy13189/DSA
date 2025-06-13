package ArraysProblems.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {6, 5, 5};
        int n = arr.length;

        int max = Integer.MIN_VALUE;

        //System.out.println(bruteForce(arr, n));

        //System.out.println(betterApproach(arr, n));

        System.out.println(optimalApproach(arr, n));

    }

    private static int optimalApproach(int[] arr, int n) {
        int ele = 0, cnt = 0;

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                ele = arr[i];
            } else if (ele == arr[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) cnt1++;
        }

        if (cnt1 > (n / 2)) return ele;
        return -1;
    }

    private static int betterApproach(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) return num;
        }
        return -1;
    }

    private static int bruteForce(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {

                // counting the frequency of v[i]
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return arr[i];
        }
        return -1;
    }
}
