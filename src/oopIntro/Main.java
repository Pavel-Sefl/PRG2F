package oopIntro;

public class Main {
    public static void main(String[] args) {
        Human lojza = new Human("Lojza", "Volenc", 17, 154, 420);

        Book programmingInOstraJava = new Book("Programming in OstraJava", lojza);

        programmingInOstraJava.printBookInfo();
    }
}
