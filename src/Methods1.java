import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods1 {
    static String[] conditions = {
            "Heslo musí být alespoň 8 znaků dlouhé.",
            "Heslo nesmí obsahovat slovo \"heslo\" (case-sensitive).",
            "Heslo musí obsahovat odpověď na Wordle z 19. června 2021 (case-insensitive)."
    };

    static List<Integer> getPasswordViolations(String password) {
        List<Integer> noMatch = new ArrayList<>();

        if (password.length() < 8) noMatch.add(0);
        if (password.matches(".*heslo.*")) noMatch.add(1);
        if (!password.toLowerCase().matches(".*cigar.*")) noMatch.add(2);

        return noMatch;
    }

    static  boolean validatePassword(String password) {
        List<Integer> noMatch = getPasswordViolations(password);

        if (!noMatch.isEmpty()) {
            System.out.println("Heslo nevyhovuje následujícím požadavkům:");
            for (Integer i : noMatch) System.out.println(" - " + conditions[i]);
        }

        return noMatch.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\u001B[37m(Hint: nytimes.com/svc/wordle/v2/YYYY-MM-DD.json)\u001B[0m");
        System.out.println("Vítejte! Vytvořte si prosím nové heslo, které splňuje následující podmínky:");
        for (String condition : conditions) System.out.println(" - " + condition);
        System.out.print("Vaše heslo: ");

        while (!validatePassword(in.nextLine())) System.out.print("Zkuste to prosím znovu.\r\nVaše heslo: ");

        System.out.println("Heslo úspěšně zvoleno.");
    }
}
