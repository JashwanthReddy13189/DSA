package BasicMaths;

public class GCD {

    public static void main(String[] args) {
        int a = 11;
        int b = 13;

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
                System.out.println(" a " + a);
            } else {
                b = b % a;
                System.out.println(" b " + b);
            }
        }

        if(a == 0) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
