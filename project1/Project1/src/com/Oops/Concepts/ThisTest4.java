package com.Oops.Concepts;

class A1 {
	void m1() {
		System.out.println(this);
	}
}

public class ThisTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.m1();
		System.out.println(a);// this represents same as object address
		A1 b = new A1();
		System.out.println(b);
		b.m1();
	}

}
