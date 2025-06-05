package Recursions;

public class BackTracingRecursion {
    public static void main(String[] args) {
        int n = 3;
        f(1,n);
    }
    static void f(int i, int n) {
        if(i>n) {
            return;
        }
        f(i+1, n);
        System.out.println(i);
    }
}
