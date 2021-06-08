public class Card {
    private boolean available = true;

    protected Value faceValue;
    protected Suit suit;

    Card(Value fv, Suit s) {
        faceValue = fv;
        suit = s;
    }

    // public abstract int value();

    public Suit suit() {
        return suit;
    }

    public Value getValue() {
        return this.faceValue;
    }

    // check if the card is available or not
    public boolean isAvailable() {
        return available;
    }

    public String toString() {
        return this.suit.toString() + " " + this.faceValue.toString();
    }

    public void markUnavailable() {
        available = false;
    }

    public void markAvailable() {
        available = true;
    }
}