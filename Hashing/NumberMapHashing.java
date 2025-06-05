package Hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberMapHashing {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");

        int[] arr = {10,5,10,15,10,5};
        /* for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        } */

        //pre compute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key); // fetching from the map
            }
            freq++;
            mp.put(key, freq); // inserting into the map
        }

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            out.println(it.getKey() + " occurs " + it.getValue() + " in the array ");
        }

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            out.println(it.getKey() + " occurs " + it.getValue() + " in the array ");
        }

        sc.close();
        out.close();
    }
}
