package Collections;

import java.util.List;

public class GenericExample2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Double> list2 = List.of(-100.0, 12.34, 13.56, 100.4, 53.56);

        findMin(list);
        findMin(list2);

        // Wild Card Generics

        List<String> list3 = List.of("Jashwanth", "Srinivas", "Dhanalaxmi");
        printList(list3);
        List<?> list4 = List.of("Jashwanth", 12.34, "Dhanalaxmi");
        printListWildCard(list4);
    }

    private static void printListWildCard(List<?> list4) {
        System.out.println(" Wild Card - ");
        for (Object element: list4) {
            System.out.println(element);
        }
    }

    private static <T> void printList(List<T> list3) {
        System.out.println(" Without Wild Card - ");
        for (T element : list3) {
            System.out.println(element);
        }
    }

    private static <T extends Comparable<T>> void findMin(List<T> list) {
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(min) < 0) {
                min = currentElement;
            }
        }
        System.out.println("Min: " + min);
    }

}
