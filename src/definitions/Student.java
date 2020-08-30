/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    /*
    This method will return the Book which student has issued.

     * @param bookName The name of the book which is used to be returned.
     * @return It will return Boolean value, if return will be successful then it will return true else false.
     */

    public boolean returnBook(String bookName) {
        boolean returnSuccessful = false;
        int returnBookIndex = 0;
        for (int tempIndex = 0; tempIndex < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; tempIndex++) {
            if (bookName.equals(namesOfBooksIssuedByStudent[tempIndex].getBookName())) {
                returnSuccessful = true;
                returnBookIndex = tempIndex;
                setNumberOfBooksIssued(getNumberOfBooksIssued() - 1);

                break;
            }

        }
        if (returnSuccessful) {
            namesOfBooksIssuedByStudent[returnBookIndex].setBookName(null);

        } else {
            System.out.println("Please enter the correct book name.");
        }
        return returnSuccessful;
    }

    /*
    This method will allow shoe names of all issued books.
     */
    public void listOfIssuedBooks() {
        for (Book book : this.namesOfBooksIssuedByStudent) {
            System.out.println(book);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    @Override
    public String toString() {
        return "studentName='" + studentName + '\'' +
                ",studentUniversityRollNumber=" + studentUniversityRollNumber +
                ",numberOfBookIssued=" + numberOfBooksIssued +
                ",namesOfbooksIssuedByStudent=" + Arrays.toString(namesOfBooksIssuedByStudent) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentUniversityRollNumber == student.studentUniversityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(namesOfBooksIssuedByStudent, student.namesOfBooksIssuedByStudent);
    }
}
