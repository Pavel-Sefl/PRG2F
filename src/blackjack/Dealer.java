package blackjack;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Dealer {
    ArrayList<Card> cards;
    boolean firstCardRevealed;

    public Dealer() {
        cards = new ArrayList<>();
        firstCardRevealed = false;
    }

    public void revealFirstCard() { firstCardRevealed = true; }

    public void addCard(Card card) { cards.add(card); }

    public void printCards() {
        int cardAmount = cards.size();
        System.out.print("Dealer's cards: ");
        for (int i = 0; i < cardAmount; i++) {
            if (i == 0  && !firstCardRevealed) {
                System.out.print("??, ");
            } else {
                cards.get(i).printCard();
                System.out.print(", ");
            }
        }

        System.out.printf("\b\b (%d)\n\r", getTotalValue() - (firstCardRevealed ? 0 : cards.getFirst().getValue()));
    }

    public int getTotalValue() {
        AtomicInteger total = new AtomicInteger(); // ... huh
        cards.forEach(card -> total.addAndGet(card.getValue()));
        return total.get();
    }
}
