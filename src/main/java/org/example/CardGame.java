package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    private ArrayList<Card> cardDeck; // Holds all the card within
    private String name; // Storing game name

    // Constructor - sets the name of the game
// Creating a new empty array list to hold the cards within
// Calls the deck create method below
    public CardGame(String name) {
        this.name = name;
        this.cardDeck = new ArrayList<>();
        deckCreate();

    }
// Here we are building the card deck using a nested loop within deck create
// Assign suits with each suit that I need - think I can just use the image instead of Unicode - I will get confused if not
// Add each symbol on the card and store them in a symbols array
// Add all the values we need as well to the values array

    public void deckCreate() {
        Suits[] suits = Suits.values();// Unicode String[] suits = {"\u2665", "\u2666", "\u2663", "\u2660"}
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

// Building the deck using a nested for loop - creating each card for each suit
// For each loop =  every string item called suit in the suits array we must iterate and build a new card - runs 4 times
// Each symbol & value is then added to the suit

        for (Suits suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                cardDeck.add(new Card(suit, symbols[i], value[i]));
            }
        }
    }

    // Allows main to access the deck
    public ArrayList<Card> getDeck() {
        return cardDeck;
    }

    // Allows the card to be printed
    public void printDeck() {
        for (Card card : cardDeck) {
            System.out.println(card);
        }
    }

    // Allows the main to get the "Snap Name"
    public String getName() {
        return name;

    }

    // Stage 2 - deal card method
// Fairly self-explanatory, getting the first card of the deck and then removing
// it from the deck so it can no longer be used in the game. Subsequently returning the first card drawn
// from the deck
    public Card dealCard() {
        Card firstCard = cardDeck.get(0);
        cardDeck.remove(0);
        return firstCard;
    }

    ;


    // Using a comparator to sort the deck - how do we sort the two objects
    // Then sort by value of the card

    public void sortDeckIntoSuits() {
        cardDeck.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getValue));
    }

    // Sort deck in number order - similar to the above method
    public void sortDeckByValue() {
        cardDeck.sort((Comparator.comparing(Card::getValue)));
    }

    // Shuffle Deck Method
    // Collections.shuffle randomly reorders the deck

    public void shuffleDeck() {
        Collections.shuffle(cardDeck);
    }
}
