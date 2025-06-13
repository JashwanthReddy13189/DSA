package Hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberMapHashing {

    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = {10, 5, 10, 15, 10, 5, 1};
        //pre compute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            /*int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key); // fetching from the map
            }
            freq++;
            mp.put(key, freq); */// inserting into the map

            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

        }
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + " occurs " + it.getValue() + " in the array ");
        }
        int num = 10;
        System.out.println(mp.get(num));
    }
}
