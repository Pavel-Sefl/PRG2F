public class Test {
    public static void main(String[] args) {
        int size = 8;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                    System.out.print("⬜");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // Japan \\
        System.out.println("JAPAN:\n\n");
        int width = 25;

        // Runtime
        float height = (float) width /3*2;

        float midX = (float) width /2;
        float midY = height/2;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (
                        Math.pow(midX-x, 2) + Math.pow(midY-y, 2) < height*height / 9
                ) {
                    System.out.print("\uD83D\uDFE5");
                } else {
                    System.out.print("⬜");
                }
            }
            System.out.println();
        }
    }
}
