package blackjack;

public class Card {
     public enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
    }

    private final byte rank;
    private final Suit suit; // hearts, diamonds, clubs, spades

    private final int value;
    public int getValue() { return value; }

    public Card(int rank, Suit suit) {
        this.rank = (byte) Math.clamp(rank, 1, 13);
        this.suit = suit;

        this.value = this.rank == 1 ? 11 : Math.min(this.rank, 10);
    }

    public char getSuitChar() {
        return (char) switch (suit) {
            case SPADES -> 0x2660;
            case HEARTS -> 0x2665;
            case DIAMONDS -> 0x2666;
            case CLUBS -> 0x2663;
        };
    }

    public String getRankString() {
        return switch (rank) {
            case 1 -> "A";
            case 13 -> "K";
            case 12 -> "Q";
            case 11 -> "J";
            case 10 -> "10";
            default -> String.valueOf((char) (rank + 48));
        };
    }

    public void printCard() {
        System.out.printf("%s%s", getRankString(), getSuitChar());
    }
}
