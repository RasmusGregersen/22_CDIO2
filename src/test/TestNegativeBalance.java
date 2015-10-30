package test;

import game.Balance;

public class TestNegativeBalance {

	public static void main(String[] args) {
		Balance Balance = new Balance();

		Balance.setBalance(0);
		
		Balance.withdraw(1500);

		System.out.println("We set the balance to 0, and try to withdraw 1500 from it. If our method works the Current balance should be equal to 0, " + "Current balance = " + Balance.getBalance());
		
		Balance.setBalance(0);
		
		Balance.deposit(50000);
		
		System.out.println("We set the balance to 0, and try to deposit 50000 to it. If our method works the Current balance should not be greater than 3000 which is the winning condition, " + "Current balance = " + Balance.getBalance());
		
		Balance.setBalance(0);
		
		Balance.deposit(1000);
		
		System.out.println("We set the balance to 0, and try to deposit 1000 to it. If our method works the Current balance should be equal to 1000, " + "Current balance = " + Balance.getBalance());
			
	}

}
