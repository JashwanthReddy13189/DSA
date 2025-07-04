package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorChainingExample {

    public static void main(String[] args) {
        // List of books (title and page count)
        List<Book> books = Arrays.asList(
                new Book("The Catcher in the Rye", 112),
                new Book("To Kill a Mockingbird", 281),
                new Book("1984", 328),
                new Book("The Great Gatsby", 180),
                new Book("Brave New World", 268),
                new Book("The Hobbit", 310),
                new Book("Animal Farm", 112),
                new Book("Fahrenheit 451", 158),
                new Book("The Alchemist", 180)
        );

        // Comparator Chanining
        // Sorting: First by page count, then by title alphabetically
        books.sort(
                Comparator.comparing(Book::getPages)
                        .thenComparing(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER))
        );
        System.out.println(books);

        
    }
}

class Book {

    private final String title;
    private final int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return String.format("%s (%d pages)", title, pages);
    }

}
