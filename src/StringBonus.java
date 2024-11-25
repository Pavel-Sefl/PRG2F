import java.util.Scanner;

public class StringBonus {
    static boolean isPasswordSafe(String password) {
        if (password.length() < 12) return false;
        if (
            Character.isWhitespace(password.charAt(0)) ||
            Character.isWhitespace(password.charAt(password.length()-1))
        ) return false;
        String lowercase = password.toLowerCase();
        if (!lowercase.matches(".*red.*") || lowercase.matches(".*vacek.*")) return false;
        if (password.charAt(password.length()-1) != '*') return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Validace hesla
        System.out.print("Napište nové heslo: ");
        if (isPasswordSafe(in.next())) System.out.println("Vaše heslo je bezpečné.");
        else System.out.println("Vaše heslo není bezpečné");

        // Převod soustavy
        System.out.print("Zadejte číslo v bináční soustavě: ");
        String bin = in.next();
        System.out.print("Napíšte číslo v binární soustavě: ");
        int dec = 0;

        for (int i = 1; i <= bin.length(); i++) {
            dec += (int) ((bin.charAt(i-1)-'0')*Math.pow(2, bin.length()-i));
        }

        System.out.println("Dec: "+(dec));
    }
}
