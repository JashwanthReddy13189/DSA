package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        fruits.add("Banana");
        System.out.println(fruits);
        System.out.println(" Adding new element in existing index ");
        fruits.add(2, "Jashwanth");
        System.out.println(fruits);
        System.out.println(" Removing added element ");
        fruits.remove(2);
        System.out.println(fruits);
        if (fruits.contains("Jashwanth")) {
            System.out.println(" Jashwanth is available in fruits section ");
        } else {
            System.out.println(" Jashwanth is not available ");
        }
        fruits.sort(Comparator.naturalOrder());
        System.out.println(fruits);
        fruits.set(0, "Jashuu");
        System.out.println(fruits);
        System.out.println(fruits.stream()
                .filter(fruit -> fruit.equalsIgnoreCase("banana") || fruit.equalsIgnoreCase("Jashuu"))
                .toList());

        // practice 
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        System.out.println(map.get(1));
        map.forEach((k, v) -> System.out.println(k + "=" + v ));

        Set<String> name = new HashSet<>();
        name.add("Alice");
        name.add("Bruce");
        name.add("Alice");
        System.out.println(name.size());

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.remove(0);
        System.out.println(names);
    }
}
