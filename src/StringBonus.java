import java.util.Scanner;

public class StringBonus {
    static boolean isPasswordSafe(String password) {
        return password.length() >= 12 &&
                !Character.isWhitespace(password.charAt(0)) &&
                !Character.isWhitespace(password.charAt(password.length()-1)) &&
                password.matches(".*[Rr][Ee][Dd].*") &&
                !password.matches(".*[Vv][Aa][Cc][Ee][Kk].*") &&
                password.charAt(password.length()-1) == '*';
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Validace hesla
        System.out.print("Napište nové heslo: ");
        if (isPasswordSafe(in.nextLine())) System.out.println("Vaše heslo je bezpečné.");
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
