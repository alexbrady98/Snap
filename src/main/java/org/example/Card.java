package org.example;

public class Card {
    private final Suits suit;
    private final Ranks rank;


    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Ranks getRank(){
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }
    public int getValue(){
        return rank.getValue();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suit);
    }
}
