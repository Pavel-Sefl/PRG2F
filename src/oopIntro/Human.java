package oopIntro;

public class Human {
    String forename;
    String surname;
    int age;
    float height;
    float weight;

    public Human(String forename, String surname, int age, float height, float weight) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void die() {
        System.out.println("*Womp womp*");
    }
}
