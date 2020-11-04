package com.Oops.Concepts;

class Employee {
	private int empno;
	private String ename;
	private float salary;

	void setEmployee(int empno, String ename, float salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	void getEmployee() {
		System.out.println("name= " + ename + " empno= " + empno + " salary= " + salary);
	}
}

public class MethWithoutReturnTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();

		e1.setEmployee(101, "sai", 50000f);
		e1.getEmployee();
	}

}
