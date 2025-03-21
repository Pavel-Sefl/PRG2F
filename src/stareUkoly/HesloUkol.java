package stareUkoly;

public class HesloUkol {
    static void validatePassword(String password) {
        if (password.length() < 8) {
            // Minimální délka
            System.out.println("Heslo nesplňuje jednu z podmínek: \"Heslo musí být alespoň 8 znaků dlouhé.\"");
        } else if (password.toLowerCase().contains("heslo")) {
            // Nesmí obsahovat "heslo"
            System.out.println("Heslo nesplňuje jednu z podmínek: \"Heslo nesmí obsahovat slovo \"heslo\".\"");
        } else if (password.length() > 128) {
            // Vlastní podmínka
            System.out.println("Heslo nesplňuje jednu z podmínek: \"Heslo nesmí být více než 128 znaků dlouhé.\"");
        } else {
            // Heslo splňuje všechny podmínky
            System.out.println("Heslo je v pořádku.");
        }
    }

    public static void main(String[] args) {
        validatePassword("Heslo12345");
    }
}
