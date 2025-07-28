package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Calling Snap and starting the console allowing input

Player player1 = new Player("Player 1");
Player player2 = new Player("Player 2");

Snap game = new Snap("Snap", player1, player2);
game.playGame();

// Need to implement a play again function
// Need to add two player
// Need to add a timer and user input for snap

    }
}