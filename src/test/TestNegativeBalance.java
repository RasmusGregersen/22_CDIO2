package test;

import game.Balance;

public class TestNegativeBalance {

	public static void main(String[] args) {
		Balance Balance = new Balance();

		Balance.setBalance(-350);

		System.out.println(Balance.getBalance());
		
		Balance.setBalance(50050);
		
		System.out.println(Balance.getBalance());
		
		Balance.setBalance(2000);
		
		System.out.println(Balance.getBalance());
			
	}

}
