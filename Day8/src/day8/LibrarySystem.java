package day8;
public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java Programming", "John Doe", 2015, 10));
        lib.addBook(new Book("Data Structures", "Alice Smith", 2018, 25));
        lib.addBook(new Book("Java Programming", "John Doe", 2015, 12)); 
        lib.addBook(new Book("Algorithms", "Bob Johnson", 2020, 15));

        System.out.println("\nBooks Sorted by Title:");
        lib.sortByTitle();
        lib.displayBooks();

        System.out.println("\nBooks Sorted by Year Descending:");
        lib.sortByYearDesc();
        lib.displayBooks();

        System.out.println("\nBooks Sorted by Times Issued Descending:");
        lib.sortByTimesIssuedDesc();
        lib.displayBooks();

        System.out.println("\nBooks Sorted by Title > Year > TimesIssued (Comparator Chain):");
        lib.sortWithCustomComparatorChain();
        lib.displayBooks();
    }
}

