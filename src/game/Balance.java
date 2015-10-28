package game;

public class Balance {

	private int balance = 1000;

	public void setBalance(int balance) {

		if (balance<0)
			setBalance(0);

		else if (balance>3000) 
			setBalance(3000);

		else
			this.balance = balance;
	}
	public int getBalance()	{
		return balance;
	}

}
