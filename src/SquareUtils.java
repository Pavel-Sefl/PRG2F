public class SquareUtils {

    // 1. Metoda pro převedení čísla na druhou mocninu
    public static double square(double x) {
        return x * x;
    }

    // 2. Metoda swap pro pole celých čísel
    public static void swap(int[] arr, int pos1, int pos2) {
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

    // 2. Metoda swap pro pole reálných čísel
    public static void swap(double[] arr, int pos1, int pos2) {
        double tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

    // 3. Metoda, která projde pole a převede všechny prvky na druhou mocninu
    public static void squareAll(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
    }

    public static void main(String[] args) {
        // testing

        System.out.println(square(1));
        System.out.println(square(2));
        System.out.println(square(3));
        System.out.println(square(4));
        System.out.println(square(5));

        int[] a = {1, 2, 3, 4, 5, 6};

        for (int v : a) System.out.print(v+"; ");
        System.out.println();
        swap(a, 1, 4);
        for (int v : a) System.out.print(v+"; ");
        System.out.println();

        double[] d = {1.1, 2.2, 3.14, 4.4, 5.5, 6.6};

        for (double v : d) System.out.print(v+"; ");
        System.out.println();
        swap(d, 1, 4);
        for (double v : d) System.out.print(v+"; ");
        System.out.println();

        squareAll(d);
        for (double v : d) System.out.print(v+"; ");
        System.out.println();
    }
}