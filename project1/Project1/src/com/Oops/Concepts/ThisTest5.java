package com.Oops.Concepts;

import java.util.Scanner;

class Account {
	private int id;
	private String name;
	private float realbalance;
	private static float minbalance = 6000f;

	// min balance is common property to all accounts so it is declared
	// as static
	void setAccount(int id, String name, float realbalance) {
		this.id = id;
		this.name = name;
		this.realbalance = realbalance;
	}

	void getAccount() {
		System.out.println("id= " + this.id + " name= " + this.name + " realbalance= " + this.realbalance);
	}

	void deposit(int cash) {
		this.realbalance = this.realbalance + cash;
		System.out.println("money is deposited ");
		this.getAccount();
	}

	void withdraw(int cash) {
		if ((this.realbalance - cash) < minbalance)
			System.out.println("balance insufficient");
		else {
			System.out.println("money is withdrawn ");
			this.realbalance = this.realbalance - cash;
			this.getAccount();

		}
	}
}

public class ThisTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Account a1 = new Account();
		a1.setAccount(101, "sai", 10000f);
		a1.getAccount();
		System.out.println("enter true for depsit and false for withdraw");
		boolean b = scan.nextBoolean();
		if (b == true) {
			System.out.println("enter cash to deposit");
			int cash = scan.nextInt();
			a1.deposit(cash);
		} else {
			System.out.println("enter cash to withdraw");
			int cash = scan.nextInt();
			a1.withdraw(cash);
		}

	}

}
