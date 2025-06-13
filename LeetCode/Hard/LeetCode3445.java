package LeetCode.Hard;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3445 {
    public static void main(String[] args) {
        String s = "12233";
        int k = 4;
        maxDifference(s, k);
    }

    private static void maxDifference(String s, int k) {
        int[] freq = new int[9];
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            //map.put(c, map.getOrDefault(c, 0) + 1);
        }
    }
}
