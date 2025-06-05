package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> linkedMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedMap.put("one", 1);
        linkedMap.put("two", 2);
        linkedMap.put("three", 3);
        linkedMap.put("four", 4);

        // Printing the map
        System.out.println(linkedMap); // Output: {one=1, two=2, three=3, four=4}

        // Accessing an entry to check if the order is maintained
        System.out.println("Value for key 'two': " + linkedMap.get("two"));

        // Iterating through the LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Using LinkedHashMap with access-order enabled (for LRU caching)
        Map<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("one", 1);
        accessOrderMap.put("two", 2);
        accessOrderMap.put("three", 3);
        accessOrderMap.put("four", 4);

        // Accessing some elements
        accessOrderMap.get("one");
        accessOrderMap.get("three");

        // Printing after access to show LRU order (least recently used goes to end)
        System.out.println("LinkedHashMap with Access Order: " + accessOrderMap);
        // Output: {two=2, four=4, one=1, three=3}
    }
}
