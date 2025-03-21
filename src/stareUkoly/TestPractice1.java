package stareUkoly;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TestPractice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Random rng = new Random();

        // 1A
        System.out.print("Zadejte váš věk: ");
        int age = in.nextInt();
        int minAge = 18;
        int maxAge = 65;

        if (age >= minAge && age <= maxAge) System.out.println("Můžete darovat krev.");
        else System.out.println("Nemůžete darovat krev.");

        // 2A
        System.out.println("## Karetní hra ##");
        int numA = rng.nextInt(12)+1;
        int numB = rng.nextInt(12)+1;
        int numSum = numA+numB;

        System.out.println("Vaše čísla: "+numA+", "+numB);
        if (numSum == 21 || numSum < 10) System.out.println("Vyhráli jste.");
        else System.out.println("Prohráli jste.");

        // 3A
        boolean disallowPurchase = false;
        int ginPrice = 540;
        System.out.print("Zadejte počet lahví: ");
        int boughtAmount = in.nextInt();
        double totalPrice = ginPrice*boughtAmount;
        if (boughtAmount > 5 && boughtAmount <= 10) totalPrice *= .9;
        else if (boughtAmount <= 50) totalPrice *= .8;
        else {
            disallowPurchase = true;
            totalPrice = 0;
        }
        if (disallowPurchase) {
            System.out.println("[ZAMÍTNUTO]: Pokus o překupnictví.");
            System.out.println("Konečná cena: "+totalPrice);
        } else {
            System.out.println("Vaše cena za objednávku: "+totalPrice);
        }

        // 1B
        System.out.print("Zadejte vaši váhu (kg): ");
        double weight = in.nextDouble();
        int minWeight = 50;
        int maxWeight = 170;

        if (weight >= minWeight && weight <= maxWeight) System.out.println("Můžete darovat krev.");
        else System.out.println("Nemůžete darovat krev.");

        // 2B
        int rollA = rng.nextInt(6)+1;
        int rollB = rng.nextInt(6)+1;
        int rollC = rng.nextInt(6)+1;

        System.out.println("Vaše hody: "+rollA+", "+rollB+", "+rollC);
        if (rollA == rollB || rollA == rollC || rollB == rollC) System.out.println("Vyhráli jste.");
        else System.out.println("Prohráli jste.");

        // 3B
        System.out.print("Vaše spotřeba (kWh): ");
        int userConsumption = in.nextInt();

        System.out.print("Vaše cena za elektřinu: ");
        if (userConsumption < 200) System.out.print(8*userConsumption);
        else if (userConsumption < 400) System.out.print(7*userConsumption);
        else if (userConsumption < 600) System.out.print(6*userConsumption);
        else System.out.print(5*userConsumption);
        System.out.println(" kč");

    }
}
