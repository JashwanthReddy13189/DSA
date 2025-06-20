package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 1, 6, 4, 7, 2, 5, 9, 0);

        // filter a list of integers to find even numbers and then sort them using the Streams

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
