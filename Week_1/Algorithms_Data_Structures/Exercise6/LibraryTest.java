package Exercise6;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("B003", "1984", "George Orwell");
        Book book4 = new Book("B004", "Pride and Prejudice", "Jane Austen");
        Book book5 = new Book("B005", "The Catcher in the Rye", "J.D. Salinger");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Linear search
        System.out.println("Linear Search for '1984':");
        Book foundBook = library.linearSearchByTitle("1984");
        System.out.println(foundBook);

        // Binary search
        System.out.println("\nBinary Search for '1984':");
        foundBook = library.binarySearchByTitle("1984");
        System.out.println(foundBook);

        // Linear search for a non-existing book
        System.out.println("\nLinear Search for 'Moby Dick':");
        foundBook = library.linearSearchByTitle("Moby Dick");
        System.out.println(foundBook);

        // Binary search for a non-existing book
        System.out.println("\nBinary Search for 'Moby Dick':");
        foundBook = library.binarySearchByTitle("Moby Dick");
        System.out.println(foundBook);
    }
}
