import java.util.Scanner;

public class Methods2 {
    private static final Scanner in = new Scanner(System.in);
    private static final String[] kaomoji = {
            "☆*: .｡. o(≧▽≦)o .｡.:*☆",
            "°*:.☆(￣▽￣)/$:*.°★* 。",
            "(〃￣︶￣)人(￣︶￣〃)",
            "*:･ﾟ✧(。・∀・)ノ*★,",
            "(((o(*ﾟ▽ﾟ*)o)))",
            "(＠⌒ー⌒＠)ノ¨",
            "(*￣︶￣*)oヾ",
            "༼ つ ◕_◕ ༽つ",
            "\\(0^◇^0)/",
            "（＾∀＾●）ﾉｼ",
            "\\(@^0^@)/",
            "o((>ω< ))o",
            "( •̀ ω •́ )y",
            "o(*^▽^*)┛o",
            "o(*^＠^*)o",
            "(ToT)/~~~",
            "☆(p≧w≦q)",
            "(❁´◡`❁)",
            "(o゜▽゜)o",
            "(✿◕‿◕✿)",
            "(*/ω＼*)",
            "(ง •_•)ง",
            "(^///^)",
            "(ﾉ◕ヮ◕)ﾉ",
            "◑﹏◐",
            ":-D"
    };

    public static String getUsernameFromUserInput(String forename, String surname)
    {
        if (forename.replaceAll("\\s", "").isEmpty() || surname.replaceAll("\\s", "").isEmpty()) return "";

        forename = forename.strip();
        surname = surname.strip();
        
        String part1 = forename.length() > 2 ? forename.toLowerCase().substring(0 ,3) : forename.toLowerCase();
        String part2 = surname.length() > 2 ? surname.toLowerCase().substring(0, 3) : surname.toLowerCase();

        int n = forename.length() * surname.length();
        double part3 = n * (Math.log(n) + Math.log(Math.log(n)));

        return part1.toUpperCase().charAt(0) + part1.substring(1)
                + "_"
                + part2.toUpperCase().charAt(0) + part2.substring(1)
                + (int)part3
                + kaomoji[(int)(part3 % kaomoji.length)];
    }

    public static String reqestString(String suffix)
    {
        System.out.print("Vaše "+suffix+": ");
        return in.nextLine();
    }

    public static boolean verifyUsername(String username)
    {
        return username.length() >= 5;
    }

    public static void main(String[] args) {
        boolean isUsernameValid;
        String username;
        int validationPasses = 0;
        do {
            if (validationPasses > 0) System.out.println("Jméno bylo příliž krátké, zkuste přidat znak.");

            String forename, surname;

            forename = reqestString("jméno");
            surname = reqestString("příjmení");

            username = getUsernameFromUserInput(forename, surname);
            System.out.println("Vaše vygenerovaná přezdívka: "+username);

            isUsernameValid = verifyUsername(username);
            validationPasses++;
        } while (!isUsernameValid);

        System.out.println("Úspěšně zvoleno uživatelské jméno: "+username);
    }
}