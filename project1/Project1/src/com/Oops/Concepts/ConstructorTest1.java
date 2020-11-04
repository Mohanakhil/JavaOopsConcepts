package com.Oops.Concepts;

import java.util.Scanner;

class Rhombus {
	private int d1, d2;

	Rhombus(int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	void getArea() {
		System.out.println("area of rhombus  = " + 0.5 * this.d1 * this.d2);
	}
}

public class ConstructorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter length of diagnols");
		Scanner scan = new Scanner(System.in);
		int d1 = scan.nextInt();
		int d2 = scan.nextInt();
		Rhombus r1 = new Rhombus(d1, d2);
		r1.getArea();
	}

}
