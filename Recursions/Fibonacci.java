package Recursions;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibonacciCheck(n));
    }

    private static int fibonacciCheck(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibonacciCheck(n - 1);
        int sLast = fibonacciCheck(n - 2);
        return last + sLast;
    }
}
