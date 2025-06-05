package Hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class HashingProblem {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //pre compute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key); // fetching from the map
            }
            freq++;
            mp.put(key, freq); // inserting into the map
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            //fetch
            if(mp.containsKey(number)) out.println(mp.get(number));
            else out.println(0);
        }

        sc.close();
        out.close();
    }
}
