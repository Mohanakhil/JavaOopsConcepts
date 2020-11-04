package com.Oops.Concepts;

class Practical1 {
	// non static constructor
	{
		System.out.println("inside 1st nonstatic block");
	}

	Practical1() {
		System.out.println("inside non parameterized constructor ");
	}

	void m1() {
		System.out.println("inside nonstatic m1");
	}

	{
		System.out.println("inside 2nd nonstatic block");
	}

	Practical1(int x) {
		System.out.println("inside 1 parameterized constructor");
	}

}

public class NonStaticBlockTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practical1 p1 = new Practical1();
		Practical1 p2 = new Practical1(10);
	}

}
