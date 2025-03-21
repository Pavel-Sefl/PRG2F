package stareUkoly;

import java.util.Locale;
import java.util.Scanner;

public class Calulator {
    private final Scanner in;
    public Calulator() {

        in = new Scanner(System.in);
        in.useLocale(Locale.US);
    }

    private double getNumFromUser(String identifier) {
        System.out.println("Enter number "+identifier);
        return in.nextDouble();
    }

    private char getOperationFromUser() {
        System.out.println("Enter operation: (+, -, *, /)");
        return in.next().charAt(0);
    }

    public void startOnce() {
        double a = getNumFromUser("A");
        double b = getNumFromUser("B");
        switch (getOperationFromUser()) {
            case '+':
                add(a,b);
                break;
            case '-':
                subtract(a,b);
                break;
            case '*':
                multiply(a,b);
                break;
            case '/':
                divide(a,b);
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    public void subtract(double a, double b) {
        System.out.println(a - b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public void divide(double a, double b) {
        System.out.println(a / b);
    }
}
