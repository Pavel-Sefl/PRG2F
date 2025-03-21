package stareUkoly;

import java.util.Random;
import java.util.Scanner;

public class Ukoly1 {
    public static void main(String[] args) {
        // Rectangle length
        Scanner in = new Scanner(System.in);

        System.out.print("Strana A: ");
        double a = in.nextDouble();
        System.out.print("Strana B: ");
        double b = in.nextDouble();

        System.out.print("Obvod obdélníku: ");
        System.out.println(2*(a+b));

        // Temperature conversion
        System.out.print("C°: ");
        double c = in.nextDouble();
        System.out.println("F°: " + c * 1.8d + 32);
        double k = c * 273.15d;
        System.out.println("K°: " + k);
        System.out.println("Planck: ~" + 1.41680833E32 * k);

        // Randomness
        System.out.println("Rand: " + Math.random());

        System.out.print("Min rand: ");
        double min = in.nextDouble();
        System.out.print("Max rand: ");
        double max = in.nextDouble();
        System.out.println("Rand: " + (min + Math.random() * max - min));

        Random rng = new Random(System.nanoTime());

        for (int i = 0; i < 10; i++) {
            System.out.println("Rand "+ i + ": " + rng.nextDouble(12, 50));
        }
    }
}
