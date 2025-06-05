package BasicMaths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int rev = 0;
        while(n > 0 ) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
            System.out.println(rev);
        }
        if ( rev == original) {
            System.out.println(true);
        } else
            System.out.println(false);

    }
}
