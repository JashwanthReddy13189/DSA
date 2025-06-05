package Collections;

import java.util.*;

public class CollectionUtilityDemo {

    public static void main(String[] args) {

        // Example List of Cricketers
        List<String> cricketers = Arrays.asList(
                "Sanju Samson", "Suryakumar Yadav", "Abhishek Sharma", "Tilak Varma",
                "Hardik Pandya", "Rinku Singh", "Ramandeep Singh", "Axar Patel",
                "Arshdeep Singh", "Ravi Bishnoi", "Varun Chakaravarthy", "Avesh Khan",
                "Jitesh Sharma", "Vijaykumar Vyshak", "Yash Dayal", "Rishabh Pant"
        );

        // 1. Sorting alphabetically by default (natural ordering)
        /* Collections.sort(cricketers);
        System.out.println(cricketers); */

        // 2. Custom Sorting by length of name
        /* Collections.sort(cricketers, Comparator.comparingInt(String::length));
        System.out.println(cricketers); */

        // 3. Sorting in Descending Order
        /* cricketers.sort(Collections.reverseOrder());
        System.out.println(cricketers); */

        // 4. Binary Search
        /* Collections.sort(cricketers);
        int index = Collections.binarySearch(cricketers, "Hardik Pandya");
        System.out.println(index); */

        // 5. Reversing the List
        /* Collections.reverse(cricketers);
        System.out.println(cricketers); */

        // 6. Shuffling the List
        /* Collections.shuffle(cricketers);
        System.out.println(cricketers); */

        // 7. Swapping elements
        /* Collections.swap(cricketers, 0, 15);
        System.out.println(cricketers); */

        // 8. Creating an unmodifiable collection
        /* List<String> unmodifiableList = Collections.unmodifiableList(cricketers);
        unmodifiableList.set(1, "Jashuuu"); */

        // 9. Finding max and min by custom comparator (e.g., longest and shortest names)
        /* String longestName = Collections.max(cricketers, Comparator.comparingInt(String::length));
        String shortestName = Collections.min(cricketers, Comparator.comparingInt(String::length));
        System.out.println( "Longest Name - " + longestName);
        System.out.println( "Shortest Name - " + shortestName); */

        // 10. Frequency of an element
        /* int frequency = Collections.frequency(cricketers,"Rohit SHarma");
        System.out.println(frequency); */

        // 11. Disjoint: Check if two lists have no elements in common
        /* List<String> newCricketers = Arrays.asList("Rohit Sharma", "Virat Kohli", "Hardik Pandya");
        boolean noCommonElements = Collections.disjoint(cricketers, newCricketers);
        System.out.println(noCommonElements); */

        // 12. Copying contents from one list to another
        /* List<String> copyCricketers = new ArrayList<>(Collections.nCopies(cricketers.size(), ""));
        Collections.copy(copyCricketers, cricketers);
        System.out.println(copyCricketers); */

        // 13. Replacing all elements with a single value
        /* Collections.fill(cricketers, "T20 WC Winners Squad Member");
        System.out.println(cricketers); */

        // 14. Synchronized Collection
        Collection<String> syncCollection = Collections.synchronizedCollection(
            new ArrayList<>(cricketers)
        );
        syncCollection.forEach(System.out::println);
    }
}
