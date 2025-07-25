package org.example;

public enum Suits {
    HEARTS("♥"),
    DIAMONDS("♦"),
    CLUBS("♣"),
    SPADES("♠");

    private final String symbol;

    Suits(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
      return symbol;
    };

    @Override
    public String toString(){
        return symbol;
    }

}
