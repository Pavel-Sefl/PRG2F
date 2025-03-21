package stareUkoly;

public class ForCv3 {
    public static void main(String[] args) {
        // Setup
        int width = 50;
        int height = 15;

        // CV 1
        System.out.println("CV 1");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x==y) {
                    System.out.print("×"); // Full
                    break;
                } else {
                    System.out.print(" "); // Blank
                }
                System.out.print(" "); // Spacing
            }
            System.out.println(); // Line break
        }

        // CV 2
        System.out.println("CV 2");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if ((y==0 && x == 0) || (y != 0 && x/y == width/height)) {
                    System.out.print("×"); // Full
                    //break;
                } else {
                    System.out.print(" "); // Blank
                }
                System.out.print(""); // Spacing
            }
            System.out.println(); // Line break
        }

        // CV 3
        System.out.println("CV 3");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height - 1) {
                    System.out.print("×");
                }
            }
            System.out.println();
        }

        // CV 4
        System.out.println("CV 4");
        int size = 15;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (y == 0 || y == size-1 || size-y-1 == x) {
                    System.out.print("×"); // Full
                } else System.out.print(" "); // Blank
                System.out.print(" "); // Spacing
            }
            System.out.println();
        }
    }
}
