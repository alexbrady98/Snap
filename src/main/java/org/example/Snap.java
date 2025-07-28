package org.example;


import org.example.Card;
import org.example.CardGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame {
    private final Player player1;
    private final Player player2;

    // Card constructor for Snap - sorted methods and shuffle deck
    public Snap(String name, Player player1, Player player2){
        super(name);
        this.player1 = player1;
        this.player2 = player2;
    }



    // Scanner to be able to detect user input to start the game enter
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Snap - hope you enjoy!");
        System.out.println("Press the [Enter] key to start the game and draw a card. If the card matches, type Snap before the computer!");
        System.out.println("Type exit and [Enter] to quit the game.");


        shuffleDeck();
        dealCardsToPlayers();

        Card previousCard = null;
        boolean playerOneTurn = true;

        // When there are cards in the deck the game can continue
        // Scanner reads user input
        // Looping through cards in deck untill there is nothing in the deck
        // Get deck of the cards that are remaining
        while (player1.hadCards() && player2.hadCards()) {
            Player currentPlayer = playerOneTurn ? player1 : player2;

            System.out.printf("%s, Press [Enter] to draw a card...", currentPlayer.getName());
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Game Exited");
                return;
            }

            Card currentCard = currentPlayer.playTopCard();
            System.out.printf("%s draws %s%n", currentPlayer.getName(), currentCard);



            if (previousCard != null && previousCard.getSymbol().equals(currentCard.getSymbol())) {
                System.out.println("SNAP! Cards Matched" + currentCard.getSymbol());
                System.out.printf("%s, type 'snap' to win!%n", currentPlayer.getName());

               String snapInput = scanner.nextLine();
               if(snapInput.equalsIgnoreCase("snap")){
                   System.out.printf("%s wins the game! %n", currentPlayer.getName());
               } else {
                   System.out.printf("%s was too slow. The other player wins !%n", currentPlayer.getName().equals(player1.getName())? player2.getName(): player1.getName());
               }
                return;
            } // Closes if

            previousCard = currentCard;
            playerOneTurn = !playerOneTurn;

        } // Closes while


        System.out.println("No more cards left. Game Over!");
}

private void dealCardsToPlayers(){
        while(!getDeck().isEmpty()){
            if(!getDeck().isEmpty()) player1.receiveCard(dealCard());
            if (!getDeck().isEmpty()) player2.receiveCard(dealCard());
        }

    }

// Play game ends
}// Closes class

