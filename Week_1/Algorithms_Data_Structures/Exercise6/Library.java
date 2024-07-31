package Exercise6;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    // Add a new book to the library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    // Linear search to find a book by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search to find a book by title (assuming the list is sorted)
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, count, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = count - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = books[mid].getTitle().compareToIgnoreCase(title);
            if (compare == 0) {
                return books[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
