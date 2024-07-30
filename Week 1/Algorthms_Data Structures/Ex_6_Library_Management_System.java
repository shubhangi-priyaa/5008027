/*Scenario: 
You are developing a library management system where users can search for books by title or author.
Steps:
1.	Understand Search Algorithms:
o	Explain linear search and binary search algorithms.
2.	Setup:
o	Create a class Book with attributes like bookId, title, and author.
3.	Implementation:
o	Implement linear search to find books by title.
o	Implement binary search to find books by title (assuming the list is sorted).
4.	Analysis:
o	Compare the time complexity of linear and binary search.
o	Discuss when to use each algorithm based on the data set size and order.

 */
import java.util.Arrays;

public class Ex_6_Library_Management_System {

    // Linear Search
    public static Ex_6_Book linearSearch(Ex_6_Book[] books, String title) {
        for (Ex_6_Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    // Binary Search
    public static Ex_6_Book binarySearch(Ex_6_Book[] books, String title) {
        int low = 0;
        int high = books.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return books[mid];
            }
        }
        return null; // Book not found
    }

    // Main method for testing
    public static void main(String[] args) {
        Ex_6_Book[] books = {
            new Ex_6_Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Ex_6_Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Ex_6_Book(3, "1984", "George Orwell"),
            new Ex_6_Book(4, "The Catcher in the Rye", "J.D. Salinger"),
            new Ex_6_Book(5, "Pride and Prejudice", "Jane Austen")
        };

        // Sort books by title for binary search
        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));

        // Linear Search
        String searchTitle = "1984";
        Ex_6_Book book = linearSearch(books, searchTitle);
        System.out.println("Linear Search Result:");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }

        // Binary Search
        book = binarySearch(books, searchTitle);
        System.out.println("\nBinary Search Result:");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
