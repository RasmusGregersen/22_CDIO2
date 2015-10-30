package game;

public class Balance {

	private int balance = 1000;

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void withdraw(int balance) {
		this.balance = this.balance - balance;
	}
	public void deposit(int balance) {
		this.balance = this.balance + balance;

	}
	public int getBalance()	{
		if (balance>3000)
			setBalance(3000);

		else if (balance<0)
			setBalance(0);

		return balance;
	}
}