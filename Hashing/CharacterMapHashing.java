package Hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterMapHashing {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "mercy";

        // precompute:
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            /*char key = s.charAt(i);
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key);
            }
            freq++;
            mp.put(key, freq);*/

            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        char c = 'c';
        System.out.println(mp.get(c));
        /*int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            //fetch
            if(mp.containsKey(c)) out.println(mp.get(c));
            else out.println(0);
        }*/

    }
}
