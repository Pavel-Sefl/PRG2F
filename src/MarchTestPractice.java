public class MarchTestPractice {
    // 1. Simple Problems
    private static double addTwoNumbers(double numA, double numB) {
        return numA + numB;
    }

    private static boolean isEven(double num) {
        return num % 2 == 0;
    }

    private static String getWelcomeMessage(String name) {
        return String.format("Welcome, %s!", name);
    }

    // 2. Slightly More Difficult Problems

    private static double pow(double num, int originalNum, int exp) {
        if (--exp > 1) return pow(num * originalNum, originalNum, exp);
        return num * originalNum;
    }

    private static int factorial(int num, int originalNum) {
        if (--originalNum > 2) return factorial(num * originalNum, originalNum);
        return num * 2;
    }

    private static int fib(int goal) {
        if (goal < 3) return 1;
        return fib(goal - 1) + fib(goal - 2);
    }

    public static void main(String[] args) {
        System.out.println("\n\r--[ 1 ]----------------------");
        System.out.println("addTwoNumbers: " + addTwoNumbers(6, 9 + 6 * 9));
        System.out.println("isEven: " + isEven(Math.floor(Math.PI * 1E5)));
        System.out.println(getWelcomeMessage("Joe"));

        System.out.println("\n\r--[ 2 ]----------------------");
        System.out.println("pow 3^3: " + pow(2,2, 3));
        System.out.println("factorial 10:" + factorial(10, 10));
        System.out.println("fib 10: " + fib(10));
    }
}
