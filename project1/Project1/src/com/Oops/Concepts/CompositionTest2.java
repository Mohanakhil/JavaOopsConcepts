package com.Oops.Concepts;

//assuming one to many
import java.util.Scanner;

class FoodItems {
	Scanner scan = new Scanner(System.in);
	private String name;
	private float cost;

	void setFoodItems() {
		System.out.println("enter name and cost of food");
		this.name = scan.next();
		this.cost = scan.nextFloat();
	}

	void getFoodItems() {
		System.out.println("name= " + this.name + " cost= " + this.cost);
	}
}

class Customer {
	Scanner scan = new Scanner(System.in);
	private String name;
	private String address;
	FoodItems f1 = new FoodItems();
	FoodItems f2 = new FoodItems();
	FoodItems f3 = new FoodItems();

	void setCustomer() {
		System.out.println("enter your name and address");
		this.name = scan.next();
		this.address = scan.next();
		f1.setFoodItems();
		f2.setFoodItems();
		f3.setFoodItems();
	}

	void getCustomer() {
		System.out.println("name= " + this.name + "address= " + this.address);
		f1.getFoodItems();
		f2.getFoodItems();
		f3.getFoodItems();
	}
}

public class CompositionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setCustomer();
		c1.getCustomer();
	}

}
