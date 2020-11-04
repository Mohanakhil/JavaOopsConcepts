package com.Oops.Concepts;

import java.util.Scanner;

class Calculator {
	private float n1;
	private float n2;

	void setCalculator(float n1, float n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	float getAdd() {
		return n1 + n2;
	}

	float getSub() {
		return n1 - n2;
	}

	float getMultiply() {
		return n1 * n2;
	}

	float getDivision() {
		return n1 / n2;
	}
}

public class CalculatorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 nos");
		float n1 = scan.nextFloat();
		float n2 = scan.nextFloat();
		c1.setCalculator(n1, n2);
		System.out.println("+,-,*,/");
		char symbol = scan.next().charAt(0);
		switch (symbol) {
		case '+' -> System.out.println(c1.getAdd());
		case '-' -> System.out.println(c1.getSub());
		case '*' -> System.out.println(c1.getMultiply());
		case '/' -> System.out.println(c1.getDivision());
		}
	}
}
