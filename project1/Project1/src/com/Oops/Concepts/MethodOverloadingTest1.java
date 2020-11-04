package com.Oops.Concepts;

class Sai {
	void akhil1() {
		System.out.println("inside akhil1 of class Sai with 0 parameters");
	}

	void akhil2(int x) {
		System.out.println("inside akhil2 of class Sai with 1 parameter");
	}

	void akhil3(int x, int y) {
		System.out.println("insde akhil3 of class Sai  with  2 parameters");
	}

}

public class MethodOverloadingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sai s1 = new Sai();
		s1.akhil1();
		s1.akhil2(10);
		s1.akhil3(1, 2);

	}

}
