import java.util.Random;
import java.util.Scanner;

public class ForCv {
    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);
        Random rng = new Random(System.nanoTime());

        // Úkol 1
        System.out.println("Úkol 1");
        for (int x = -50; x <= 50; x++) {
            System.out.println("x = "+x+" ; y = "+(2*x-3));
        }

        // Úkol 2
        System.out.println("Úkol 2");
        System.out.print("n = ");
        long n = in.nextLong();
        for (long i = n-1; i > 0; i--) {
            n += i;
        }
        System.out.println("Součet: "+n);

        // Úkol 3
        System.out.println("Úkol 3");
        System.out.print("n = ");
        n = in.nextLong();
        for (long i = n-1; i > 1; i--) {
            n *= i;
        }
        System.out.println("Součet: "+n);

        // Úkol 4
        int totalFlips = (int) 1E6;
        int totalHeads = 0;
        int totalTails = 0;

        for (int i = 0; i <= totalFlips; i++) {
            if (rng.nextBoolean()) totalHeads++;
            else totalTails++;
        }
        System.out.println("Heads probability: "+(totalHeads/totalFlips));
        System.out.println("Tails probability: "+(totalTails/totalFlips));

        // Úkol 5
        int totalTosses = (int) 1E7;
        int totalThrees = 0;
        for (int i = 0; i <= totalFlips; i++) {
            if (rng.nextInt(7) == 3) totalThrees++;
        }
        System.out.println("Probability of 3: "+(totalThrees/totalTosses*100)+"%");

        // Úkol 6
        System.out.print("Enter amount: ");
        int amount = in.nextInt();

        System.out.println("----------------------");
        for (int i = 0; i < amount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < amount-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        for (int i = amount; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < amount-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = amount; i > 0; i--) {
            for (int j = 0; j < amount-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = amount; i > 0; i--) {
            if (i == amount) {
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < amount-i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j <= i * 2 - 3; j++) {
                    System.out.print(" ");
                }
                if (amount != 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
