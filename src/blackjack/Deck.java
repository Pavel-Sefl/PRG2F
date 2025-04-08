package blackjack;

import java.util.Stack;

public class Deck {
    private final Stack<Card> cards;

    public Deck() {
        cards = new Stack<>();
        
        fillDeck();
        
        shuffle();
    }

    private void fillDeck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (int i = 1; i < 14; i++) {
                cards.push(new Card(i, suit));
            }
        }
    }
    
    public void shuffle() {
        cards.sort((_, _) -> Double.compare(Math.random(), .5));
    }

    public Card dealCard() {
        return cards.pop();
    }
}
