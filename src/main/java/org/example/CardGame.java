package org.example;

import java.util.ArrayList;

public class CardGame {
    private ArrayList<Card> cardDeck;
    private String name;


    public CardGame (String name){
        this.name = name;
        this.cardDeck = new ArrayList<>();
        deckCreate();

    }

    public void deckCreate(){
        String [] suits = {"♥", "♦", "♣", "♠"};// Unicode String[] suits = {"\u2665", "\u2666", "\u2663", "\u2660"}
        String [] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};

// Building the deck using a nested for loop - creating each card for each suit
        for(String suit: suits){
            for(int i = 0; i< symbols.length; i++){
                cardDeck.add(new Card(suit,symbols[i], value[i]));
            }
        }
    }

    public ArrayList<Card> getDeck(){
        return cardDeck;
    }


    public void printDeck(){
        for(Card card:cardDeck){
            System.out.println(card);
        }
        }
    public String getName(){
        return name;

    }
}
