package Recursions;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int n;
        String nameString;
        int j = 0;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            nameString = sc.next();
        }
        System.out.println(checkPalindromeString(j, nameString, n));
    }

    static boolean checkPalindromeString(int i, String nameString, int n) {
        if (i >= n / 2) {
            return true;
        }
        if (nameString.charAt(i) != nameString.charAt(n - i - 1)) {
            return false;
        }
        return checkPalindromeString(i + 1, nameString, n);
    }
}
