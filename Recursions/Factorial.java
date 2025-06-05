package Recursions;

public class Factorial {

    public static void main(String[] args) {
        int m = 5;
        int n = 8;
        int fact = 1;
        paramF(n, fact);
        System.out.println(funcF(m));
    }

    static void paramF(int i, int fact) {
        if (i < 1) {
            System.out.println(fact);
            return;
        }
        paramF(i - 1, fact * i);
    }

    static int funcF(int m) {
        if (m == 0) {
            return 1;
        }
        return m * funcF(m - 1);
    }
}
