package LeetCode;

public class Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String afterTrim = s.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase().replace(" ", "");
        System.out.println(" after trim - " + afterTrim);
        System.out.println(isPalindrome(afterTrim));
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i <= n; i++) {
            if (i >= n / 2) {
                return true;
            }
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        System.out.println("after for loop");
        return false;
    }
}
