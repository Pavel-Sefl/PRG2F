package evidenceZaku;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EvidenceZaku {
    private static final Scanner in = new Scanner(System.in);
    private static ArrayList<ArrayList<String>> seznamTrid;

    public static void initClass(int classIndex) {

        System.out.printf("Kolik žáků je v třídě %d? ", classIndex + 1);
        int amountOfStudents = in.nextInt();

        ArrayList<String> currentClass = new ArrayList<>(amountOfStudents);

        in.nextLine(); // Fix scanner
        for (int i = 0; i < amountOfStudents; i++) {
            System.out.printf("Zadejte jméno studenta %d: ", i + 1);
            currentClass.add(i, in.nextLine());
        }

        seznamTrid.add(classIndex, currentClass);
    }

    public static void printClass(int classIndex) {
        System.out.printf("-- Výpis třídy %d --\n\r", classIndex + 1);

        ArrayList<String> currentClass = seznamTrid.get(classIndex);

        for (int i = 0; i < currentClass.size(); i++) {
            System.out.printf("-- [%d] %s \n\r", i + 1, currentClass.get(i));
        }

        System.out.println("-- Konec výpisu --");
    }

    public static void printAllClasses() {
        System.out.println("\n\r-- Výpis všech tříd --");

        for (int i = 0; i < seznamTrid.size(); i++) {
            printClass(i);
        }

        System.out.printf("-- Celkem tříd: %d --", seznamTrid.size());
    }

    public static void main(String[] args) {
        System.out.print("Kolik tříd chcete evidovat? ");
        int amountOfClasses = in.nextInt();

        seznamTrid = new ArrayList<>(amountOfClasses);

        for (int i = 0; i < amountOfClasses; i++) {
            System.out.printf("\n\r-- Evidence třídy %d -- \n\r", i);
            initClass(i);
            System.out.println("-- Konec evidence --");
        }

        printAllClasses();
    }
}
