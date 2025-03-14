import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ArrayListCv1 {
    private static void printFoodList(ArrayList<String> foodList) {
        int len = foodList.toArray().length;
        System.out.println("- -- [ Váš seznam jídel ] -- -");
        if (foodList.isEmpty()) {
            System.out.println("- -! Váž seznam je prázdný. !-- -");
        } else {
            for (int i = 0; i < len; i++) {
                System.out.printf("- -> [%d] %s\n\r", i+1, foodList.get(i));
            }
        }
        System.out.printf("- -- [ Počet položek: %d ] -- -\n\r", len);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> foodNames = new ArrayList<>();

        System.out.println("Přidávejte položky do seznamu, napsáním \"konec\" ukončíte vkládání.");
        while (true) {
            System.out.print("Přidat název položky: ");
            String userInput = in.nextLine();

            if (userInput.isEmpty()) continue;
            if (userInput.equalsIgnoreCase("konec")) break;
            if (!foodNames.contains(userInput)) foodNames.add(userInput);
        }

        printFoodList(foodNames);

        boolean doRemoveCycle = false;
        boolean doAskCycle = true;
        do {
            System.out.print("Přejete si odebrat nějakou položku? Zvolte A/N - [N]");
            String tmpResponse = in.nextLine().toLowerCase();
            if (tmpResponse.length() > 1) continue;
            if (tmpResponse.isEmpty() || tmpResponse.startsWith("n")) {
                doAskCycle = false;
            } else if (tmpResponse.startsWith("a")) {
                doAskCycle = false;
                doRemoveCycle = true;
            }
        } while (doAskCycle);

        if (doRemoveCycle) {
            System.out.println("Odebírejte položky ze seznamu napsáním jejich názvu, napsáním \"konec\" ukončíte odebírání.");
            while (!foodNames.isEmpty()) {
                printFoodList(foodNames);
                System.out.print("Odebrat položku: ");
                String userInput = in.nextLine();

                if (userInput.isEmpty()) continue;
                if (userInput.equalsIgnoreCase("konec")) break;
                foodNames.remove(userInput);
            }
        }

        printFoodList(foodNames);
    }
}
