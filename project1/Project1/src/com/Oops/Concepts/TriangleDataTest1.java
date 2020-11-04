package com.Oops.Concepts;

import java.util.Scanner;

class Triangle {
	private float base;
	private float height;

	void setBase(float base) {
		this.base = base;
	}

	void setHeight(float height) {
		this.height = height;
	}

	float getAreaOfTriangle() {
		return (float) 0.5 * (this.base) * (this.height);

	}

}

public class TriangleDataTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		System.out.println("enter base and  height");
		Scanner scan = new Scanner(System.in);
		float base = scan.nextFloat();
		float height = scan.nextFloat();
		t1.setBase(base);
		t1.setHeight(height);
		float area = t1.getAreaOfTriangle();
		System.out.println("area of triangel= " + area);
	}

}
