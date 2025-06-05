package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");

        // Using LinkedHashSet to maintain insertion order
        Set<String> set = new LinkedHashSet<>(listWithDuplicates);
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        //  List without duplicates:  ["apple", "banana", "orange"]
        System.out.println("List without duplicates: " + listWithoutDuplicates);

        // Using streams
        List<String> listUsingStreams = listWithDuplicates.stream()
                .distinct().collect(Collectors.toList());

        System.out.println(" List without duplicates using streams: " + listUsingStreams);

    }
}
// This approach maintains the insertion order by using a LinkedHashSet.
