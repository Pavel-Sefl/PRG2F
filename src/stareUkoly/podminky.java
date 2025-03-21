package stareUkoly;

import java.util.Random;

public class podminky {
    public static void main(String[] args) {
        Random rng = new Random(System.nanoTime());

        float result = rng.nextFloat();

        if (result == .5f) System.out.println("Mince zústala stát na její hraně.");
        else if (result > .5) System.out.println("Výsledek: Orel");
        else System.out.println("Výsledek: Pana");


    }
}
