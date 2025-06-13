
import java.util.Scanner;

public class Weird_Algorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        System.out.print(num + " ");
        for(int i=0;i<n;i++) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            } else {
                n = n * 3 + 1;
                System.out.print(n + " ");
            }
        }
    }
}
