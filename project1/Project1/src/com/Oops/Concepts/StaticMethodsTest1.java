package com.Oops.Concepts;

class CloudAccount {
	private float storagecapacity;
	private int id;
	private String name;
	private static float freecapacity = 20f;// assuming 20gb storage is free

	void setCloud(float storagecapacity, int id, String name) {
		this.storagecapacity = storagecapacity;
		this.id = id;
		this.name = name;
	}

	void getCloud() {
		System.out.println("balance storage= " + this.storagecapacity + "id= " + this.id + "name= " + this.name);

	}

	void setFree(float f) {
		freecapacity = f;
	}

	void getFree() {
		System.out.println("free storage capacity=  " + freecapacity);
	}
}

public class StaticMethodsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloudAccount c1 = new CloudAccount();
		c1.setCloud(200, 592, "sai");
		CloudAccount c2 = new CloudAccount();
		c2.setCloud(600, 593, "abc");
		c1.setFree(15);
		c2.getFree();// property common to all objects
		c1.getCloud();
		c2.getCloud();

	}

}
