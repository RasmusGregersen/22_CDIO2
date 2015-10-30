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
		balance.setBalance(i);
	}
	public void withdraw(int i) {
		balance.withdraw(i);
	}
	public void deposit(int i) {
		balance.deposit(i);
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
