/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bharra (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String isbnNumber;

    public Book() {
        this.bookName = null;
        this.bookAuthorName = null;
        this.isbnNumber = null;

    }

    public Book(String bookName, String bookAuthorName, String isbnNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.isbnNumber = isbnNumber;


    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;

    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }


}

