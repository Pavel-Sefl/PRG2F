package stareUkoly;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Vložte číslo dne v týdnu: (0 = pondělí)");
        int day = new Scanner(System.in).nextInt();

        switch (day) {
            case 5 -> System.out.println("Je sobota.");
            case 6 -> System.out.println("Je neděle.");
            default -> System.out.println("Je pracovní den.");
        }
    }
}
