import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Variables_cv {
    public static void main(String[] args) {
        // připomínka z minulé hodiny

        // Rozdělte datové typy k proměnnám
        // String, boolean, char, int, double


//        type vek = 0;                         // celá čísla v rozsahu cca -2 miliardy až ~2 miliardy
//        type PI = 3.14159d;                   // reálná čísla (s desetinou čárkou)
//        type isTrue = true;                   // pravdivostní hodnota true/false (ano/ne)
//        type bigA = 'A';                      // jeden znak, píše se do ''
//        type name = "Jmeno";                  // textový řetězec (znak/slovo/text), píše se do "";

        /**
         * CV 1
         * Uložte 2 libovolná čísla do 2 proměnných
         * Poté je:
         * Vypište, Přehoďte, Vypište,
         */
        long smthn = 484214948L;
        long timeNow = System.nanoTime();

        System.out.println("smthn = " + smthn);
        System.out.println("timeNow = " + timeNow);

        long tmp = smthn;
        smthn = timeNow;
        timeNow = tmp;

        System.out.println("smthn = " + smthn);
        System.out.println("timeNow = " + timeNow);

        /**
         * CV 2
         * Napište jednoduchou kalkulačku, která bude umět +, -, *, / nad dvěma čísly z množiny R (Reálných čísel).
         * Výsledky vypište na konzoli
         */
        Calulator calc = new Calulator();
        calc.startOnce();

        /**
         * CV 3
         * Uložte do proměnné pravdivostního typu, zda součet 3 libovolných malých písmen je větší než 300.
         * Výsledek vypište na konzoli
         */
        boolean isMore;
        /*int a = (int) 'a';
        int b = (int) 'j';
        int c = (int) 'l';*/
        char a = 'a';
        char b = 'b';
        char c = 'c';
        isMore = a + b + c > 300;
        System.out.println(isMore);

        /**
         * CV 4
         * Zeptejte se uživatele na jeho, jméno, příjmení, PSČ a rodné číslo
         * Údaje pak uživateli vypište
         */
        System.out.println("Napište své jméno:");
        Scanner in = new Scanner(System.in);
        String jmeno = in.next();
        System.out.println("Napište své příjmení");
        String prijmeni = in.next();
        System.out.println("Napište své PSČ:");
        String psc = in.next();
        System.out.println("Napište své rodné číslo:");
        String rodneCislo = in.next();
        System.out.println("Děkujeme!");
        System.out.println("jmeno = " + jmeno);
        System.out.println("prijmeni = " + prijmeni);
        System.out.println("psc = " + psc);
        System.out.println("rodneCislo = " + rodneCislo);


        /**
         * CV 5
         * Vygenerujte šachovnici o velikosti NxN, kde N je vstup od uživatele
         * int n;
         *
         * Pro generaci šachovnice odkomentujte následující kód
         for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
         if ((i + j) % 2 == 0) System.out.print("■");
         else System.out.print("□");
         }
         System.out.println();
         }
         */
        Chessboard chessboard = new Chessboard(8);
        chessboard.printBoard(true);

        /*
        Pokud byste chtěli vypisovat barevně, lze využít tyto řetězce
        - Použití - System.out.println(RED + "Your message" + Reset);
        final String RESET = "\u001B[0m";
        final String BLACK = "\u001B[30m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String CYAN = "\u001B[36m";
        final String WHITE = "\u001B[37m";
        */

        // Dalsi ukoly
        System.out.println("Enter the donor's blood type:");
        String donorType = in.next();
        System.out.println("Enter the recipient's blood type:");
        String recipientType = in.next();

        Map<String, String> bloodTypeCompatibility = new HashMap<>();



    }
}