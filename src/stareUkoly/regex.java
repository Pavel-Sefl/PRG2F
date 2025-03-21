package stareUkoly;

public class regex {
    public static void main(String[] args) {
        String str = "123456/9876";
        boolean rc = str.matches("\\d{6}/\\d{4}");

        System.out.println("Obsahuje rodné číslo: " + (rc ? "Ano" : "Ne"));


    }
}
