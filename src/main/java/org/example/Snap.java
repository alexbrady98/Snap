package org.example;


import java.util.Scanner;

public class Snap extends CardGame{

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
}

//

}
