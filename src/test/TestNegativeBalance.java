package test;

import game.Balance;

public class TestNegativeBalance {

	public static void main(String[] args) {
		Balance Balance = new Balance();

		Balance.withdraw(1500);

		System.out.println(Balance.getBalance());
		
		Balance.deposit(50050);
		
		System.out.println(Balance.getBalance());
		
		Balance.deposit(1000);
		
		System.out.println(Balance.getBalance());
			
	}

}
