package oop.humans;

public class Human {
    private String name;
    private int age;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.printf("Hello, %s\n\r", this.name);
    }

    public void happyBirthday() {
        this.age++;
        System.out.printf("Happy %d%s birthday, %s!\n\r", age, (age-1)%10 == 0 ? "st" : (age-2)%10 == 0 ? "nd" : (age-3)%10 == 0 ? "rd" : "th", this.name);
    }

    public static void main(String[] args) {
        Human h = new Human("Joe", 20);
        h.greet();
        h.happyBirthday();
    }
}
