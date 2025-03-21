package stareUkoly;

import java.util.Random;

public class Cycles {
    public static void main(String[] args) {
        int n = 0;
        while (n <= 1000) {
            System.out.println(n);
            n+=2;
        }

        Random rng = new Random(System.nanoTime());

        int roll;
        do {
            roll = rng.nextInt(1, 7);
            System.out.println("Hod: "+roll);
        } while (roll != 6);
        System.out.println("Vyhráli jste! Máte 6.");
    }
}
