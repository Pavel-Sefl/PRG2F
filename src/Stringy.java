import java.util.Scanner;

public class Stringy {
    static String reverseString(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            newStr = Character.toUpperCase(str.charAt(i)) + newStr;
        }

        return newStr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Jméno: ");
        String forename = in.next();
        System.out.print("Příjmení: ");
        String surname = in.next();

        System.out.println(reverseString(forename) + " " + reverseString(surname));
    }
}
