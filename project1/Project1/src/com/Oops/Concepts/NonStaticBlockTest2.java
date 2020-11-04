package com.Oops.Concepts;

class B {
	private int x, y, z;

	B() {
		this.x = 100;
		this.y = 200;
	}

	{
		this.z = 300;
	}

	B(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void get() {
		System.out.println("x= " + this.x + " y= " + this.y + " z = " + this.z);
	}
}

public class NonStaticBlockTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.get();
		B b2 = new B(1000, 2000);
		b2.get();

	}

}
