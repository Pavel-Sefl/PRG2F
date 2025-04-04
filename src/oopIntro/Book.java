package oopIntro;

public class Book {
    String title;
    Human author;

    public Book(String title, Human author) {
        this.title = title;
        this.author = author;
    }

    public void printBookInfo() {
        System.out.printf(">> -- >> %s << -- <<\n\r", this.title);
        System.out.printf(">> Author: %s %s", this.author.forename, this.author.surname);
    }
}
