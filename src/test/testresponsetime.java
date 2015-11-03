package test;

import desktop_resources.GUI;
import game.DiceCup;

public class testresponsetime {
	public static void main(String[] args) {
		
		DiceCup dicecup = new DiceCup();
		
		GUI.setDice(dicecup.getDie1(), dicecup.getDie2());
		
		double lStartTime = System.currentTimeMillis();
		
		dicecup.newRoll();
		GUI.setDice(dicecup.getDie1(), dicecup.getDie2());
		
		double lEndTime = System.currentTimeMillis();
		
		double difference = lEndTime - lStartTime;
		
		System.out.println("Elapsed milliseconds : " + difference);
	}

}
