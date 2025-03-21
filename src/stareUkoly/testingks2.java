package stareUkoly;

public class testingks2 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 63, 70, 497, 3479};

        for (int i = 0; i < arr.length; i++) {
            System.out.println((char)(arr[i]%26+64));
        }
    }
}
