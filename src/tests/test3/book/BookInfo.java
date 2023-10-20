package tests.test3.book;

public class BookInfo {
    private final String title;
    private final Author[] authors;
    private final Publisher publisher;

    private final int pagesCount;
    private final String language;  // 2-letter language code defined in ISO 639

    private final String ISBN_13;

    public BookInfo(String title, Author[] authors, Publisher publisher, int pagesCount, String language, String isbn_13) {
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.pagesCount = pagesCount;
        this.language = language;
        ISBN_13 = isbn_13;
    }

    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorsString() {
        String[] authorNames = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            authorNames[i] = authors[i].toString();
        }
        return String.join(", ", authorNames);
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public String getLanguage() {
        return language;
    }

    public String getISBN_13() {
        return ISBN_13;
    }
}
