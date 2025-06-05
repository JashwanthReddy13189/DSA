package BasicMaths;

import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Brute force approach
        /*int count = 0;
        while (N > 0) {
            int lastDigit = N % 10;
            System.out.println(lastDigit);
            N = N / 10;
            count ++;
        }
        System.out.println(" number of digits - " + count);*/

        // optimal approach
        int cnt = (int) (Math.log10(N) + 1);
        System.out.println(cnt);
    }
}
