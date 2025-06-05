package BasicMaths;

import java.util.ArrayList;
import java.util.Collections;

public class AllDivisors {

    public static void main(String[] args) {
        double x = 36;
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                divisors.add(i);
                if (i != x / i) {
                    divisors.add((int) x / i);
                }
            }
        }
        Collections.sort(divisors);
        divisors.forEach(System.out::println);
    }
}
