/*
 * Game
 *
 * Version info
 *
 * Copyright notice */

package game;

import java.util.Set;

import desktop_resources.GUI;

public class Game {

	public static void main(String[] args) {
		// Import of 1 dicecup class and 2 player classes.
		DiceCup dicecup = new DiceCup();
		Player player1 = new Player();
		Player player2 = new Player();
		
		// set player names from GUI input.
		player1.setName(GUI.getUserString("Please type player1's name: "));
		player2.setName(GUI.getUserString("Please type player2's name: "));
		
		// add players to the GUI.
		GUI.addPlayer(player1.getName(), player1.getPoint());
		GUI.addPlayer(player2.getName(), player2.getPoint());
		
		// declare next turn to player1. (First turn).
		Player next = player1;

		// while loop that runs until a winner is found. (win = true).
		boolean win = false;
		while (win == false)
		{
			// Game begins! GUI method displays 'Roll' button. 
			GUI.getUserButtonPressed("Press to roll the dice", "Roll");
			
			// Calls the method for a new roll, and displays it in the GUI
			dicecup.newRoll();
			GUI.setDice(dicecup.getDie1(), dicecup.getDie2());

			// If player1 just rolled, sets next turn to player2.
			if(next == player1) {
				next = player2; 
				
				// Prints out player1's roll
				GUI.showMessage(player1.getName() + " rolled a " + dicecup.getDie1() + " and " + dicecup.getDie2());
				
				
			}
			// Repeats same if/else for player 2.
			else {
				next = player1;
				
				GUI.showMessage(player2.getName() + " rolled a " + dicecup.getDie1() + " and " + dicecup.getDie2());

			}

		}

		// The end! Congratulates the winner!
		if (player1.getPoint() > player2.getPoint())
		{
			GUI.showMessage(player1.getName() + " Wins!");
		}
		else GUI.showMessage(player2.getName() + " Wins!");

	}
}
