package blackjack;

import java.util.Scanner;

public class InputHandler {
    static Scanner in = new Scanner(System.in);

    String[] noBetLines = new String[] {
            "No bet? Smart move. That's how you keep your lunch money.",
            "No bet? Respect. That’s how you retire with savings.",
            "No bet? What are you, responsible or something?",
            "No bet? Good call. This game has a tendency to 'redistribute' funds.",
            "No bet? Just here to watch the world burn, huh?",
            "No bet? Look at you, dodging poor life choices!",
            "No problem. We're just here for the giggles anyway!",
            "Finally, someone who values their wallet.",
            "All the fun, none of the financial ruin!",
            "Bold move, but probably the safest one here.",
            "Already smarter than most gamblers.",
            "Congratulations, you win the Financial Responsibility Award!",
            "Smart. Once you understand the odds, it's not gambling anymore—just bad decision-making.",
            "You're playing 4D chess while everyone else is broke.",
            "Not losing is the new winning.",
            "Playing safe, staying sane.",
            "That's one way to beat the house.",
            "You’ve cracked the system, haven’t you?",
            "All vibes, no risks.",
            "That’s the real jackpot: self-control."
    };

    public char getAction() {
        char returnedValue = 0;
        boolean isInputValid = false;

        do {
            String userInput = in.nextLine().toLowerCase();

            if (userInput.isEmpty()) {
                System.out.print("Received empty input, please input a character: ");
            } else if (userInput.length() > 1) {
                System.out.print("Input too long, enter a single character: ");
            } else {
                char inputChar = userInput.charAt(0);

                if (inputChar == 's' || inputChar == 'h') { // eh, no reason not to hard-code it
                    isInputValid = true;
                    returnedValue = inputChar;
                } else {
                    System.out.print("Invalid character input, try again ([s] stay, [h] hit): ");
                }
            }

        } while (!isInputValid);

        return returnedValue;
    }

    public int getBet() {
        int returnedValue = 0;
        boolean isInputValid = false;

        do {
            int userInput = in.nextInt();

            in.nextLine(); // bugfix

            if (userInput < 0) {
                System.out.print("A bet cannot be a negative number, try again: ");
            } else {
                returnedValue = userInput;
                isInputValid = true;

                if (userInput == 0) {
                    System.out.println(noBetLines[(int) (Math.random() * noBetLines.length)]);
                }
            }

        } while (!isInputValid);

        return returnedValue;
    }

    public boolean getConsent() {
        boolean returnedValue = false;
        boolean isInputValid = false;

        do {
            String userInput = in.nextLine().toLowerCase();

            if (userInput.length() != 1) {
                System.out.print("Please enter exactly one character ([y] yes, [n] no): ");
                continue;
            }

            char userChar = userInput.charAt(0);

            if (userChar == 'y') {
                returnedValue = true;
                isInputValid = true;
            } else if (userChar == 'n') {
                isInputValid = true;
            } else {
                System.out.print("Invalid input - please enter");
            }
        } while (!isInputValid);

        return returnedValue;
    }

    public void closeScanner() { in.close(); }

    public int getInt() { return in.nextInt(); }
}
