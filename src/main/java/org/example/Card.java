package org.example;

public class Card {
    private final Suits suit;
    private final String symbol;
    private final int value;


    public Card(Suits suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", symbol, suit);
    }
}
