package stareUkoly;

public class ForCycle {
    public static void main(String[] args) {
        // Cvičení 1
        System.out.println("Cvičení 1");
        /* Vypište všechny násobky pěti  od 1 do 1000 */
        int max = 1000;
        int multipleOf = 5;
        for (int i = 0; i <= max; i += multipleOf) {
            System.out.println("i = " + i);
        }
        
        // Cvičení 2
        System.out.println("Cvičení 2");
        /* Vypište všechny čísla od 100 do 0 */
        for (int i = 100; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        // Cvičení 3
        System.out.println("Cvičení 3");
        /* upravte předchozí příklad tak aby vypisoval 2. mocniny čísel */
        for (int i = 100; i >= 0; i--) {
            System.out.println("i = " + Math.pow(i, 2));
        }

        // Cvičení 4
        System.out.println("Cvičení 4");
        /* vypiště malou násobilku */
        for (int a = 1; a <= 10; a++) {
           for (int b = 1; b <= 10; b++) {
               System.out.println("a × b = "+a+" × "+b+" = "+(a*b));
           }
        }

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(a*b+" ");
            }
            System.out.println();
        }
    }
}
