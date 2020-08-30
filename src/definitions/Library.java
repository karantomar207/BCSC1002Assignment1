/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

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

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString() {
        return "availableBooks=" + Arrays.toString(availableBooks) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(availableBooks, library.availableBooks);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(availableBooks);
    }


    //This method is used to show all information of books in Library.

    public void setBooksInLibrary() {
        availableBooks[0].setBookName("A Brief History Of Time");
        availableBooks[0].setBookAuthorName("Stephen Hawking");
        availableBooks[0].setIsbnNumber("68274677367464");
        availableBooks[1].setBookName("Relativity:The special Theory");
        availableBooks[1].setBookAuthorName("Elbert Einstein");
        availableBooks[1].setIsbnNumber("4684212446562");
        availableBooks[2].setBookName("Go like Hell");
        availableBooks[2].setBookAuthorName("A.J.Baime");
        availableBooks[2].setIsbnNumber("97521645489");
        availableBooks[3].setBookName("In The Heart Of The Sea");
        availableBooks[3].setBookAuthorName("Natheniel  Philbrick");
        availableBooks[3].setIsbnNumber("87812123966232");
        availableBooks[4].setBookName("A Suitable Boy");
        availableBooks[4].setBookAuthorName("Vikram Seth");
        availableBooks[4].setIsbnNumber("8645126654548151");

    }

    public void showAvailableBooks() {
        System.out.println("**********************************************************************************");
        System.out.printf("*%-36s %-21s %-21s*\n", "Book Name", "Author Name", "ISBN Number");
        System.out.println("***********************************************************************************");
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            System.out.printf("*%-36s %-21s %-21s*\n", availableBooks[libraryIndex].getBookName(), availableBooks[libraryIndex].getBookAuthorName(), availableBooks[libraryIndex].getIsbnNumber());
        }
        System.out.println("************************************************************************************");


    }
}
