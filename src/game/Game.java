/*
 * Game
 *
 * Version info
 *
 * Copyright notice */

package game;

import java.awt.Color;
import java.util.Set;

import desktop_codebehind.Car;
import desktop_codebehind.Car.Builder;
import desktop_resources.GUI;

public class Game {

	public static void main(String[] args) {


		// Import of 1 dicecup class and 2 player classes.
		DiceCup dicecup = new DiceCup();
		Player player1 = new Player();
		Player player2 = new Player();
//		Builder car1 = new Car.Builder();
//		Builder car2 = new Car.Builder();
		Language language = new Language();
		int fields = 0;
		

//		car1.primaryColor(Color.ORANGE);
//		car1.secondaryColor(Color.GREEN);
//		car1.typeRacecar();
//		car1.patternDotted();
//		car1.build();
//		
//		car2.primaryColor(Color.CYAN);
//		car2.secondaryColor(Color.PINK);
//		car2.typeRacecar();
//		car2.patternDotted();
//		car2.build();		
		
		// set player names from GUI input.
		player1.setName(GUI.getUserString("Please type player1's name: "));
		player2.setName(GUI.getUserString("Please type player2's name: "));

		// add players to the GUI.
		GUI.addPlayer(player1.getName(), player1.getBalance());
		GUI.addPlayer(player2.getName(), player2.getBalance());

		// declare next turn to player1. (First turn).
		Player next = player1;

		// while loop that runs until a winner is found. (win = true).
		boolean win = false;
		while (win == false)
		{
			// The end! Congratulates the winner!
			if (player1.getBalance() == 3000) {
				win = true;
				GUI.showMessage(player1.getName() + " Wins!");
			}
				
			else if (player2.getBalance() == 3000) {
				win = true;
				GUI.showMessage(player2.getName() + " Wins!");
			}
			//GUI.setCar(0, player1.getName());
			//GUI.setCar(0, player2.getName());
			// Game begins! GUI method displays 'Roll' button. 
			GUI.getUserButtonPressed("Press to roll the dice", "Roll");

			// Calls the method for a new roll, and displays it in the GUI
			dicecup.newRoll();
			GUI.setDice(dicecup.getDie1(), dicecup.getDie2());
			
			// If player1 just rolled, sets next turn to player2.
			if(next == player1) {
				next = player2;
				GUI.removeAllCars(player1.getName());
				fields = dicecup.getSum();
				GUI.setCar(fields - 1, player1.getName());
				GUI.showMessage(player1.getName() + " rolled a " + dicecup.getDie1() + " and " + dicecup.getDie2());
				
				switch (fields) {
				case 2:  player1.deposit(250);
				GUI.showMessage(language.getField1());
				break;
				case 3:  player1.withdraw(200);
				GUI.showMessage(language.getField2());
				break;
				case 4:  player1.withdraw(100);
				GUI.showMessage(language.getField3());
				break;
				case 5:  player1.withdraw(20);
				GUI.showMessage(language.getField4());
				break;
				case 6:  player1.deposit(180);
				GUI.showMessage(language.getField5());
				break;
				case 7:  
				GUI.showMessage(language.getField6());
				break;
				case 8:  player1.withdraw(70);
				GUI.showMessage(language.getField7());
				break;
				case 9:  player1.withdraw(60);
				GUI.showMessage(language.getField8());
				break;
				case 10: player1.withdraw(80);
				GUI.showMessage(language.getField9());
				next = player1;
				break;
				case 11: player1.withdraw(90);
				GUI.showMessage(language.getField10());
				break;
				case 12: player1.deposit(650);
				GUI.showMessage(language.getField11());
				break;
				}
				GUI.setBalance(player1.getName(), player1.getBalance());
				// Prints out player1's roll
				

			}
			else {
				next = player1;
				GUI.removeAllCars(player2.getName());
				fields = dicecup.getSum();
				GUI.setCar(fields - 1, player2.getName());
				GUI.showMessage(player2.getName() + " rolled a " + dicecup.getDie1() + " and " + dicecup.getDie2());
				
				switch (fields) {
				case 2:  player2.deposit(250);
				GUI.showMessage(language.getField1());
				break;
				case 3:  player2.withdraw(200);
				GUI.showMessage(language.getField2());
				break;
				case 4:  player2.withdraw(100);
				GUI.showMessage(language.getField3());
				break;
				case 5:  player2.withdraw(20);
				GUI.showMessage(language.getField4());
				break;
				case 6:  player2.deposit(180);
				GUI.showMessage(language.getField5());
				break;
				case 7:  
				GUI.showMessage(language.getField6());
				break;
				case 8:  player2.withdraw(70);
				GUI.showMessage(language.getField7());
				break;
				case 9:  player2.withdraw(60);
				GUI.showMessage(language.getField8());
				break;
				case 10: player2.withdraw(80);
				GUI.showMessage(language.getField9());
				next = player2;
				break;
				case 11: player2.withdraw(90);
				GUI.showMessage(language.getField10());
				break;
				case 12: player2.deposit(650);
				GUI.showMessage(language.getField11());
				break;
				}
				GUI.setBalance(player2.getName(), player2.getBalance());
				
				
			}

		}

	}
}
