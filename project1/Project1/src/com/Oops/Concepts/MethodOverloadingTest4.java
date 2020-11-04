package com.Oops.Concepts;

class Maximum {
	int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	float max(float x, float y) {
		if (x > y)
			return x;
		else
			return y;
	}

}

public class MethodOverloadingTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum m1 = new Maximum();
		System.out.println(m1.max(10, 20));
		System.out.println(m1.max(20.2f, 20.3f));
	}

}
