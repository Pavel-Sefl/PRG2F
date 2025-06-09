package Ukol2;

public class Main {
    public static void main(String[] args) {
        Student lojza = new Student("Lojza Volenc", 17, "Poštofka");
        Teacher mrSquirrel = new Teacher("Stanley Parable", 66_000_000, "Radši žádná");

        lojza.introduce();
        mrSquirrel.introduce();
    }
}
