package Ex.Ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

class Booki {
    private String bookName;
    private String author;
    private int pageCount;
    private int publicationYear;
    public Booki(String bookName, String author, int pageCount, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
class Studenti {
    private String firstName;
    private String lastName;
    private String studentId;
    private String major;
    public Studenti(String firstName, String lastName, String studentId, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.major = major;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public  String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
}
public class LM_1_2 {
    public static void saveBooks(ArrayList<Booki> books) {
        try (FileWriter writer = new FileWriter("books.txt")) {
            for (Booki booki : books) {
                writer.write(booki.getBookName() + "-" + booki.getAuthor() + "-" + booki.getPageCount() + "-" + booki.getPublicationYear() + ".");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveStudents(ArrayList<Studenti> students) {
        try (FileWriter writer = new FileWriter("students.txt")) {
            for (Studenti studenti : students) {
                writer.write(studenti.getFirstName() + "-" + studenti.getLastName() + "-" + studenti.getStudentId() + "-" + studenti.getMajor() + ".");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Booki[] readBook() {
        Booki[] booki = new Booki[4];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("books.txt"))) {
            String line;
            int index = 0;
            while ((line = bufferedReader.readLine()) != null && index < booki.length) {
                String[] data = line.split(",");
                booki[index++] = new Booki(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booki;
    }
    public static Studenti[] readStudent() {
        Studenti[] studenti = new Studenti[3];
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("stuents.txt"))) {
            String line;
            int index = 0;
            while ((line = bufferedReader.readLine()) != null && index < studenti.length) {
                String[] data = line.split(",");
                studenti[index++] = new Studenti(data[0], data[1], data[2], data[3]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studenti;
    }

}
