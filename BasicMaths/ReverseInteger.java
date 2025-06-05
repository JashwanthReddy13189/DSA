package BasicMaths;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = reverse(x);
        System.out.println(res);
    }

    private static int reverse(int x) {
        int prevRev = 0;
        int rev = 0;
        while (x != 0) {
            rev = (rev * 10) +  x % 10;
            if((rev - x % 10) / 10 != prevRev) {
                return 0;
            }
            prevRev = rev;
            x = x / 10;
        }
        return prevRev;
    }
}
