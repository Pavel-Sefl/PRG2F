package tridy;

import java.util.Scanner;

public class Human {
    String forename;
    String surname;
    int age;

    public Human(String newForename, String newSurname, int newAge) {
        this.forename = newForename;
        this.surname = newSurname;
        this.age = newAge;
    }

    public void eat(String food) {
        System.out.printf("Eating %s... Yummy!\n\r", food);
    }

    public void sleep() {
        System.out.println("Sleeping. ZZZZzzzz....");
    }

    @Override
    public String toString() {
        return String.format("%s %s, aged %d", this.forename, this.surname, this.age);
    }

    public Human promptCreate() {
        Scanner in = new Scanner(System.in);
        System.out.print("     Jméno: ");
        String forename = in.nextLine();
        System.out.print("  Příjmení: ");
        String surname = in.nextLine();
        System.out.print("       Věk: ");
        int age = in.nextInt();
        in.nextLine();

        return new Human(forename, surname, age);
    }
}
