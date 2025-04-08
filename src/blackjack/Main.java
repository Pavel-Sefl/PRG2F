package blackjack;

public class Main {
    public static void main(String[] args) {
        InputHandler input = new InputHandler();

        System.out.print("Gambling bad :( only adults can gamble - are you at least 18 years old? ([y] yes, [n] no): ");
        boolean gameLoop = input.getConsent();

        System.out.println("The betting is simple:\n\r You lose = you get nothing\n\r You win = you profit by the value of your bet\n\r You can go below zero with your balance, just gotta win it all back... right?");

        System.out.print("Enter your starting balance: ");
        int playerBalance = Math.abs(input.getInt());

        while (gameLoop) {
            System.out.printf("Round start!\n\rYour balance: %d\n\r", playerBalance);
            Deck deck =  new Deck();
            Dealer dealer = new Dealer();
            Player player = new Player();

            // Place bet
            System.out.print("Please enter your bet: ");
            player.setBet(input.getBet());

            playerBalance -= player.getBet();

            // Initial deal
            player.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());

            // Second deal
            player.addCard(deck.dealCard());

            Card secondDealerCard = deck.dealCard();
            dealer.addCard(secondDealerCard);
            dealer.printCards();

            // Player's turn
            System.out.println("Your turn!");
            player.printCards();

            boolean playerTurn = true;
            do {
                System.out.print("Your action ([h] hit, [s] stand): ");
                switch (input.getAction()) {
                    case 'h' -> {
                        player.addCard(deck.dealCard());
                        player.printCards();

                        int playerTotalValue = player.getTotalValue();

                        if (playerTotalValue == 21) {
                            System.out.println("That's 21! You win!");
                            playerTurn = false;
                            playerBalance += 2 * player.getBet();
                        } else if (playerTotalValue > 21) {
                            System.out.println("Bust!");
                            playerTurn = false;
                        }
                    }
                    case 's' -> playerTurn = false;
                }
            } while (playerTurn);

            // If player hasn't already won or busted
            if (player.getTotalValue() < 21) {
                // Dealer's turn
                System.out.println("Dealer's turn!");

                dealer.revealFirstCard();
                dealer.printCards();

                while (dealer.getTotalValue() < 17) {
                    Card card = deck.dealCard();
                    System.out.println("Dealer drew: ");
                    card.printCard();
                    System.out.println();
                    dealer.addCard(card);
                }

                // Conclusion
                int dealerTotal = dealer.getTotalValue();

                if (dealerTotal > 21) {
                    System.out.println("Dealer bust! You win! Yay");
                    playerBalance += 2 * player.getBet();
                } else if (dealerTotal == player.getTotalValue()) {
                    System.out.println("Draw - you get your bet back.");
                    playerBalance += player.getBet();
                } else if (dealerTotal < player.getTotalValue()) {
                    System.out.println("You win!");
                    playerBalance += 2 * player.getBet();
                } else if (dealerTotal > player.getTotalValue()) {
                    System.out.println("You lose!");
                }
            }

            System.out.printf("Your new balance: %d\n\r", playerBalance);
            if (playerBalance < 0) System.out.println("You're in the red now. Maybe that's a sign... to win it all back?");
            System.out.print("Play another round? ([y] yes, [n] no): ");
            gameLoop = input.getConsent();
        }

        System.out.printf("Game report:\n\r Final balance: %d\n\r", playerBalance);
        input.closeScanner();

        System.out.println("Cya!");
    }
}
