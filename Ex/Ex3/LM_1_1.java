package Ex.Ex3;

class Book {
    private String bookName;
    private String author;
    private int pageCount;
    private int publicationYear;
    public Book(String bookName, String author, int pageCount, int publicationYear) {
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
class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private String major;
    public Student(String firstName, String lastName, String studentId, String major) {
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
public class LM_1_1 {
    public static void main(String[] args){
        Book book1 = new Book("Dark Paychology Secrets", "William Cooper", 152, 2015);
        Book book2 = new Book("Big Javi", "Cay S.Horstmann", 1224, 2013);
        Student student1 = new Student("Hasan", "Mohammadi", "231321212", "Computer Engineering");
        Student student2 = new Student("Mohammad", "Mohammadi", "132312233", "Computer Engineering");
        System.out.println("Books:");
        System.out.println(book1.getBookName() + " - " + book1.getAuthor() + " - " + book1.getPageCount() + " - " + book1.getPublicationYear() + ".");
        System.out.println(book2.getBookName() + " - " + book2.getAuthor() + " - " + book2.getPageCount() + " - " + book2.getPublicationYear() + ".");
        System.out.println(student1.getFirstName() + " - " + student1.getLastName() + " - " + student1.getStudentId() + " - " + student1.getMajor() + ".");
        System.out.println(student2.getFirstName() + " - " + student2.getLastName() + " - " + student2.getStudentId() + " - " + student2.getMajor() + ".");
    }
}
