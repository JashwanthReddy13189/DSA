package Hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharacterHashing {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");

        String s = sc.next();

        // precompute
        int[] hash = new int[256]; // size based on your example
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            out.println(hash[c]);
        }

        sc.close();
        out.close();
    }
}
