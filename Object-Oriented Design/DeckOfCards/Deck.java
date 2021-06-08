import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private int dealtIndex = 0;

    public Deck() {
        // this is a deck
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck() {
        for (Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                this.cards.add(new Card(cardValue, cardSuit));
            }
        }
    }

    public String toString() {
        String cardListOuput = "";

        for (Card acard : cards) {
            cardListOuput += "\n" + acard.toString();
        }
        return cardListOuput;
    }

    public void shuffle() {
        ArrayList<Card> tmdDeck = new ArrayList<Card>();
        Random random = new Random();
        int randomIndex = 0;
        int sizeOfDeck = this.cards.size();
        for (int i = 0; i < sizeOfDeck; i++) {
            // generate random index randindex = random.nextInt((max - min) + 1) + min
            randomIndex = random.nextInt((cards.size() - 1 - 0) + 1) + 0;
            tmdDeck.add(this.cards.get(randomIndex));
            // aftere removing delete the card from the orginal deck so thar it doesn't come
            // again
            this.cards.remove(randomIndex);
        }

        // make temp deck the new deck
        this.cards = tmdDeck;
    }

    // to remove a card from the deck
    public void removeCard(int i) {
        this.cards.remove(i);
    }

    // card at ith position
    public Card getCard(int i) {
        return this.cards.get(i);
    }

    public void addCard(Card cardd) {
        this.cards.add(cardd);
    }

    public int deckSize() {
        return this.cards.size();
    }

    // draws from the deck
    public void draw(Deck comingFrom) {
        this.cards.add(comingFrom.getCard(0));
        comingFrom.removeCard(0);
    }

    public void moveAllToDeck(Deck moveTo) {
        int thisDeckSize = this.cards.size();
        for (int i = 0; i < thisDeckSize; i++) {
            moveTo.addCard(this.getCard(0));
        }

        for (int i = 0; i < thisDeckSize; i++) {
            this.removeCard(0);
        }

    }

    // returns the value of cards in a deck
    public int cardsValue() {
        int totalValue = 0;
        int aces = 0;
        for (Card acard : this.cards) {
            switch (acard.getValue()) {
                case Two:
                    totalValue += 2;
                    break;
                case Three:
                    totalValue += 3;
                    break;
                case Four:
                    totalValue += 4;
                    break;
                case Five:
                    totalValue += 5;
                    break;
                case Six:
                    totalValue += 6;
                    break;
                case Seven:
                    totalValue += 7;
                    break;
                case Eight:
                    totalValue += 8;
                    break;
                case Nine:
                    totalValue += 9;
                    break;
                case Ten:
                    totalValue += 10;
                    break;
                case Jack:
                    totalValue += 10;
                    break;
                case Queen:
                    totalValue += 10;
                    break;
                case King:
                    totalValue += 210;
                    break;
                case Ace:
                    aces += 1;
                    break;

            }
        }

        for (int i = 0; i < aces; i++) {
            if (totalValue > 10) {
                totalValue += 1;
            } else {
                totalValue += 11;
            }
        }

        return totalValue;
    }
}
