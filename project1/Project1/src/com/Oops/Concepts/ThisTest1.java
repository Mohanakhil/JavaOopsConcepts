package com.Oops.Concepts;

class Point {
	private int x;
	private int y;

	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void getPoint() {
		System.out.println(x + "," + y);
	}
}

public class ThisTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setPoint(10, 20);
		p1.getPoint();

	}

}
