package stareUkoly;

import java.util.Random;
import java.util.Scanner;

public class TestA2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random(System.nanoTime());

        // Oddělení A
        // Úkol 1
        System.out.print("Npište vaši výšku (cm): ");
        int height = in.nextInt();
        int minHeight = 140;

        if (height >= minHeight) System.out.println("Můžete jet na horské dráze.");
        else System.out.println("Nemůžete jet na horské dráze.");

        // Úkol 2
        int rollA = rng.nextInt(1, 7);
        int rollB = rng.nextInt(1, 7);
        int rollTotal = rollA + rollB;

        System.out.println("Vaše hody: "+rollA+", "+rollB);
        if (rollTotal == 7 || rollTotal == 11) System.out.println("Vyhráli jste.");
        else System.out.println("Prohráli jste.");

        // Úkol 3
        int ticketPrice = 150;
        System.out.print("Zadejte počet kupovaných lístků: ");
        int tickets = in.nextInt();
        float totalPrice = tickets*ticketPrice;

        if (tickets > 50) {
            totalPrice = 0;
            System.out.println("Objednávka zamítnuta - Pokus o hromadný nákup");
        } else {
            if (tickets >= 10) totalPrice *= .7f;
            else if (tickets >= 5) totalPrice *= .85f;

            System.out.println("Celková cena: "+totalPrice+" kč");
        }
    }
}
