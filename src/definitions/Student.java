/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private static final int MAXIMUM_BOOKS_STUDENT_CAN_ISSUE = 5;
    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfBooksIssuedByStudent;

    public Student() {
        this.studentName = "KARAN";
        this.studentUniversityRollNumber = 191500383;
        this.numberOfBooksIssued = 5;
        this.namesOfBooksIssuedByStudent = new Book[MAXIMUM_BOOKS_STUDENT_CAN_ISSUE];
        for (int i = 0; i < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; i++) {
            namesOfBooksIssuedByStudent[i] = new Book();

        }

    }

    public Student(String studentName, long studentUniversityRollNumber, int numberOfBooksIssued, Book[] namesOfBooksIssuedByStudent) {
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfBooksIssuedByStudent = namesOfBooksIssuedByStudent;

    }

    public Book[] getNamesOfBooksIssuedByStudent() {
        return namesOfBooksIssuedByStudent;
    }

    public void setNamesOfBooksIssuedByStudent(Book[] namesOfBooksIssuedByStudent) {
        this.namesOfBooksIssuedByStudent = namesOfBooksIssuedByStudent;
    }

}
