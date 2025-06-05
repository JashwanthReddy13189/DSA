package Recursions;

public class SumOfN {

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int sum = 0;
        paramF(n, sum);
        System.out.println(funcF(m));
    }

    private static void paramF(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        paramF(n - 1, sum + n);
    }

    static int funcF(int m) {
        if(m==0) {
            return 0;
        }
        return m + funcF(m-1);
    }
}
