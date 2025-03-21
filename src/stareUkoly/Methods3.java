package stareUkoly;

import java.util.Scanner;

public class Methods3 {
    public static String generujJmeno(String jmeno, String prijmeni) {
        // Předvytvoříme si proměnné pro část 1 a část 2
        String cast1, cast2;

        // Vezmeme první 3 písmenka z každé proměnné. (tedy pozice písmenka na pozicích 0, 1 a 2)
        // Pokud je jmeno kratší, než 3 znaky, použijeme ho celé, jinak pouze jeho část
        if (jmeno.length() < 3) {
            cast1 = jmeno;
        } else {
            cast1 = jmeno.substring(0, 2);
        }
        // Pokud je jmeno kratší, než 3 znaky, použijeme ho celé, jinak pouze jeho část
        if (prijmeni.length() < 3) {
            cast2 = prijmeni;
        } else {
            cast2 = prijmeni.substring(0, 2);
        }

        return cast1+cast2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vygenerovaneJmeno = ""; // Zatím nic

        // Budeme se uživatele ptát na jméno a příjmení dokud nevygenerujeme validní jméno. (Validní je, když je delší než 3 znaky)
        while (vygenerovaneJmeno.length() < 3) {
            if (!vygenerovaneJmeno.isEmpty()) { // Poprvé bude jméno prázdné, při dalších pokusech vypíšeme hlášku o přidání znaku.
                System.out.println("Heslo je příliš krátké, zkuste přidat znak.");
            }

            // Zeptáme se uživatele na jméno a příjmení.
            System.out.print("Vaše jméno: ");
            String jmeno = in.next();
            System.out.print("Vaše příjmení: ");
            String prijmeni = in.next();

            // Uložíme vygenerované jméno zpátky do proměnné.
            vygenerovaneJmeno = generujJmeno(jmeno, prijmeni);
        }

        // Tohle se spustí až když se předchozí smyčka ukončí a bude vybrané správné jméno.
        System.out.printf("Uživatelské jméno úspěšně vybráno: "+vygenerovaneJmeno);
    }
}
