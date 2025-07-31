package day8;
import java.util.ArrayList;
import java.util.Comparator;
//import java.util.List;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            return true;
        } else {
            System.out.println("Duplicate book not added: " + book.getTitle());
            return false;
        }
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title))
                return book;
        }
        return null;
    }

    public void sortByTitle() {
        books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    public void sortByYearDesc() {
        books.sort(Comparator.comparingInt(Book::getPublicationYear).reversed());
    }

    public void sortByTimesIssuedDesc() {
        books.sort(Comparator.comparingInt(Book::getTimesIssued).reversed());
    }

    public void sortWithCustomComparatorChain() {
        books.sort(
            Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER)
                    .thenComparing(Comparator.comparingInt(Book::getPublicationYear).reversed())
                    .thenComparing(Comparator.comparingInt(Book::getTimesIssued).reversed())
        );
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

