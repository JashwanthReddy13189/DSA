package CodingNinjas;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "abcabdad";
        System.out.println(firstNonRepeating(str));
    }

    public static char firstNonRepeating(String str) {
        // Write your code here
        //Map<Character, Integer> map = new LinkedHashMap<>();
        /*int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // What do you do here?
            freq[c - 'a']++;
            if (firstPos[c - 'a'] != 0) {
                firstPos[c - 'a'] = i;
            }
        }
        // testing
        for (char c : str.toCharArray()) {
            System.out.println(firstPos[c - 'a']);
        }*/
        /*for (Map.Entry<Character, Integer> mp : map.entrySet()) {
            if (mp.getValue() == 1) {
                return mp.getKey();
            }
        }*/
        return '#';
    }
}
