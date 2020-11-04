package com.Oops.Concepts;

class Doctor {
	private int id;
	private String name;
	private String hospital = "xyz";

	void setDoctor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void getDoctor() {
		System.out.println("id= " + this.id + " name= " + this.name + " hospital= " + hospital);
	}
}

public class StaticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1 = new Doctor();
		d1.setDoctor(10102, "abc");
		d1.getDoctor();
	}

}
