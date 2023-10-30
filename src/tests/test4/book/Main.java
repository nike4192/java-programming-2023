package tests.test3.book;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[]{
            /* Example: https://en.wikipedia.org/wiki/Stephen_King */
            new Author(
                "Stephen", "King", null,
                new Date(1947, Calendar.SEPTEMBER, 21),  // Deprecated
                null
            ),
            /* Example: https://en.wikipedia.org/wiki/Joe_Hill_(writer) */
            new Author(
                "Joe", "Hill", null,
                new Date(1972, Calendar.JUNE, 4),  // Deprecated
                null
            )
        };
        /* Example: https://en.wikipedia.org/wiki/Esquire_(magazine) */
        Publisher publisher = new Publisher(
            "Esquire", "United States", "New York", "0194-9535"
        );

        /* Example: https://en.wikipedia.org/wiki/In_the_Tall_Grass */
        BookInfo book = new BookInfo(
            "In the Tall Grass",
            authors, publisher,
            76, "en",
            "978-1442359888"
        );

        System.out.println("Book info");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthorsString());
        System.out.println("Publisher: " + book.getPublisher().getName());
    }
}
