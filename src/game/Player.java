/*
* Player
*
* Version info
*
* Copyright notice */

package game;


public class Player {
	private String name; // player name
	private Balance balance = new Balance();
	
	
	public int getBalance() {
		return balance.getBalance();
	}
	
	public void setBalance(int i) {
		this.setBalance(i);
	}
	
	// method to return player name.
	public String getName()	{
		return name;
	}
	// method to set player name.
	public void setName(String name) {
		this.name = name;
	}
	
}
