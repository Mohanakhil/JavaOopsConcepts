package com.Oops.Concepts;

class A {
	void method1() {
		System.out.println("inside m1 of class A");
	}

	void method2(int x) {
		this.method1();
		System.out.println("inside m2 of class A");

	}
}

public class ThisTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.method2(10);
	}

}
