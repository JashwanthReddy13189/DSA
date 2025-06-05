package BasicMaths;

public class Armstrong {

    public static void main(String[] args) {
        // 153 = 1^3+5^3+3^3 = 1+125+27 = 153
        int n = 1634;
        double res = 0;
        double cnt = (int) (Math.log10(n) + 1);
        while (n > 0) {
            double ld = n % 10;
            res = res + Math.pow(ld, cnt);
            n = n / 10;
        }
        System.out.println((int) res);
    }
}
