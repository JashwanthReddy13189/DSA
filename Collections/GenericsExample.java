package Collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        GenericList<Integer> list1 = new GenericList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        System.out.println(list1.get(0));
        
        GenericList<String> list2 = new GenericList<>();
        list2.add("Jashwanth Reddy");
        list2.add("Srinivas Reddy");
        list2.add("Dhanalaxmi");
        System.out.println(list2.get(0));

        GenericList<Double> doubleList = new GenericList<>();
        doubleList.add(12.34);
        doubleList.add(13.56);
        doubleList.add(100.4);
        doubleList.add(53.56);
        System.out.println(doubleList.get(0));
    }

}

class GenericList<T> {

    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public void forEach(List<T> list) {
        elements.forEach(System.out::println);
    }
}
