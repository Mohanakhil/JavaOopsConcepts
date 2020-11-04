package com.Oops.Concepts;

import java.util.Scanner;

class Date {
	private int dd, mm, yy;

	Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	void getDate() {
		System.out.println(this.dd + "/" + this.mm + "/" + this.yy);
	}

	void setDay(int dd) {
		this.dd = dd;
		this.getDate();
	}

	void setMonth(int mm) {
		this.mm = mm;
		this.getDate();
	}

	void setYear(int yy) {
		this.yy = yy;
		this.getDate();
	}
}

public class ConstructorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Date d1 = new Date(04, 11, 20);
		d1.getDate();
		System.out.println("enter \n1-daymodify\n2-monthmodify\n3-yearmodify");
		byte option = scan.nextByte();
		switch (option) {
		case 1 -> {
			System.out.println("enter day");
			int dd = scan.nextInt();
			d1.setDay(dd);
		}
		case 2 -> {
			System.out.println("enter month");
			int mm = scan.nextInt();
			d1.setMonth(mm);
		}
		case 3 -> {
			System.out.println("enter year");
			int yy = scan.nextInt();
			d1.setYear(yy);
		}
		}
	}

}
