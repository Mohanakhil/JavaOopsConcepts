package com.Oops.Concepts;

class Time {
	private int hh;
	private int mm;
	private int ss;

	void setHH(int h) {
		this.hh = h;
	}

	void setMM(int m) {
		this.mm = m;
	}

	void setSS(int s) {
		this.ss = s;
	}

	void setTime(int h, int m, int s) {
		this.hh = h;
		this.mm = m;
		this.ss = s;
	}

	void getTime() {
		System.out.println("time is " + hh + ":" + mm + ":" + ss);
	}
}

public class MethodOverloadingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		Time t2 = new Time();
		t1.setHH(13);
		t1.setMM(49);
		t1.setSS(59);
		t1.getTime();
		t2.setTime(14, 50, 58);
		t2.getTime();
	}

}
