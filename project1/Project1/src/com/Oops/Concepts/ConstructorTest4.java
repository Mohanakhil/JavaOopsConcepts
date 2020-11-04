package com.Oops.Concepts;

class BankEmployee {
	private int id;
	private String name;
	private float salary;
	private int age;

	BankEmployee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	BankEmployee(int id, String name, int age, float salary) {
		this(id, name, age);
		this.salary = salary;
	}

	void setSalary(float salary) {
		this.salary = salary;
	}

	void getBankEmployee() {
		System.out.println("name= " + this.name + " id= " + this.id + " age= " + this.age + " salary= " + this.salary);

	}
}

public class ConstructorTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankEmployee b1 = new BankEmployee(101, "abc", 22, 50000f);
		b1.getBankEmployee();
	}

}
