package com.Oops.Concepts;

class Business {
	private String name;
	private String gstid;

	void setName(String name) {
		this.name = name;
	}

	void setGstid(String name, String gstid) {
		this.setName(name);
		this.gstid = gstid;
	}

	void getName() {
		System.out.println("name = " + this.name);
	}

	void getGstid() {
		this.getName();// calling non static method with object
		System.out.println("gstid= " + this.gstid);
	}
}

public class ThisTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Business b1 = new Business();
		b1.setGstid("ABC", "10ABCDEF23");
		b1.getGstid();
	}

}
