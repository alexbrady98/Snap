package org.example;


import org.example.Card;
import org.example.CardGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {

    // Card constructor for Snap - sorted methods and shuffle deck
    public Snap(String name){
        super(name);
    }

    // Scanner to be able to detect user input to start the game enter
    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Snap - hope you enjoy!");
        System.out.println("Press the [Enter] key to start the game and draw a card. If the card matches, type Snap before the computer!");
        System.out.println("Type exit and [Enter] to quit the game.");

// Randomise all cards before the begging of the game
        shuffleDeck();


// Storing the last card which allows comparison
// Start with nothing as no card has been drawn
        Card previousCard = null;

        // When there are cards in the deck the game can continue
        // Scanner reads user input
        // Looping through cards in deck untill there is nothing in the deck
        // Get deck of the cards that are remaining
        while(getDeck().size()>0) {
            System.out.println("Press [Enter] to draw a card...");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Game Exited");
                return;
            } // Closes if

            Card currentCard = dealCard();
            System.out.println("You drew: " + currentCard);

            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("SNAP! You matched two cards: " + currentCard.getSymbol());
                System.out.println("Congratulations, you are a winner!");
                return;
            } // Closes if


            previousCard = currentCard;


        } // Closes while


        System.out.println("No more cards left. Game Over!");
} // Play game ends
}// Closes class

