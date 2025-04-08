package blackjack;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
    ArrayList<Card> cards;

    private int bet;
    public int getBet() { return bet; }
    public void setBet(int bet) { this.bet = bet; }

    public Player() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void printCards() {
        System.out.print("Player's cards: ");
        for (Card card : cards) {
            card.printCard();
            System.out.print(", ");
        }
        System.out.printf("\b\b (%d)\n\r", getTotalValue());
    }

    public int getTotalValue() {
        AtomicInteger total = new AtomicInteger();
        cards.forEach(card -> total.addAndGet(card.getValue()));
        return total.get();
    }
}
