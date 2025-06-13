package oop.humans;

import java.util.ArrayList;

public class Student {
    private String name = "Unnamed";
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student() {};

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public void greet() {
        System.out.printf("Hello, %s!\n\r", this.name);
    }

    public void printGrades() {
        System.out.printf("Známky žáka %s: %s\n\r", this.name, this.grades.toString());
    }

    public static void main(String[] args) {
        ArrayList<Integer> lojzovyZnamky = new ArrayList<>();
        lojzovyZnamky.add(5);
        lojzovyZnamky.add(3);
        lojzovyZnamky.add(6);
        lojzovyZnamky.add(4);
        lojzovyZnamky.add(3);

        Student lojza = new Student("Lojza Volenc", lojzovyZnamky);

        lojza.greet();
        lojza.printGrades();
    }
}
