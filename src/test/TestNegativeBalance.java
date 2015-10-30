package test;

import game.Balance;

public class TestNegativeBalance {

	public static void main(String[] args) {
		Balance Balance = new Balance();
		
		
		// Deposit test 10 times with random numbers
		for (int i=0; i < 10; i++)
		{
			int dep = (int)Math.ceil(Math.random()*10000);
			Balance.withdraw(3000);
			Balance.getBalance();
			System.out.println("Balance reset to 0!");
			System.out.println("Trying to deposit: " + dep);
			Balance.deposit(dep);
			System.out.println("Balance is now: " + Balance.getBalance());
		}

		// Withdraw test 10 times with random numbers
		for (int i=0; i < 10; i++)
		{
			int wit = (int)Math.ceil(Math.random()*10000);
			Balance.deposit(3000);
			Balance.getBalance();
			System.out.println("Balance reset to 3000!");
			System.out.println("Trying to withdraw: " + wit);
			Balance.withdraw(wit);
			System.out.println("Balance is now: " + Balance.getBalance());
		}		
	}

}
