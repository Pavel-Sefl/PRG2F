package tridy;

import java.util.Scanner;

public class ClassroomTesting {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        School infis = new School("INFIS");

        System.out.print("Kolik si přejete vytvořit tříd? ");

        short classes = in.nextShort();
        in.nextLine();
        for (short i = 0; i < classes; i++) {
            System.out.print("Název třídy: ");
            String classroomName = in.nextLine();
            Classroom newClassroom = new Classroom(in.nextLine(), new Teacher("jmeno", "prijmeni", 18));

            System.out.print("Počet žáků: ");
            short students = in.nextShort();
            in.nextLine();
            for (short j = 0; j < students; j++) {
                System.out.printf("Vytvořte žáka %d\n\r   Jméno: ", j + 1);
                String studentForename = in.nextLine();
                System.out.print("Příjmení: ");
                String studentSurename = in.nextLine();
                System.out.print("     Věk: ");
                int studentAge = in.nextInt();
                System.out.print("Znalosti: ");
                float studentKnowledge = in.nextFloat();
                in.nextLine();
                newClassroom.addStudent(new Student(studentForename, studentSurename, studentAge, studentKnowledge));
                System.out.printf("Vytvořen žák %d: %s", j+1, newClassroom.students.getFirst());
            }
        }
    }
}
