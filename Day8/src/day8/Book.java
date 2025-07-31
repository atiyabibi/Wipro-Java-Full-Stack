package day8;
import java.util.Objects;
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int timesIssued;

    public Book(String title, String author, int publicationYear, int timesIssued) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.timesIssued = timesIssued;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public int getTimesIssued() { return timesIssued; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equalsIgnoreCase(book.title) && author.equalsIgnoreCase(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title.toLowerCase(), author.toLowerCase());
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + publicationYear + ") - Issued: " + timesIssued + " times";
    }
}