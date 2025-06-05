package Collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // Concurrent modification example
        map.computeIfAbsent("four", k -> 4);
        System.out.println("four: " + map.get("four"));
        // Output
        // one: 1
        // two: 2
        // three: 3
        // four: 4
    }
}
