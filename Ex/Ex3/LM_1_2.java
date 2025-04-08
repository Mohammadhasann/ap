package Ex.Ex3;

import java.io.FileWriter;

public class LM_1_2 {
    public static void saveBooks(Book[] books){
        try (FileWriter writer = new FileWriter("books.txt")) {
            for (Book book : books) {
                writer.write(book.getBookName() + "-" + book.getAuthor() + "-" + book.getPageCount() + "-" + book.getPublicationYear() + ".");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveStudents(Student[] students) {
        try (FileWriter writer = new FileWriter("students.txt")) {
            for (Student student : students) {
                writer.write(student.getFirstName() + "-" + student.getLastName() + "-" + student.getStudentId() + "-" + student.getMajor() + ".");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
