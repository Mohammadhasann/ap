package Ex.Ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class LM_1_2 {
    public static void saveBooks(Book[] books) {
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

    public static Book[] readBooks() {
        Book[] books = new Book[4];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("books.txt"))) {
            String line;
            int index = 0;
            while ((line = bufferedReader.readLine()) != null && index < books.length) {
                String[] data = line.split(",");
                books[index++] = new Book(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Student[] readStudents() {
        Student[] students = new Student[3];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("stuents.txt"))) {
            String line;
            int index = 0;
            while ((line = bufferedReader.readLine()) != null && index < students.length) {
                String[] data = line.split(",");
                students[index++] = new Student(data[0], data[1], data[2], data[3]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}