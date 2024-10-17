import java.util.Objects;
import java.util.Scanner;

public class WhileCV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Úkol 1
        System.out.println("Úkol 1: Součet čísel");
        int total = 0;
        int num;
        do {
            System.out.print("Zadejte celé číslo: ");
            num = in.nextInt();
            total += num;
        } while (num != 0);
        System.out.println("Součet: "+total);

        // Úkol 2
        System.out.println("Úkol 2: Počet pokusů");
        String correctPassword = "tajneheslo";
        boolean allowAccess = false;
        int attempt = 1;
        do {
            attempt++;
            System.out.print("Zadejte heslo: ");
            if (Objects.equals(in.next(), correctPassword)) allowAccess = true;
        } while (attempt <= 3 && !allowAccess);
        if (allowAccess) System.out.println("Přístup povolen.");
        else System.out.println("Přístup zamítnut.");

        // Úkol 3
        System.out.println("Úkol 3: Počet sudých čísel");
        int totalEven = 0;
        int prevNum;
        do {
            System.out.print("Zadejte celé číslo: ");
            prevNum = in.nextInt();
            if (prevNum % 2 == 0) totalEven++;
        } while (prevNum >= 0);
        System.out.println("Celkem sudých čísel: "+totalEven);

        // Úkol 4
        System.out.println("Úkol 4: Hledání největšího čísla");
        boolean isFirstIteration = true;
        int prevHighest = 0;
        int prevInput;
        do {
            System.out.print("Zadejte celé číslo: ");
            prevInput = in.nextInt();
            if (isFirstIteration) {
                isFirstIteration = false;
                prevHighest = prevInput;
            } else {
                if (prevInput > prevHighest) {
                    prevHighest = prevInput;
                }
            }
        } while (prevInput != 0);
        System.out.println("Největší číslo: "+prevHighest);
    }
}
