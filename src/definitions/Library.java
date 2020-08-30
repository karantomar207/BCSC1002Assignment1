/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 5;
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int i = 0; i < MAXIMUM_BOOKS_IN_LIBRARY; i++) {
            availableBooks[i] = new Book();

        }

    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }


}
