import java.util.Scanner;

public class Methods2 {
    public static String getUsernameFromUserInput(String forename, String surname)
    {
        String part1 = forename.length() > 2 ? forename.toLowerCase().substring(0 ,3) : forename.toLowerCase();
        String part2 = surname.length() > 2 ? surname.toLowerCase().substring(0, 3) : surname.toLowerCase();
        double part3 = Math.pow(forename.length(), surname.length());

        return part1.toUpperCase().charAt(0) + part1.substring(1)
                + "_"
                + part2.toUpperCase().charAt(0) + part2.substring(1)
                + (int)part3;
    }

    public static boolean verifyUsername(String username)
    {
        return username.length() >= 5;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isUsernameValid = false;
        String username = "";
        int validationPasses = 0;
        do {
            if (validationPasses > 0) System.out.println("Jméno bylo příliž krátké, zkuste přidat znak.");

            String forename, surname;

            System.out.print("Vaše jméno: ");
            forename = in.next();
            System.out.print("Vaše příjmení: ");
            surname = in.next();

            username = getUsernameFromUserInput(forename, surname);
            System.out.println("Vaše vygenerovaná přezdívka: "+username);

            isUsernameValid = verifyUsername(username);
            validationPasses++;
        } while (!isUsernameValid);

        System.out.println("Úspěšně zvoleno uživatelské jméno: "+username);
    }
}