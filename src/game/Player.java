/*
* Player
*
* Version info
*
* Copyright notice */

package game;

public class Player {
	private boolean doublesix = false; // counter for doublesix
	private String name; // player name
	private int point = 0; // player points, starting in 0.
	
	// method to return doublesix counter.
	public boolean getDoublesix() {
		return doublesix;
	}
	// method to return player name.
	public String getName()	{
		return name;
	}
	// method to return player point.
	public int getPoint() {
		return point;
	}
	// method to set doublesix counter.
	public void setDoublesix(boolean doublesix) {
		this.doublesix = doublesix;
	}
	// method to set player name.
	public void setName(String name) {
		this.name = name;
	}
	// method to set player point.
	public void setPoint(int point) {
		this.point = point;
	}
}
