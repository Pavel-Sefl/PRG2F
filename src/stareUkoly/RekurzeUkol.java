package stareUkoly;

import java.util.Scanner;

public class RekurzeUkol {
    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        return n < 10 ? n : n%10 + sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Zadejte číslo: ");
            int userInput = in.nextInt();
            System.out.println("Součet číslic čísla "+userInput+" je "+sumOfDigits(userInput));
        }
    }
}
