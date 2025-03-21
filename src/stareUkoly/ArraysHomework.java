package stareUkoly;

import java.util.Arrays;

public class ArraysHomework {
    private static String[] inventory = {
            "Spitzhacke",
            "Krankenwagen",
            "Apache-Hubschrauber 3000",
            "Monchhichi",
            "Chihuahua",
            "Gallone Milch",
            "Hubba Bubba",
            "48-Port-stareUkoly.Switch",
            "Stiefel",
            "Schwanz eines weißen Wals",
            "DVD-Player",
            "16GB RAM",
            "LGM 30 Minuteman",
            "Lego Ninja Go",
            "Excalibur",
            "50-Meter-Seil",
            "Quanten-Discombobulator",
            "Empfindungsfähiges Gummiente",
            "Unsichtiges Glücks-Frettchen",
            "Zeitreisender Hamster",
            "Kosmische Luftpolsterfolie",
            "Telepathischer Spatel",
            "Interdimensionales Käserad",
            "Verzerrte Lavalampe",
            "Tanzender Kaktus des Chaos",
            "Mystische Fleischkugel",
            "Einhornfürze im Glas",
            "Singender Weltraum-Taco",
            "Antischwerkraft-Banane",
            "Multiversum-Becher",
            "Hellseherischer Toaster",
            "Atom-Schaumbad"
    };

    private static char[] rarities = {'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E', 'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'};

    private static void swapItemsAt(int indexA, int indexB) {
        String tmpItem = inventory[indexA];
        inventory[indexA] = inventory[indexB];
        inventory[indexA + 1] = tmpItem;

        char tmpRarity = rarities[indexA];
        rarities[indexA] = rarities[indexB];
        rarities[indexB] = tmpRarity;
    }

    private static void addItemOfRarity(String newItem, Character newRarity)
    {
        inventory = Arrays.copyOf(inventory, inventory.length + 1);
        inventory[inventory.length-1] = newItem;

        rarities = Arrays.copyOf(rarities, rarities.length + 1);
        rarities[rarities.length-1] = newRarity;
    }

    private static void sortItemsAlphabetically() {
        boolean swap;

        do {
            swap = false;
            for (int i = 0; i < inventory.length-1; i++) {
                String itemA = inventory[i].toLowerCase();
                String itemB = inventory[i + 1].toLowerCase();
                int rating = 0;

                for (int j = 0; j < Math.min(itemA.length(), itemB.length()); j++) {
                    rating += itemA.charAt(j);
                    rating -= itemB.charAt(j);

                    if (rating != 0) break;
                }

                if (rating > 0 || (rating == 0 && itemA.length() > itemB.length())) {
                    swap = true;
                    swapItemsAt(i, i + 1);
                }
            }
        } while (swap);
    }

    private static void sortItemsByRarity() {
        boolean swap;

        do {
            swap = false;
            for (int i = 0; i < inventory.length-1; i++) {
                int rating = rarities[i] - rarities[i + 1];
                if (rating > 0) {
                    swap = true;
                    swapItemsAt(i, i + 1);
                } else if (rating == 0) {
                    String itemA = inventory[i].toLowerCase();
                    String itemB = inventory[i + 1].toLowerCase();
                    int tieRating = 0;

                    for (int j = 0; j < Math.min(itemA.length(), itemB.length()); j++) {
                        tieRating += itemA.charAt(j);
                        tieRating -= itemB.charAt(j);

                        if (tieRating != 0) break;
                    }

                    if (tieRating > 0 || (tieRating == 0 && itemA.length() > itemB.length())) {
                        swap = true;
                        swapItemsAt(i, i + 1);
                    }
                }
            }
        } while (swap);
    }

    private static void showInventory() {
        for (int i = 0; i < inventory.length; i++) {
            System.out.printf("[ %c ] %s%n", rarities[i], inventory[i]);
        }
    }

    public static void main(String[] args) {
        // Add items
        addItemOfRarity("Horizontal rotierender Fisch", 'A');
        addItemOfRarity("Joe? Wer ist Joe?", 'C');
        addItemOfRarity("Liga der Legenden", 'E');
        addItemOfRarity("Gegenschlag Globale Offensive", 'B');

        // Sort
        System.out.println("\n\rSorted alphabetically:");
        sortItemsAlphabetically();
        showInventory();

        System.out.println("\n\rSorted by rarity:");
        sortItemsByRarity();
        showInventory();
    }
}
