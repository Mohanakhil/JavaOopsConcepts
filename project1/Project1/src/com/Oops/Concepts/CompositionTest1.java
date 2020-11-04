package com.Oops.Concepts;

import java.util.Scanner;

class OS// assuming one to one relation
{
	private String name;
	private float cost;
	Scanner scan = new Scanner(System.in);

	void setOS() {
		System.out.println("enter name and cost of os");
		this.name = scan.next();
		this.cost = scan.nextFloat();
	}

	void getOS() {
		System.out.println("name of os= " + this.name + " cost = " + this.cost);
	}
}

class Computer {
	OS o1 = new OS();
	Scanner scan = new Scanner(System.in);
	private String companyname;

	void setComputer() {
		System.out.println("enter name of company");
		this.companyname = scan.next();
	}

	void getComputer() {
		System.out.println("name= " + this.companyname);
	}
}

public class CompositionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer();
		c1.setComputer();
		c1.getComputer();
		c1.o1.setOS();
		c1.o1.getOS();
	}

}
