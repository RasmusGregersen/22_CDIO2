package test;

import static org.junit.Assert.*;
import game.*;

import org.junit.Test;

public class JunitTests {
	
	// Tests start balance to be 1000
	@Test
	public void Startbalance() {
		Balance balance = new Balance();
		int result = balance.getBalance();
		assertEquals(1000, result);
	
	// Tests withdraw method
	}
	@Test
	public void Withdraw500() {
		Balance balance = new Balance();
		balance.withdraw(500);
		int result = balance.getBalance();
		assertEquals(500, result);
	}
	
	// Tests withdraw method can't return less than 0
	@Test
	public void Withdraw5000() {
		Balance balance = new Balance();
		balance.withdraw(5000);
		int result = balance.getBalance();
		assertEquals(0, result);
	}
	
	// Tests deposit method
	@Test
	public void Deposit500() {
		Balance balance = new Balance();
		balance.deposit(500);
		int result = balance.getBalance();
		assertEquals(1500, result);
	}
	
	// Tests deposit method can't return more than 3000
	@Test
	public void Deposit5000() {
		Balance balance = new Balance();
		balance.deposit(5000);
		int result = balance.getBalance();
		assertEquals(3000, result);
	}
	
	// Tests getName() method
	@Test
	public void StartPlayerName() {
		Player player = new Player();
		String result = player.getName();
		assertEquals(null, result);
	}
	
	// tests setName() method
	@Test
	public void SetPlayerName() {
		Player player = new Player();
		player.setName("Rasmus");
		String result = player.getName();
		assertEquals("Rasmus", result);
	}
	
	// Tests newroll() and getters in DiceCup.
	@Test
	public void GetSum() {
		DiceCup dicecup = new DiceCup();
		dicecup.newRoll();
		int result = dicecup.getDie1() + dicecup.getDie2(); 
		assertEquals(dicecup.getSum(), result);
	}
	
}