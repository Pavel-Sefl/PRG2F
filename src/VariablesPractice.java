import java.util.Locale;
import java.util.Scanner;

public class VariablesPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        String name;
        int age;
        double height_meters;

        System.out.println("Enter your name:");
        name = input.next();

        System.out.println("Enter your age:");
        age = input.nextInt();

        System.out.println("Enter your height (in meters):");
        height_meters = input.nextDouble();

    }
}
