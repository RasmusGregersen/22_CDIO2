/*
* Player
*
* Version info
*
* Copyright notice */

package game;


public class Player {
	private String name; // player name
	private int fieldloc = 1; // field location
	private Balance balance = new Balance();
	
	
	public int getBalance() {
		return balance.getBalance();
	}
	
	public void setBalance(int i) {
		balance.setBalance(i);
	}
	
	// method to return player name.
	public String getName()	{
		return name;
	}
	// method to set player name.
	public void setName(String name) {
		this.name = name;
	}
	
	// method to return players fieldlocation.
	public int getFieldloc() {
		return fieldloc;
	}
	
	// method to return players fieldlocation.
	public void setFieldloc(int fieldloc) {
		this.fieldloc = fieldloc;
	}
	
	
	
}
