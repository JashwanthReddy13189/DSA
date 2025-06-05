package Hashing;

import java.io.*;
import java.util.Scanner;

public class NumberHashing {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13]; // size based on your example
        for(int val : arr) {
            hash[val]++;
        }

        int q = sc.nextInt();
        while(q-- != 0) {
            int number = sc.nextInt();
            out.println(hash[number]);
        }

        sc.close();
        out.close();
    }
}