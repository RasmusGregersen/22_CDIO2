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
				
				// Checks if any players have rolled two equal dice, and gives extra turn.
				if(dicecup.getEqual() == true) {
					next = player1;
					// Checks if any players have 40 points. (Win condition)
					if (player1.getPoint() >= 40) {
						if (dicecup.getDie1() != 1) {
							win = true;
							player1.setPoint(41);
						}
					}
				}
				
				// Updates player1's points with the new roll.
				player1.setPoint(player1.getPoint() + dicecup.getSum());
				
				// Dobbelt 1
				if (dicecup.getDie1()  == 1 && dicecup.getDie2() == 1) {
					player1.setPoint(0);
					GUI.setBalance(player1.getName(), player1.getPoint());
				}
				// Checks if player1's points are more than 40, and corrects it to 40.
				if (player1.getPoint() > 40)
					player1.setPoint(40);
				
				// Updates points in GUI
				GUI.setBalance(player1.getName(), player1.getPoint());
				
				// Prints out player1's roll
				GUI.showMessage(player1.getName() + " rolled a " + dicecup.getDie1() + " and " + dicecup.getDie2());
				
				// Checks for pair of six (SUM = 12). 
				if (dicecup.getSum() == 12) {
					if (player1.getDoublesix() == true) {
						// Win condition
						player1.setPoint(41);
						win = true;
					}
					else player1.setDoublesix(true);
				}
				else player1.setDoublesix(false);
				
			}
			// Repeats same if/else for player 2.
			else {
				next = player1;
				
				if(dicecup.getEqual() == true) {
					next = player2;
					
					if (player2.getPoint() >= 40) {
						if (dicecup.getDie1() != 1) {
							win = true;
							player2.setPoint(41);
						}
					}
				}
			
				player2.setPoint(player2.getPoint() + dicecup.getSum());
				
				if (dicecup.getDie1()  == 1 && dicecup.getDie2() == 1) {
					player2.setPoint(0);
					GUI.setBalance(player2.getName(), player2.getPoint());
				}
				
				if (player2.getPoint() > 40)
					player2.setPoint(40);
				GUI.setBalance(player2.getName(), player2.getPoint());
				GUI.showMessage(player2.getName() + " rolled a " + dicecup.getDie1() + " and " + dicecup.getDie2());

				if (dicecup.getSum() == 12) {
					if (player2.getDoublesix() == true) {
						player2.setPoint(41);
						win = true;
					}
					else player2.setDoublesix(true);
				}
				else player2.setDoublesix(false);

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
