package BasicMaths;

public class PrimeNumber {

    public static void main(String[] args) {
        int x = 36;
        int cnt = 0;
        for (int i = 1; i <= (double) Math.sqrt(x); i++) {
            if (x % i == 0) {
                cnt = cnt + 1;
                if (x / i != i) {
                    cnt = cnt + 1;
                }
            }
        }
        if (cnt == 2) {
            System.out.println(" Prime Number ");
        } else {
            System.out.println(" Not a Prime Number ");
        }
    }
}
