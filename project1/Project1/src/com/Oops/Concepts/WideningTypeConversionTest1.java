package com.Oops.Concepts;

class BroaderType {
	void m1(double x) {
		System.out.println("inside m1 of double parameter");

	}
}

public class WideningTypeConversionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BroaderType b1 = new BroaderType();
		b1.m1('a');
		b1.m1(100);
		b1.m1(100L);
		b1.m1(100f);
		b1.m1(100.2);

	}

}
