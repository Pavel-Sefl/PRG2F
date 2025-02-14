package algprg;

import java.util.Arrays;

public class backtracking {
    public static void main(String[] args) {
        int[] coins = {50, 20, 10, 5, 2, 1};
        int[] coinAmounts = {0, 2, 2, 1, 1, 1};

        int targetValue = 65;

        int[] solution = new int[coins.length];

        System.out.println(backtrack(targetValue, coins, coinAmounts, solution));

        System.out.println(Arrays.toString(solution));
    }

    public static boolean backtrack(int target, int[] coinValues, int[] coinAmount, int[] solutionAttempt) {
        if (target == 0) return true;

        for (int i = 0; i < coinValues.length; i++) {
            if (coinAmount[i] == 0) continue;

            // Add to solution
            target -= coinValues[i];
            solutionAttempt[i]++;
            coinAmount[i]--;

            if (backtrack(target, coinValues, coinAmount, solutionAttempt)) {
                return true;
            }

            // Remote from solution
            target += coinValues[i];
            solutionAttempt[i]--;
            coinAmount[i]++;
        }
        return false;
    }
}
