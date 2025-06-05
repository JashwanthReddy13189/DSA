package Patterns;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // intial spaces
        int spaces = 2 * (n - 1);
        System.out.println(" spaces - " + spaces);

        for (int i = 1; i <= n; i++) {

            // print num
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // print num
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            spaces -= 2;
        }
    }
}
