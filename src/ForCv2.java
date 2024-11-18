public class ForCv2 {
    public static void main(String[] args) {
        int i = 20;
        for (;;) {
            i -= 2;
            if (!(i >= 0)) break;

            System.out.println("i = " + i);
        }
        System.out.println("-----------------------------------");
        int width = 30;
        int height = 30;
        int spacing = 4;

        System.out.print("\n+");
        for (int j = 1; j <= width*(spacing + 1); j++) {
            if (j % (spacing + 1) == 0) System.out.print("+");
            else System.out.print("-");
        }
        System.out.println();
        for (i = 1; i <= height; i++) {
            System.out.print("|");
            for (int j = 1; j <= width; j++) {
                int n = i*j;
                for (int k = 10; k <= Math.pow(10, spacing-1); k *= 10) {
                    if (n < k) System.out.print(" ");
                }
                System.out.print(n+"|");
            }
            System.out.print("\n+");
            for (int j = 1; j <= width*(spacing + 1); j++) {
                if (j % (spacing + 1) == 0) System.out.print("+");
                else System.out.print("-");
            }
            System.out.println();
        }
    }
}
