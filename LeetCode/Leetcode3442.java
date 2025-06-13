package LeetCode;

public class Leetcode3442 {
    public static void main(String[] args) {
        String s = "mmsmsym";
        System.out.println(maxDifference(s));
    }

    public static int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Integer maxOdd = null, minEven = null;
        for (int f : freq) {
            if (f == 0) continue;
            if (f % 2 == 1) {
                if (maxOdd == null || f > maxOdd) {
                    maxOdd = f;
                }
            } else {
                if (minEven == null || f < minEven) {
                    minEven = f;
                }
            }
        }

        return (maxOdd != null && minEven != null) ? maxOdd - minEven : -1;
    }
}
